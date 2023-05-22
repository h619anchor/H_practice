package xyz.itwill.mat;

import java.util.List;

public interface MatDAO {
   
   String instertMatShop(MatDTO mat);
   String instertMatInfo(MatDTO mat);
   String updateMatShop(MatDTO mat);
   String updateMatInfo(MatDTO mat);
   String deleteMatShop(String name);
   String deleteMatInfo(String name);   
   List<MatDTO> info(String info);
   List<MatDTO> selectSearch(String search);
   List<MatDTO> selectCategory(String category);
   List<MatDTO> selectLocation(String location);
   List<MatDTO> selectReview(String review);
   List<MatDTO> selectAll();
   
}
