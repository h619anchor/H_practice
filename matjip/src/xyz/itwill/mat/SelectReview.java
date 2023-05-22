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

public class SelectReview extends JDialog {
   private static final long serialVersionUID = 1L;
   private final JPanel contentPanel = new JPanel();
   String review="";
   public SelectReview(JFrame frame) {
      super(frame, true);
      
      setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

      
      setTitle("평점검색");
      setBounds(100, 100, 450, 142);
      getContentPane().setLayout(null);
      contentPanel.setBackground(new Color(255, 255, 255));
      contentPanel.setBounds(0, 0, 434, 103);
      contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
      getContentPane().add(contentPanel);
      contentPanel.setLayout(null);
      
      JLabel lblNewLabel_1 = new JLabel("평점을 선택하세요");
      lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_1.setFont(new Font("맑은 고딕", Font.BOLD, 15));
      lblNewLabel_1.setBounds(12, 17, 151, 15);
      contentPanel.add(lblNewLabel_1);
      
      JButton btnNewButton = new JButton("5점");
      btnNewButton.setBackground(new Color(234, 234, 234));
      btnNewButton.setFont(new Font("맑은 고딕", Font.BOLD, 12));
      btnNewButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            review="5";
            dispose();
         }
      });
      btnNewButton.setBounds(22, 46, 68, 34);
      contentPanel.add(btnNewButton);
      
      JButton btnNewButton_1 = new JButton("4점");
      btnNewButton_1.setFont(new Font("맑은 고딕", Font.BOLD, 12));
      btnNewButton_1.setBackground(new Color(234, 234, 234));
      btnNewButton_1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            review="4";
            dispose();
         }
      });
      btnNewButton_1.setBounds(102, 46, 68, 34);
      contentPanel.add(btnNewButton_1);
      
      JButton btnNewButton_1_1 = new JButton("3점");
      btnNewButton_1_1.setBackground(new Color(234, 234, 234));
      btnNewButton_1_1.setFont(new Font("맑은 고딕", Font.BOLD, 12));
      btnNewButton_1_1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            review="3";
            dispose();
         }
      });
      btnNewButton_1_1.setBounds(182, 46, 68, 34);
      contentPanel.add(btnNewButton_1_1);
      
      JButton btnNewButton_1_1_1 = new JButton("2점");
      btnNewButton_1_1_1.setBackground(new Color(234, 234, 234));
      btnNewButton_1_1_1.setFont(new Font("맑은 고딕", Font.BOLD, 12));
      btnNewButton_1_1_1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            review="2";
            dispose();
         }
      });
      btnNewButton_1_1_1.setBounds(262, 46, 68, 34);
      contentPanel.add(btnNewButton_1_1_1);
      
      JButton btnNewButton_1_1_1_1 = new JButton("1점");
      btnNewButton_1_1_1_1.setBackground(new Color(234, 234, 234));
      btnNewButton_1_1_1_1.setFont(new Font("맑은 고딕", Font.BOLD, 12));
      btnNewButton_1_1_1_1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            review="1";
            dispose();
         }
      });
      btnNewButton_1_1_1_1.setBounds(342, 46, 68, 34);
      contentPanel.add(btnNewButton_1_1_1_1);
   }
}