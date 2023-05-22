package xyz.itwill.mat;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class InfoSearch extends JDialog {
   private static final long serialVersionUID = 1L;

   private final JPanel contentPanel = new JPanel();

   JTextField infoSearchTF;
   String infoSearch = "";

   public InfoSearch(JFrame frame) {
      super(frame, true);

      setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

      setTitle("상세정보");
      setBounds(100, 100, 450, 142);
      getContentPane().setLayout(null);
      contentPanel.setBackground(new Color(255, 255, 255));
      contentPanel.setBounds(0, 0, 434, 103);
      contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
      getContentPane().add(contentPanel);
      contentPanel.setLayout(null);

      JButton okButton = new JButton("검색");
      okButton.setBackground(new Color(234, 234, 234));
      okButton.setFont(new Font("맑은 고딕", Font.BOLD, 11));
      okButton.setBounds(290, 70, 57, 23);
      contentPanel.add(okButton);
      okButton.setActionCommand("OK");
      getRootPane().setDefaultButton(okButton);
      okButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            String nameTemp = infoSearchTF.getText();
            if (nameTemp.equals("")) {
               JOptionPane.showMessageDialog(null, "이름을 반드시 입력해 주세요.");
               infoSearchTF.requestFocus();
               return;
            }

            String nameReg = "^[ㄱ-ㅎ가-힣A-Za-z0-9]*$";
            if (!Pattern.matches(nameReg, nameTemp)) {
               JOptionPane.showMessageDialog(null, "이름은 한글과 영어로만 입력해주세요.");
               infoSearchTF.requestFocus();
               return;
            }
            if (MatDAOImpl.getDAO().updateget(nameTemp) == null) {
               JOptionPane.showMessageDialog(null, "존재하지 않은 가게이름입니다.");
               infoSearchTF.requestFocus();

            } else {
               infoSearch = infoSearchTF.getText();
               dispose();
               return;
            }
            

         }
      });

      JButton cancelButton = new JButton("닫기");
      cancelButton.setBackground(new Color(234, 234, 234));
      cancelButton.setFont(new Font("맑은 고딕", Font.BOLD, 11));
      cancelButton.setBounds(350, 70, 57, 23);
      cancelButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            infoSearchReset();
            dispose();
         }
      });
      contentPanel.add(cancelButton);
      cancelButton.setActionCommand("Cancel");

      JLabel lblNewLabel = new JLabel("가게 이름을 입력해주세요.");
      lblNewLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
      lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel.setBounds(125, 11, 152, 23);
      contentPanel.add(lblNewLabel);

      infoSearchTF = new JTextField();
      infoSearchTF.setBounds(22, 35, 387, 23);
      contentPanel.add(infoSearchTF);
      infoSearchTF.setColumns(10);

      JLabel lblNewLabel_1 = new JLabel("상세정보 검색");
      lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_1.setFont(new Font("맑은 고딕", Font.BOLD, 15));
      lblNewLabel_1.setBounds(17, 14, 109, 15);
      contentPanel.add(lblNewLabel_1);
   }

   public void infoSearchReset() {
      infoSearchTF.setText("");
      infoSearch="";
   }

}