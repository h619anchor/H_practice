package xyz.itwill.mat;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class SelectLocation extends JDialog {
   private static final long serialVersionUID = 1L;
   private final JPanel contentPanel = new JPanel();

   String location = "";

   public SelectLocation(JFrame frame) {
      super(frame, true);
      getContentPane().setBackground(new Color(255, 255, 255));
      setBackground(new Color(255, 255, 255));

      setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

      setTitle("지역검색");
      setBounds(100, 100, 540, 203);
      getContentPane().setLayout(null);
      contentPanel.setBounds(0, 0, 536, 156);
      contentPanel.setBackground(new Color(255, 255, 255));
      contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
      getContentPane().add(contentPanel);
      contentPanel.setLayout(null);

      JLabel lblNewLabel_1 = new JLabel("지역을 선택하세요");
      lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_1.setFont(new Font("맑은 고딕", Font.BOLD, 15));
      lblNewLabel_1.setBounds(12, 21, 151, 15);
      contentPanel.add(lblNewLabel_1);

      JButton lButton1 = new JButton("신사");
      lButton1.setBackground(new Color(234, 234, 234));
      lButton1.setFont(new Font("맑은 고딕", Font.BOLD, 12));
      lButton1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {

            location = "신사동";
            dispose();

         }
      });
      lButton1.setBounds(26, 52, 70, 33);
      contentPanel.add(lButton1);

      JButton btnNewButton_1 = new JButton("압구정");
      btnNewButton_1.setBackground(new Color(234, 234, 234));
      btnNewButton_1.setFont(new Font("맑은 고딕", Font.BOLD, 12));
      btnNewButton_1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {

            location = "압구정동";
            dispose();

         }
      });
      btnNewButton_1.setBounds(106, 52, 70, 33);
      contentPanel.add(btnNewButton_1);

      JButton btnNewButton_1_1 = new JButton("청담");
      btnNewButton_1_1.setBackground(new Color(234, 234, 234));
      btnNewButton_1_1.setFont(new Font("맑은 고딕", Font.BOLD, 12));
      btnNewButton_1_1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {

            location = "청담동";
            dispose();

         }
      });
      btnNewButton_1_1.setBounds(186, 52, 70, 33);
      contentPanel.add(btnNewButton_1_1);

      JButton btnNewButton_1_1_1 = new JButton("논현");
      btnNewButton_1_1_1.setBackground(new Color(234, 234, 234));
      btnNewButton_1_1_1.setFont(new Font("맑은 고딕", Font.BOLD, 12));
      btnNewButton_1_1_1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {

            location = "논현동";
            dispose();

         }
      });
      btnNewButton_1_1_1.setBounds(266, 52, 70, 33);
      contentPanel.add(btnNewButton_1_1_1);

      JButton btnNewButton_1_1_1_1 = new JButton("삼성");
      btnNewButton_1_1_1_1.setBackground(new Color(234, 234, 234));
      btnNewButton_1_1_1_1.setFont(new Font("맑은 고딕", Font.BOLD, 12));
      btnNewButton_1_1_1_1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {

            location = "삼성동";
            dispose();

         }
      });
      btnNewButton_1_1_1_1.setBounds(346, 52, 70, 33);
      contentPanel.add(btnNewButton_1_1_1_1);

      JButton btnNewButton_1_1_1_1_1 = new JButton("역삼");
      btnNewButton_1_1_1_1_1.setBackground(new Color(234, 234, 234));
      btnNewButton_1_1_1_1_1.setFont(new Font("맑은 고딕", Font.BOLD, 12));
      btnNewButton_1_1_1_1_1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {

            location = "역삼동";
            dispose();

         }
      });
      btnNewButton_1_1_1_1_1.setBounds(426, 52, 70, 33);
      contentPanel.add(btnNewButton_1_1_1_1_1);

      JButton btnNewButton_2 = new JButton("도곡");
      btnNewButton_2.setBackground(new Color(234, 234, 234));
      btnNewButton_2.setFont(new Font("맑은 고딕", Font.BOLD, 12));
      btnNewButton_2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {

            location = "도곡동";
            dispose();

         }
      });
      btnNewButton_2.setBounds(26, 95, 70, 33);
      contentPanel.add(btnNewButton_2);

      JButton btnNewButton_1_2 = new JButton("대치");
      btnNewButton_1_2.setBackground(new Color(234, 234, 234));
      btnNewButton_1_2.setFont(new Font("맑은 고딕", Font.BOLD, 12));
      btnNewButton_1_2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {

            location = "대치동";
            dispose();

         }
      });
      btnNewButton_1_2.setBounds(106, 95, 70, 33);
      contentPanel.add(btnNewButton_1_2);

      JButton btnNewButton_1_1_2 = new JButton("개포");
      btnNewButton_1_1_2.setBackground(new Color(234, 234, 234));
      btnNewButton_1_1_2.setFont(new Font("맑은 고딕", Font.BOLD, 12));
      btnNewButton_1_1_2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {

            location = "개포동";
            dispose();

         }
      });
      btnNewButton_1_1_2.setBounds(186, 95, 70, 33);
      contentPanel.add(btnNewButton_1_1_2);

      JButton btnNewButton_1_1_1_2 = new JButton("일원");
      btnNewButton_1_1_1_2.setBackground(new Color(234, 234, 234));
      btnNewButton_1_1_1_2.setFont(new Font("맑은 고딕", Font.BOLD, 12));
      btnNewButton_1_1_1_2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {

            location = "일원동";
            dispose();

         }
      });
      btnNewButton_1_1_1_2.setBounds(266, 95, 70, 33);
      contentPanel.add(btnNewButton_1_1_1_2);

      JButton btnNewButton_1_1_1_1_2 = new JButton("수서");
      btnNewButton_1_1_1_1_2.setBackground(new Color(234, 234, 234));
      btnNewButton_1_1_1_1_2.setFont(new Font("맑은 고딕", Font.BOLD, 12));
      btnNewButton_1_1_1_1_2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {

            location = "수서동";
            dispose();

         }
      });
      btnNewButton_1_1_1_1_2.setBounds(346, 95, 70, 33);
      contentPanel.add(btnNewButton_1_1_1_1_2);

      JButton btnNewButton_1_1_1_1_1_1 = new JButton("세곡");
      btnNewButton_1_1_1_1_1_1.setBackground(new Color(234, 234, 234));
      btnNewButton_1_1_1_1_1_1.setFont(new Font("맑은 고딕", Font.BOLD, 12));
      btnNewButton_1_1_1_1_1_1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {

            location = "세곡동";
            dispose();

         }
      });
      btnNewButton_1_1_1_1_1_1.setBounds(426, 95, 70, 33);
      contentPanel.add(btnNewButton_1_1_1_1_1_1);
   }
}