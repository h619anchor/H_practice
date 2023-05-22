package xyz.itwill.mat;

import java.awt.Color;
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

public class SelectCategory extends JDialog {
   private static final long serialVersionUID = 1L;
   private final JPanel contentPanel = new JPanel();
   String category="1";
   
   public SelectCategory(JFrame frame) {
      super(frame, true);
      
      setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

      
      setTitle("분류선택");
      setBounds(100, 100, 450, 142);
      getContentPane().setLayout(null);
      contentPanel.setBackground(new Color(255, 255, 255));
      contentPanel.setBounds(0, 0, 434, 103);
      contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
      getContentPane().add(contentPanel);
      contentPanel.setLayout(null);
      
      JLabel lblNewLabel_1 = new JLabel("분류를 선택하세요");
      lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_1.setFont(new Font("맑은 고딕", Font.BOLD, 15));
      lblNewLabel_1.setBounds(12, 17, 151, 15);
      contentPanel.add(lblNewLabel_1);
      
      JButton btnNewButton = new JButton("한식");
      btnNewButton.setBackground(new Color(234, 234, 234));
      btnNewButton.setFont(new Font("맑은 고딕", Font.BOLD, 12));
      btnNewButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            category="한식";
            dispose();
         }
      });
      btnNewButton.setBounds(22, 46, 68, 34);
      contentPanel.add(btnNewButton);
      
      JButton btnNewButton_1 = new JButton("양식");
      btnNewButton_1.setBackground(new Color(234, 234, 234));
      btnNewButton_1.setFont(new Font("맑은 고딕", Font.BOLD, 12));
      btnNewButton_1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            category="양식";
            dispose();
         }
      });
      btnNewButton_1.setBounds(102, 46, 68, 34);
      contentPanel.add(btnNewButton_1);
      
      JButton btnNewButton_1_1 = new JButton("중식");
      btnNewButton_1_1.setBackground(new Color(234, 234, 234));
      btnNewButton_1_1.setFont(new Font("맑은 고딕", Font.BOLD, 12));
      btnNewButton_1_1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            category="중식";
            dispose();
         }
      });
      btnNewButton_1_1.setBounds(182, 46, 68, 34);
      contentPanel.add(btnNewButton_1_1);
      
      JButton btnNewButton_1_1_1 = new JButton("일식");
      btnNewButton_1_1_1.setBackground(new Color(234, 234, 234));
      btnNewButton_1_1_1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            category="일식";
            dispose();
         }
      });
      btnNewButton_1_1_1.setBounds(262, 46, 68, 34);
      contentPanel.add(btnNewButton_1_1_1);
      
      JButton btnNewButton_1_1_1_1 = new JButton("분식");
      btnNewButton_1_1_1_1.setBackground(new Color(234, 234, 234));
      btnNewButton_1_1_1_1.setFont(new Font("맑은 고딕", Font.BOLD, 12));
      btnNewButton_1_1_1_1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            category="분식";
            dispose();
         }
      });
      btnNewButton_1_1_1_1.setBounds(342, 46, 68, 34);
      contentPanel.add(btnNewButton_1_1_1_1);
   }
   
   
}