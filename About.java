package notepad_pro_pro;

import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.*;

public class About extends JFrame implements ActionListener{
    JButton b1;
    About(){
        setBounds(600,200,500,400);
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("notepad_pro_pro/images/windows.png"));
        Image i2=i1.getImage().getScaledInstance(300, 80, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(100, 40, 300, 80);
        add(l1);
        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("notepad_pro_pro/images/notepad.png"));
        Image i5=i4.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel l2 = new JLabel(i6);
        l2.setBounds(50, 150, 70, 70);
        add(l2);
        JLabel l3=new JLabel("<html>This is the version developed by Mr. Harshvardhan gupta <br> Developed in June 2021 <br> Version latest 1st <br> All rights reserved to Harshvardhan gupta</html>");
        l3.setBounds(150, 110, 300, 200);
        l3.setFont(new Font("SAN_SERIF",Font.PLAIN,15));
        add(l3);
        b1=new JButton("ok");
        b1.setBounds(350, 300, 80,20);
        b1.addActionListener(this);
        add(b1);
    }
    public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
        
    }
    
    public static void main(String[] args){
        new About().setVisible(true);
    }
}
