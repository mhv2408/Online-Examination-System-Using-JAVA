
package examination_management;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener{
    JButton b1,b2;
     Score(String username, int score){
        setBounds(200,200,800,500);
        getContentPane().setBackground(Color.DARK_GRAY);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("examination_management/icons/result.jpg"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(100, 100, 300, 300);
        add(l1);
        
        JLabel l2 = new JLabel("Thankyou for Attempting ");
        l2.setBounds(0, 0, 700, 100);
         l2.setForeground(Color.MAGENTA);
        l2.setFont(new Font("Merriweather", Font.PLAIN, 50));
        add(l2);
        
        JLabel l3 = new JLabel("Your Score is " + score);
        l3.setBounds(500, 200, 300, 30);
        l3.setFont(new Font("Jokerman", Font.PLAIN, 26));
        l3.setForeground(new Color(30, 144, 254));
        add(l3);
        
         b1 = new JButton("Reattempt");
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        b1.setBounds(550, 270, 120, 30);
        add(b1);
        
         b2 = new JButton("Home");
        b2.setBackground(Color.BLUE);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        b2.setBounds(550, 320, 120, 30);
        add(b2);
       setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
         if(ae.getSource() == b1){
        this.setVisible(false);
        new start("").setVisible(true);
         }
         else{
             this.setVisible(false);
             new Examination_Management().setVisible(true);
         }
    }
    
    public static void main(String[] args){
        new Score("", 0).setVisible(true);
    }
}
    

