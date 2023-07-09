
package examination_management;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class start extends JFrame implements ActionListener{
    JButton b1, b2,b3;
    start(String username){
        
        setBounds(200,100,1100,500);
      
        getContentPane().setBackground(Color.red);
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("examination_management/icons/star.jpg"));
        JLabel l1 =new JLabel(i1);
        l1.setBounds(0,0,600, 500);
        add(l1);
        
          
        JLabel l2 = new JLabel("Let's get started !!");
        l2.setFont(new Font("Merriweather", Font.BOLD, 30));
        l2.setForeground(Color.GREEN);
        l2.setBounds(710, 60, 300, 50);
        add(l2);
        
        b1 = new JButton("Beginner");
        b1.setBounds(710, 150, 300, 30);
        b1.setBackground(new Color(30, 144, 255));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
        
         b2 = new JButton("Intermediate");
        b2.setBounds(710,250, 300, 30);
        b2.setBackground(new Color(30, 144, 255));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
        
         b3 = new JButton("Advance");
        b3.setBounds(710, 350, 300, 30);
        b3.setBackground(new Color(30, 144, 255));
        b3.setForeground(Color.WHITE);
       b3.addActionListener(this);
        add(b3);
       
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            this.setVisible(false);
            new Quiz().setVisible(true);
        }else if(ae.getSource() == b2){
            this.setVisible(false);
            new quiz1().setVisible(true);
        }
        else if(ae.getSource() == b3){
            this.setVisible(false);
            new quiz2().setVisible(true);
        }
       
    }
    
    public static void main(String[] args){
        new start("");
        
    }
}
