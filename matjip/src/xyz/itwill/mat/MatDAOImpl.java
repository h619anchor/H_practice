package xyz.itwill.mat;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class MatDAOImpl extends MacConDAO implements MatDAO{
   
   
   //싱글턴
   private static MatDAOImpl _dao;
   
   private MatDAOImpl() {
      
   }
   
   static {
      _dao=new MatDAOImpl();
   }
   
   public static MatDAOImpl getDAO() {
      return _dao;
   }
   
   
   
   
   
   //삽입
   @Override
   public String instertMatShop(MatDTO mat) {
      Connection con=null;
      PreparedStatement pstmt=null;
      
      try {
         con=getConnection();
         
         String sql="insert into shop values(?,?,?,?)";
         pstmt=con.prepareStatement(sql);
         pstmt.setString(1, mat.getName());
         pstmt.setString(2, mat.getLocation());
         pstmt.setString(3, mat.getCategory());
         pstmt.setString(4, mat.getReview());
         
         pstmt.executeUpdate();
         
      }catch (SQLException e) {
         System.out.println("insertMatShop 메소드 SQL 오류 "+e.getMessage());
      }finally {
         close(con,pstmt);
      }
      return mat.getName();
   }

   @Override
   public String instertMatInfo(MatDTO mat) {
      Connection con=null;
      PreparedStatement pstmt=null;
      
      try {
         con=getConnection();
         
         String sql="insert into Info values(?,?,?,?,?)";
         pstmt=con.prepareStatement(sql);
         pstmt.setString(1, mat.getName());
         pstmt.setString(2, mat.getAddress());
         pstmt.setString(3, mat.getMenu());
         pstmt.setString(4, mat.getPrice());
         pstmt.setString(5, mat.getPhone());
         
         pstmt.executeUpdate();
         
      }catch (SQLException e) {
         System.out.println("insertMatInfo 메소드 SQL 오류 "+e.getMessage());
      }finally {
         close(con,pstmt);
      }
      return mat.getName();
   }
   
   
   

   
   
   
   
   //변경
   @Override
   public String updateMatShop(MatDTO mat) {
      Connection con=null;
      PreparedStatement pstmt=null;
      
      try {
         con=getConnection();
         
         String sql="update shop set location=?,category=?,review=? where name=? order by shop.name";
         pstmt=con.prepareStatement(sql);
         pstmt.setString(1, mat.getLocation());
         pstmt.setString(2, mat.getCategory());
         pstmt.setString(3, mat.getReview());
         pstmt.setString(4, mat.getName());
         
         pstmt.executeUpdate();
         
      }catch (SQLException e) {
         System.out.println("updateMatShop 메소드 SQL 오류 "+e.getMessage());
      }finally {
         close(con,pstmt);
      }
      return mat.getName();
   }

   @Override
   public String updateMatInfo(MatDTO mat) {
      Connection con=null;
      PreparedStatement pstmt=null;
      
      try {
         con=getConnection();
         
         String sql="update info set menu=?,address=?,price=?,phone=? where name=? order by shop.name";
         pstmt=con.prepareStatement(sql);
         pstmt.setString(1, mat.getMenu());
         pstmt.setString(2, mat.getAddress());
         pstmt.setString(3, mat.getPrice());
         pstmt.setString(4, mat.getPhone());
         pstmt.setString(5, mat.getName());
         
         pstmt.executeUpdate();
         
      }catch (SQLException e) {
         System.out.println("updateMatShop 메소드 SQL 오류 "+e.getMessage());
      }finally {
         close(con,pstmt);
      }
      return mat.getName();
   }
   public MatDTO updateget(String get) {
         Connection con=null;
         PreparedStatement pstmt=null;
         ResultSet rs=null;
         MatDTO mat=new MatDTO();
         
         try {
            con=getConnection();
            
            String sql="select shop.name,address,phone,menu,price,review,category,location from shop join info on shop.name=info.name where shop.name=? order by shop.name";
            pstmt=con.prepareStatement(sql);
            pstmt.setString(1, get);
            
            rs=pstmt.executeQuery();
            
            rs.next();
               
               mat.setName(rs.getString("name"));
               mat.setAddress(rs.getString("address"));
               mat.setPhone(rs.getString("phone"));
               mat.setMenu(rs.getString("menu"));
               mat.setPrice(rs.getString("price"));
               mat.setReview(rs.getString("review"));
               mat.setCategory(rs.getString("category"));
               mat.setLocation(rs.getString("location"));
               
            
         }catch (SQLException e) {
            return null;
         }finally {
            close(con,pstmt,rs);
         }
         return mat;
         
         
      }
   
   
   
   
   
   
   
   //제거
   @Override
   public String deleteMatShop(String name) {
      Connection con=null;
      PreparedStatement pstmt=null;
      
      try {
         con=getConnection();
         
         String sql="delete from shop where name=?";
         pstmt=con.prepareStatement(sql);
         pstmt.setString(1, name);
         
         
         pstmt.executeUpdate();
         
      }catch (SQLException e) {
         System.out.println("updateMatShop 메소드 SQL 오류 "+e.getMessage());
      }finally {
         close(con,pstmt);
      }
      return name;
   }

   @Override
   public String deleteMatInfo(String name) {
      Connection con=null;
      PreparedStatement pstmt=null;
      
      try {
         con=getConnection();
         
         String sql="delete from info where name=?";
         pstmt=con.prepareStatement(sql);
         pstmt.setString(1, name);
         
         
         pstmt.executeUpdate();
         
      }catch (SQLException e) {
         System.out.println("updateMatShop 메소드 SQL 오류 "+e.getMessage());
      }finally {
         close(con,pstmt);
      }
      return name;
   }

   
   
   
   
   
   //상세정보
   @Override
   public List<MatDTO> info(String info) {
      Connection con=null;
      PreparedStatement pstmt=null;
      ResultSet rs=null;
      List<MatDTO> MatList=new ArrayList<>();
      
      try {
         con=getConnection();
         
         String sql="select shop.name,address,phone,menu,price,review,category,location from shop join info on shop.name=info.name where shop.name=?";
         pstmt=con.prepareStatement(sql);
         pstmt.setString(1, info);
         
         rs=pstmt.executeQuery();
         
         while(rs.next()) {
            MatDTO mat=new MatDTO();
            mat.setName(rs.getString("name"));
            mat.setAddress(rs.getString("address"));
            mat.setPhone(rs.getString("phone"));
            mat.setMenu(rs.getString("menu"));
            mat.setPrice(rs.getString("price"));
            mat.setReview(rs.getString("review"));
            mat.setCategory(rs.getString("category"));
            mat.setLocation(rs.getString("location"));
            
            MatList.add(mat);
         }
      }catch (SQLException e) {
         System.out.println("selectCategory 메소드 SQL 오류 "+e.getMessage());
      }finally {
         close(con,pstmt);
      }
      return MatList;
      
      
   }
   
   
   
   
   
   
   
   
   
   //통합 검색
   @Override
   public List<MatDTO> selectSearch(String search) {
      Connection con=null;
      PreparedStatement pstmt=null;
      ResultSet rs=null;
      List<MatDTO> MatList=new ArrayList<>();
      
      try {
         con=getConnection();
         
         String sql="select * from shop join info on shop.name=info.name where shop.name like '%'||?||'%' or location like '%'||?||'%' or category like '%'||?||'%' or review like '%'||?||'%' or  menu like '%'||?||'%' order by shop.name" ;
         pstmt=con.prepareStatement(sql);
         pstmt.setString(1, search);
         pstmt.setString(2, search);
         pstmt.setString(3, search);
         pstmt.setString(4, search);
         pstmt.setString(5, search);

         
         rs=pstmt.executeQuery();
         
         
         while(rs.next()) {
            
            
            
            MatDTO mat=new MatDTO();
            mat.setCategory(rs.getString("category"));
            mat.setName(rs.getString("name"));
            mat.setMenu(rs.getString("menu"));
            mat.setLocation(rs.getString("location"));
            mat.setReview(rs.getString("review"));

            
            MatList.add(mat);
         }
      }catch (SQLException e) {
         System.out.println("selectSearch 메소드 SQL 오류 "+e.getMessage());
      }finally {
         close(con,pstmt);
      }
      return MatList;
   }
   
   
   
   
   
   
   //분류 검색
   @Override
   public List<MatDTO> selectCategory(String category) {
      Connection con=null;
      PreparedStatement pstmt=null;
      ResultSet rs=null;
      List<MatDTO> MatList=new ArrayList<>();
      
      try {
         con=getConnection();
         
         String sql="select * from shop join info on shop.name=info.name where category=? order by shop.name";
         pstmt=con.prepareStatement(sql);
         pstmt.setString(1, category);
         
         rs=pstmt.executeQuery();
         
         while(rs.next()) {
            MatDTO mat=new MatDTO();
            mat.setName(rs.getString("name"));
            mat.setLocation(rs.getString("location"));
            mat.setCategory(rs.getString("category"));
            mat.setReview(rs.getString("review"));
            mat.setAddress(rs.getString("address"));
            mat.setMenu(rs.getString("menu"));
            mat.setPrice(rs.getString("price"));
            mat.setPhone(rs.getString("phone"));
            
            MatList.add(mat);
         }
      }catch (SQLException e) {
         System.out.println("selectCategory 메소드 SQL 오류 "+e.getMessage());
      }finally {
         close(con,pstmt);
      }
      return MatList;
   }

   
   
   
   //지역검색
   @Override
   public List<MatDTO> selectLocation(String location) {
      Connection con=null;
      PreparedStatement pstmt=null;
      ResultSet rs=null;
      List<MatDTO> MatList=new ArrayList<>();
      
      try {
         con=getConnection();
         
         String sql="select * from shop join info on shop.name=info.name where location=? order by shop.name";
         pstmt=con.prepareStatement(sql);
         pstmt.setString(1, location);
         
         rs=pstmt.executeQuery();
         
         while(rs.next()) {
            MatDTO mat=new MatDTO();
            mat.setName(rs.getString("name"));
            mat.setLocation(rs.getString("location"));
            mat.setCategory(rs.getString("category"));
            mat.setReview(rs.getString("review"));
            mat.setAddress(rs.getString("address"));
            mat.setMenu(rs.getString("menu"));
            mat.setPrice(rs.getString("price"));
            mat.setPhone(rs.getString("phone"));
            
            MatList.add(mat);
         }
      }catch (SQLException e) {
         System.out.println("selectLocation 메소드 SQL 오류 "+e.getMessage());
      }finally {
         close(con,pstmt);
      }
      return MatList;
   }

   
   
   
   


   
   //평점검색
   @Override
   public List<MatDTO> selectReview(String review) {
      Connection con=null;
      PreparedStatement pstmt=null;
      ResultSet rs=null;
      List<MatDTO> MatList=new ArrayList<>();
      
      try {
         con=getConnection();
         
         String sql="select * from shop join info on shop.name=info.name where review=? order by shop.name";
         pstmt=con.prepareStatement(sql);
         pstmt.setString(1, review);
         
         rs=pstmt.executeQuery();
         
         while(rs.next()) {
            MatDTO mat=new MatDTO();
            mat.setName(rs.getString("name"));
            mat.setLocation(rs.getString("location"));
            mat.setCategory(rs.getString("category"));
            mat.setReview(rs.getString("review"));
            mat.setAddress(rs.getString("address"));
            mat.setMenu(rs.getString("menu"));
            mat.setPrice(rs.getString("price"));
            mat.setPhone(rs.getString("phone"));
            
            MatList.add(mat);
         }
      }catch (SQLException e) {
         System.out.println("selectReview 메소드 SQL 오류 "+e.getMessage());
      }finally {
         close(con,pstmt);
      }
      return MatList;
      
   }

   
   
   
   //전체검색
   @Override
   public List<MatDTO> selectAll() {
      Connection con=null;
      PreparedStatement pstmt=null;
      ResultSet rs=null;
      List<MatDTO> MatList=new ArrayList<>();
      
      try {
         con=getConnection();
         
         String sql="select * from shop join info on shop.name=info.name order by shop.name";
         pstmt=con.prepareStatement(sql);
         
         rs=pstmt.executeQuery();
         
         while(rs.next()) {
            MatDTO mat=new MatDTO();
            mat.setName(rs.getString("name"));
            mat.setLocation(rs.getString("location"));
            mat.setCategory(rs.getString("category"));
            mat.setReview(rs.getString("review"));
            mat.setAddress(rs.getString("address"));
            mat.setMenu(rs.getString("menu"));
            mat.setPrice(rs.getString("price"));
            mat.setPhone(rs.getString("phone"));
            
            MatList.add(mat);
         }
      }catch (SQLException e) {
         System.out.println("selectAll 메소드 SQL 오류 "+e.getMessage());
      }finally {
         close(con,pstmt);
      }
      
      return MatList;
   }





   
   

}