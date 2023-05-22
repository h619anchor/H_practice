package xyz.itwill.mat;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class EditMat extends JDialog implements ActionListener {
   private static final long serialVersionUID = 1L;
   public static final int NONE = 0;
   public static final int ADD = 1;
   public static final int UPDATE = 2;
   public static final int UPDATE_CHANGE = 3;
   public static final int DELETE = 4;

   // 사용하는 변수들 선언
   JTextField nameTF, menuTF, categoryTF, priceTF, reviewTF, phoneTF, addressTF, locationTF;
   JButton addB, updateB, deleteB, cancelB;
   JLabel lblNewLabel, lblNewLabel_1, lblNewLabel_2, lblNewLabel_3, lblNewLabel_4, lblNewLabel_5, lblNewLabel_6,
         lblNewLabel_7;
   int cmd;

   public EditMat(JFrame frame) {
      super(frame, true);

      setTitle("맛집 관리");
      setBounds(100, 100, 603, 478);

      getContentPane().setLayout(null);
      getContentPane().setBackground(new Color(255, 255, 255));
      getContentPane().setFont(new Font("맑은 고딕", Font.PLAIN, 12));

      // 버튼들 및 클릭시 작동되는 명령들
      addB = new JButton("맛집추가");
      addB.setBackground(new Color(234, 234, 234));
      addB.setBounds(462, 27, 97, 23);
      addB.setFont(new Font("맑은 고딕", Font.BOLD, 11));
      addB.setActionCommand("OK");
      getContentPane().add(addB);

      updateB = new JButton("맛집수정");
      updateB.setBackground(new Color(234, 234, 234));
      updateB.setBounds(462, 60, 97, 23);
      updateB.setFont(new Font("맑은 고딕", Font.BOLD, 11));
      updateB.setActionCommand("OK");
      getContentPane().add(updateB);

      deleteB = new JButton("맛집삭제");
      deleteB.setBackground(new Color(234, 234, 234));
      deleteB.setBounds(462, 93, 97, 23);
      deleteB.setFont(new Font("맑은 고딕", Font.BOLD, 11));
      deleteB.setActionCommand("OK");
      getContentPane().add(deleteB);

      cancelB = new JButton("초기화");
      cancelB.setBackground(new Color(234, 234, 234));
      cancelB.setFont(new Font("맑은 고딕", Font.BOLD, 11));
      cancelB.setActionCommand("OK");
      cancelB.setBounds(462, 132, 97, 23);
      getContentPane().add(cancelB);

      addB.addActionListener(this);
      updateB.addActionListener(this);
      deleteB.addActionListener(this);
      cancelB.addActionListener(this);

      // 라벨들
      lblNewLabel = new JLabel("■ 가게 이름");
      lblNewLabel.setBounds(22, 27, 100, 15);
      lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 12));
      getContentPane().add(lblNewLabel);

      lblNewLabel_1 = new JLabel("■ 대표메뉴");
      lblNewLabel_1.setBounds(22, 76, 100, 15);
      lblNewLabel_1.setFont(new Font("맑은 고딕", Font.BOLD, 12));
      getContentPane().add(lblNewLabel_1);

      lblNewLabel_2 = new JLabel("■ 음식분류");
      lblNewLabel_2.setBounds(22, 125, 100, 15);
      lblNewLabel_2.setFont(new Font("맑은 고딕", Font.BOLD, 12));
      getContentPane().add(lblNewLabel_2);

      lblNewLabel_3 = new JLabel("■ 가격");
      lblNewLabel_3.setBounds(22, 174, 100, 15);
      lblNewLabel_3.setFont(new Font("맑은 고딕", Font.BOLD, 12));
      getContentPane().add(lblNewLabel_3);

      lblNewLabel_4 = new JLabel("■ 평점");
      lblNewLabel_4.setBounds(22, 223, 100, 15);
      lblNewLabel_4.setFont(new Font("맑은 고딕", Font.BOLD, 12));
      getContentPane().add(lblNewLabel_4);

      lblNewLabel_5 = new JLabel("■ 전화번호");
      lblNewLabel_5.setBounds(22, 272, 100, 15);
      lblNewLabel_5.setFont(new Font("맑은 고딕", Font.BOLD, 12));
      getContentPane().add(lblNewLabel_5);

      lblNewLabel_6 = new JLabel("■ 상세주소");
      lblNewLabel_6.setBounds(22, 321, 100, 15);
      lblNewLabel_6.setFont(new Font("맑은 고딕", Font.BOLD, 12));
      getContentPane().add(lblNewLabel_6);

      lblNewLabel_7 = new JLabel("■ 동 이름");
      lblNewLabel_7.setBounds(22, 370, 100, 15);
      lblNewLabel_7.setFont(new Font("맑은 고딕", Font.BOLD, 12));
      getContentPane().add(lblNewLabel_7);

      // 텍스트 필드들
      nameTF = new JTextField();
      nameTF.setBounds(115, 24, 318, 21);
      nameTF.setBackground(new Color(255, 255, 255));
      getContentPane().add(nameTF);
      nameTF.setColumns(10);

      menuTF = new JTextField();
      menuTF.setBounds(115, 73, 318, 21);
      menuTF.setBackground(new Color(255, 255, 255));
      menuTF.setColumns(10);
      getContentPane().add(menuTF);

      categoryTF = new JTextField();
      categoryTF.setBounds(115, 122, 318, 21);
      categoryTF.setBackground(new Color(255, 255, 255));
      categoryTF.setColumns(10);
      getContentPane().add(categoryTF);

      priceTF = new JTextField();
      priceTF.setBounds(115, 171, 318, 21);
      priceTF.setBackground(new Color(255, 255, 255));
      priceTF.setColumns(10);
      getContentPane().add(priceTF);

      reviewTF = new JTextField();
      reviewTF.setBounds(115, 220, 318, 21);
      reviewTF.setBackground(new Color(255, 255, 255));
      reviewTF.setColumns(10);
      getContentPane().add(reviewTF);

      phoneTF = new JTextField();
      phoneTF.setBounds(115, 269, 318, 21);
      phoneTF.setBackground(new Color(255, 255, 255));
      phoneTF.setColumns(10);
      getContentPane().add(phoneTF);

      addressTF = new JTextField();
      addressTF.setBounds(116, 318, 318, 21);
      addressTF.setBackground(new Color(255, 255, 255));
      addressTF.setColumns(10);
      getContentPane().add(addressTF);

      locationTF = new JTextField();
      locationTF.setBounds(114, 367, 318, 21);
      locationTF.setBackground(new Color(255, 255, 255));
      locationTF.setColumns(10);
      getContentPane().add(locationTF);

      // 부가 설명들
      JLabel lblNewLabel_8 = new JLabel("* 특수문자 사용 금지");
      lblNewLabel_8.setBounds(115, 46, 304, 15);
      lblNewLabel_8.setFont(new Font("맑은 고딕", Font.PLAIN, 11));
      getContentPane().add(lblNewLabel_8);

      JLabel lblNewLabel_8_1 = new JLabel("* 한글로 작성,특수문자 사용 금지");
      lblNewLabel_8_1.setBounds(115, 95, 304, 15);
      lblNewLabel_8_1.setFont(new Font("맑은 고딕", Font.PLAIN, 11));
      getContentPane().add(lblNewLabel_8_1);

      JLabel lblNewLabel_8_2 = new JLabel("* 한식, 양식, 중식, 일식, 분식 중 택 1");
      lblNewLabel_8_2.setBounds(115, 143, 304, 15);
      lblNewLabel_8_2.setFont(new Font("맑은 고딕", Font.PLAIN, 11));
      getContentPane().add(lblNewLabel_8_2);

      JLabel lblNewLabel_8_3 = new JLabel("* ex) 12,000");
      lblNewLabel_8_3.setBounds(115, 191, 304, 15);
      lblNewLabel_8_3.setFont(new Font("맑은 고딕", Font.PLAIN, 11));
      getContentPane().add(lblNewLabel_8_3);

      JLabel lblNewLabel_8_4 = new JLabel("* 5,4,3,2,1 중 택 1");
      lblNewLabel_8_4.setBounds(115, 242, 304, 15);
      lblNewLabel_8_4.setFont(new Font("맑은 고딕", Font.PLAIN, 11));
      getContentPane().add(lblNewLabel_8_4);

      JLabel lblNewLabel_8_5 = new JLabel("* ex)02-1234-1234");
      lblNewLabel_8_5.setBounds(111, 290, 304, 15);
      lblNewLabel_8_5.setFont(new Font("맑은 고딕", Font.PLAIN, 11));
      getContentPane().add(lblNewLabel_8_5);

      JLabel lblNewLabel_8_6 = new JLabel("* 특수문자 사용 금지");
      lblNewLabel_8_6.setBounds(115, 340, 304, 15);
      lblNewLabel_8_6.setFont(new Font("맑은 고딕", Font.PLAIN, 11));
      getContentPane().add(lblNewLabel_8_6);

      JLabel lblNewLabel_8_7 = new JLabel("* 강남구 내 동입력 ex)역삼동");
      lblNewLabel_8_7.setBounds(115, 389, 304, 15);
      lblNewLabel_8_7.setFont(new Font("맑은 고딕", Font.PLAIN, 11));
      getContentPane().add(lblNewLabel_8_7);

      setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

      cmd = NONE;
      initialize();
   }

   // 모든 JTextField 컴퍼넌트를 비활성화 처리하는 메소드
   public void initialize() {
      nameTF.setEditable(false);
      menuTF.setEditable(false);
      categoryTF.setEditable(false);
      priceTF.setEditable(false);
      reviewTF.setEditable(false);
      phoneTF.setEditable(false);
      addressTF.setEditable(false);
      locationTF.setEditable(false);
   }

   // 이벤트에 따른 JTextField 컴퍼넌트의 활성화 상태 변경
   public void setEditable(int n) {
      switch (n) {
      case ADD:
         nameTF.setEditable(true);
         menuTF.setEditable(true);
         categoryTF.setEditable(true);
         priceTF.setEditable(true);
         reviewTF.setEditable(true);
         phoneTF.setEditable(true);
         addressTF.setEditable(true);
         locationTF.setEditable(true);
         break;
      case DELETE:
         nameTF.setEditable(true);
         break;
      case UPDATE:
         nameTF.setEditable(true);
         break;
      case UPDATE_CHANGE:
         nameTF.setEditable(false);
         menuTF.setEditable(true);
         categoryTF.setEditable(true);
         priceTF.setEditable(true);
         reviewTF.setEditable(true);
         phoneTF.setEditable(true);
         addressTF.setEditable(true);
         locationTF.setEditable(true);
         break;
      case NONE:
         nameTF.setEditable(false);
         menuTF.setEditable(false);
         categoryTF.setEditable(false);
         priceTF.setEditable(false);
         reviewTF.setEditable(false);
         phoneTF.setEditable(false);
         addressTF.setEditable(false);
         locationTF.setEditable(false);
      }
   }

   // 이벤트에 따른 JTextField 컴퍼넌트와 JButton 컴퍼넌트의 활성화 상태 변경
   public void setEnable(int n) {
      addB.setEnabled(false);
      updateB.setEnabled(false);
      deleteB.setEnabled(false);

      switch (n) {
      case ADD:
         addB.setEnabled(true);
         setEditable(ADD);
         cmd = ADD;
         break;
      case DELETE:
         deleteB.setEnabled(true);
         setEditable(DELETE);
         cmd = DELETE;
         break;
      case UPDATE:
         updateB.setEnabled(true);
         setEditable(UPDATE);
         cmd = UPDATE;
         break;
      case UPDATE_CHANGE:
         updateB.setEnabled(true);
         setEditable(UPDATE_CHANGE);
         cmd = UPDATE_CHANGE;
         break;
      case NONE:
         addB.setEnabled(true);
         deleteB.setEnabled(true);
         updateB.setEnabled(true);
      }
   }

   // JTextField 컴퍼넌트의 입력값 초기화
   public void clear() {
      nameTF.setText("");
      menuTF.setText("");
      categoryTF.setText("");
      priceTF.setText("");
      reviewTF.setText("");
      phoneTF.setText("");
      addressTF.setText("");
      locationTF.setText("");
   }

   // 모든 컴퍼넌트의 상태 초기화
   public void initDisplay() {
      setEnable(NONE);
      clear();
      cmd = NONE;
      initialize();
   }

   public void actionPerformed(ActionEvent ev) {
      Component c = (Component) ev.getSource();

      try {
         if (c == addB) {
            if (cmd != ADD) {
               setEnable(ADD);
            } else {
               // 이름 검증
               String nameTemp = nameTF.getText();
               if (nameTemp.equals("")) {
                  JOptionPane.showMessageDialog(this, "이름을 반드시 입력해 주세요.");
                  nameTF.requestFocus();
                  return;
               }

               String nameReg = "^[ㄱ-ㅎ가-힣A-Za-z0-9]*$";
               if (!Pattern.matches(nameReg, nameTemp)) {
                  JOptionPane.showMessageDialog(this, "이름은 한글과 영어로만 입력해주세요.");
                  nameTF.requestFocus();
                  return;
               }
               if(MatDAOImpl.getDAO().updateget(nameTemp) != null) {
                  JOptionPane.showMessageDialog(this, "이미 저장된 가게입니다.");
                  nameTF.requestFocus();
                  return;   
               }

               
               
               //메뉴 검증
               String menuTemp = menuTF.getText();
               if (menuTemp.equals("")) {
                  JOptionPane.showMessageDialog(this, "메뉴를 반드시 입력해 주세요.");
                  menuTF.requestFocus();
                  return;
               }

               String menuReg = "^[가-힣]*$";
               if (!Pattern.matches(menuReg, menuTemp)) {
                  JOptionPane.showMessageDialog(this, "메뉴는 한글로만 입력해주세요.");
                  menuTF.requestFocus();
                  return;
               }
               
               
               //전화번호 검증
               String phoneTemp = phoneTF.getText();
               if (phoneTemp.equals("")) {
                  JOptionPane.showMessageDialog(this, "가격을 반드시 입력해 주세요.");
                  phoneTF.requestFocus();
                  return;
               }
               
               String phoneReg = "\\d{2,3}-\\d{3,4}-\\d{4}";
               if (!Pattern.matches(phoneReg, phoneTemp)) {
                  JOptionPane.showMessageDialog(this, "가격은 숫자로만 입력해주세요.");
                  phoneTF.requestFocus();
                  return;
               }
               
               
               //주소 검증
               String addressTemp = addressTF.getText();
               if (addressTemp.equals("")) {
                  JOptionPane.showMessageDialog(this, "주소 반드시 입력해 주세요.");
                  addressTF.requestFocus();
                  return;
               }

               
               
               
               
               //평점 검증
               String reviewTemp = reviewTF.getText();
               if (reviewTemp.equals("")) {
                  JOptionPane.showMessageDialog(this, "평점을 반드시 입력해주세요.");
                  reviewTF.requestFocus();
                  return;
               }
               
               String reviewReg = "[12345]";
               if (!Pattern.matches(reviewReg, reviewTemp)) {
                  JOptionPane.showMessageDialog(this, "1~5 사이의 숫자로만 입력해주세요.");
                  reviewTF.requestFocus();
                  return;
               }
               
               
               //음식분류 검증
               String categoryTemp = categoryTF.getText();
               if (categoryTemp.equals("")) {
                  JOptionPane.showMessageDialog(this, "음식분류를 반드시 입력해주세요.");
                  categoryTF.requestFocus();
                  return;
               }
               
               String categoryReg = "^([한]|[중]|[양]|[분]|[일])[식]$";
               if (!Pattern.matches(categoryReg, categoryTemp)) {
                  JOptionPane.showMessageDialog(this, "한식,양식,중식,일식,분식 중 선택하여 입력해주세요.");
                  categoryTF.requestFocus();
                  return;
               }
               
               String locationTemp = locationTF.getText();
               if (locationTemp.equals("")) {
                  JOptionPane.showMessageDialog(this, "음식분류를 반드시 입력해주세요.");
                  locationTF.requestFocus();
                  return;
               }
               
               String locationReg = "^([신][사]|[압][구][정]|[청][담]|[논][현]|[삼][성]|[역][삼]|[도][곡]|[대][치]|[개][포]|[일][원]|[수][서]|[세][곡])[동]$";
               if (!Pattern.matches(locationReg, locationTemp)) {
                  JOptionPane.showMessageDialog(this, "잘못된 입력이거나 강남구에 존재하지 않는 지역입니다.");
                  locationTF.requestFocus();
                  return;
               }
               
               //가격 검증 - 미완성
               String priceTemp = priceTF.getText();
               if (priceTemp.equals("")) {
                  JOptionPane.showMessageDialog(this, "가격을 반드시 입력해 주세요.");
                  priceTF.requestFocus();
                  return;
               }
               

               MatDTO mat = new MatDTO();
               mat.setName(nameTemp);
               mat.setMenu(menuTemp);
               mat.setCategory(categoryTemp);
               mat.setPrice(priceTemp);
               mat.setReview(reviewTemp);
               mat.setPhone(phoneTemp);
               mat.setAddress(addressTemp);
               mat.setLocation(locationTemp);

               MatDAOImpl.getDAO().instertMatInfo(mat);
               MatDAOImpl.getDAO().instertMatShop(mat);

               JOptionPane.showMessageDialog(this, " - 맛집정보를 추가 하였습니다.");

               initDisplay();
               dispose();
            }

         } else if (c == updateB) {
            MatDTO mat = new MatDTO();
            String update = null;

            if (cmd != UPDATE && cmd != UPDATE_CHANGE) {
               setEnable(UPDATE);
            } else if (cmd != UPDATE_CHANGE) {

               String nameTemp = nameTF.getText();
               if (nameTemp.equals("")) {
                  JOptionPane.showMessageDialog(this, "이름을 반드시 입력해 주세요.");
                  nameTF.requestFocus();
                  return;
               }

               String nameReg = "^[ㄱ-ㅎ가-힣A-Za-z0-9]*$";
               if (!Pattern.matches(nameReg, nameTemp)) {
                  JOptionPane.showMessageDialog(this, "이름은 한글과 영어로만 입력해주세요.");
                  nameTF.requestFocus();
                  return;
               }
               
               if(MatDAOImpl.getDAO().updateget(nameTemp) == null) {
                  JOptionPane.showMessageDialog(this, "존재하지 않는 가게 이름입니다.");
                  nameTF.requestFocus();
                  return;   
               }
               
               mat = MatDAOImpl.getDAO().updateget(nameTF.getText());

               nameTF.setText(mat.getName());
               menuTF.setText(mat.getMenu());
               categoryTF.setText(mat.getAddress());
               priceTF.setText(mat.getPrice());
               reviewTF.setText(mat.getReview());
               phoneTF.setText(mat.getPhone());
               addressTF.setText(mat.getAddress());
               locationTF.setText(mat.getLocation());

               setEnable(UPDATE_CHANGE);

            } else {
               // 이름 입력
               String nameTemp = nameTF.getText();
               

               
               
               //메뉴 검증
               String menuTemp = menuTF.getText();
               if (menuTemp.equals("")) {
                  JOptionPane.showMessageDialog(this, "메뉴를 반드시 입력해 주세요.");
                  menuTF.requestFocus();
                  return;
               }

               String menuReg = "^[가-힣]*$";
               if (!Pattern.matches(menuReg, menuTemp)) {
                  JOptionPane.showMessageDialog(this, "메뉴는 한글로만 입력해주세요.");
                  menuTF.requestFocus();
                  return;
               }
               
               
               //전화번호 검증
               String phoneTemp = phoneTF.getText();
               if (phoneTemp.equals("")) {
                  JOptionPane.showMessageDialog(this, "가격을 반드시 입력해 주세요.");
                  phoneTF.requestFocus();
                  return;
               }
               
               String phoneReg = "\\d{2,3}-\\d{3,4}-\\d{4}";
               if (!Pattern.matches(phoneReg, phoneTemp)) {
                  JOptionPane.showMessageDialog(this, "가격은 숫자로만 입력해주세요.");
                  phoneTF.requestFocus();
                  return;
               }
               
               
               //주소 검증
               String addressTemp = addressTF.getText();
               if (addressTemp.equals("")) {
                  JOptionPane.showMessageDialog(this, "주소 반드시 입력해 주세요.");
                  addressTF.requestFocus();
                  return;
               }

               
               
               
               
               //평점 검증
               String reviewTemp = reviewTF.getText();
               if (reviewTemp.equals("")) {
                  JOptionPane.showMessageDialog(this, "평점을 반드시 입력해주세요.");
                  reviewTF.requestFocus();
                  return;
               }
               
               String reviewReg = "[12345]";
               if (!Pattern.matches(reviewReg, reviewTemp)) {
                  JOptionPane.showMessageDialog(this, "1~5 사이의 숫자로만 입력해주세요.");
                  reviewTF.requestFocus();
                  return;
               }
               
               
               //음식분류 검증
               String categoryTemp = categoryTF.getText();
               if (categoryTemp.equals("")) {
                  JOptionPane.showMessageDialog(this, "음식분류를 반드시 입력해주세요.");
                  categoryTF.requestFocus();
                  return;
               }
               
               String categoryReg = "^([한]|[중]|[양]|[분]|[일])[식]$";
               if (!Pattern.matches(categoryReg, categoryTemp)) {
                  JOptionPane.showMessageDialog(this, "한식,양식,중식,일식,분식 중 선택하여 입력해주세요.");
                  categoryTF.requestFocus();
                  return;
               }
               
               String locationTemp = locationTF.getText();
               if (locationTemp.equals("")) {
                  JOptionPane.showMessageDialog(this, "음식분류를 반드시 입력해주세요.");
                  locationTF.requestFocus();
                  return;
               }
               
               String locationReg = "^([신][사]|[압][구][정]|[청][담]|[논][현]|[삼][성]|[역][삼]|[도][곡]|[대][치]|[개][포]|[일][원]|[수][서]|[세][곡])[동]$";
               if (!Pattern.matches(locationReg, locationTemp)) {
                  JOptionPane.showMessageDialog(this, "잘못된 입력이거나 강남구에 존재하지 않는 지역입니다.");
                  locationTF.requestFocus();
                  return;
               }
               
               //가격 검증 - 미완성
               String priceTemp = priceTF.getText();
               if (priceTemp.equals("")) {
                  JOptionPane.showMessageDialog(this, "가격을 반드시 입력해 주세요.");
                  priceTF.requestFocus();
                  return;
               }
               
               
               

               mat.setName(nameTemp);
               mat.setMenu(menuTemp);
               mat.setCategory(categoryTemp);
               mat.setPrice(priceTemp);
               mat.setReview(reviewTemp);
               mat.setPhone(phoneTemp);
               mat.setAddress(addressTemp);
               mat.setLocation(locationTemp);

               update = MatDAOImpl.getDAO().updateMatShop(mat);
               update = MatDAOImpl.getDAO().updateMatInfo(mat);

               JOptionPane.showMessageDialog(this, update + " 가게의 정보를 변경 하였습니다.");
               initDisplay();
               dispose();
            }
         } else if (c == deleteB) {
            if (cmd != DELETE) {// 첫번째 [삭제] 버튼을 누른 경우 - NONE 상태
               setEnable(DELETE);// 입출력 컴퍼넌트의 활성화 상태 변경 - DELETE 상태 변경
            } else {
               String nameTemp = nameTF.getText();
               if (nameTemp.equals("")) {
                  JOptionPane.showMessageDialog(this, "이름을 반드시 입력해 주세요.");
                  nameTF.requestFocus();
                  return;
               }

               String nameReg = "^[ㄱ-ㅎ가-힣A-Za-z0-9]*$";
               if (!Pattern.matches(nameReg, nameTemp)) {
                  JOptionPane.showMessageDialog(this, "이름은 한글과 영어로만 입력해주세요.");
                  nameTF.requestFocus();
                  return;
               }
               
               if(MatDAOImpl.getDAO().updateget(nameTemp) == null) {
                  JOptionPane.showMessageDialog(this, "존재하지 않는 가게 이름입니다.");
                  nameTF.requestFocus();
                  return;   
               }
               
               MatDAOImpl.getDAO().deleteMatShop(nameTF.getText());
               MatDAOImpl.getDAO().deleteMatInfo(nameTF.getText());

               JOptionPane.showMessageDialog(this, "맛집정보를 삭재하였습니다.");
               initDisplay();
               dispose();

            }
         } else if (c == cancelB) {
            initDisplay();
         }

      } catch (Exception e) {
         System.out.println("예외 발생 : " + e);
      }

   }
}