
package examination_management;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*; 
public class Examination_Management extends JFrame implements ActionListener{
    JButton b1, b2,b3;
    JTextField t1;
       JPasswordField t2;
    Examination_Management(){
        setBounds(200,100,1100,500);
      
        getContentPane().setBackground(Color.ORANGE);
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("examination_management/icons/exam.jpg"));
        JLabel l1 =new JLabel(i1);
        l1.setBounds(0,0,600,500);
        add(l1);
        
         
        JLabel l2 = new JLabel("MyExam");
        l2.setFont(new Font("Merriweather", Font.BOLD, 60));
        l2.setForeground(Color.BLACK);
        l2.setBounds(710, 60, 275, 70);
        add(l2);
        
         JLabel l5 = new JLabel("TEST YOUR KNOWLEDGE IN JAVA");
        l5.setFont(new Font("Serif, Helvetica", Font.BOLD, 15));
        l5.setForeground(Color.white);
        l5.setBounds(710, 120, 300, 50);
        add(l5);
        
        JLabel l3 = new JLabel("Enter Username :-");
        l3.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
        l3.setForeground(new Color(30, 144, 254));
        l3.setBounds(710, 200, 300, 20);
        add(l3);
        
        t1 = new JTextField();
        t1.setBounds(720, 250, 300, 25);
        t1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(t1);
        
        
        JLabel l4 = new JLabel("Password:-");
        l4.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
        l4.setForeground(new Color(30, 144, 254));
        l4.setBounds(710, 300, 300, 20);
        add(l4);
        
        
        t2 = new JPasswordField(8);
        t2.setBounds(720, 350, 300, 25);
        t2.setEchoChar('*');
        add(t2);
        
        b1 = new JButton("Login");
        b1.setBounds(720, 400, 90, 25);
        b1.setBackground(Color.GREEN);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("Register");
        b2.setBounds(820, 400, 90, 25);
        b2.setBackground(new Color(30, 144, 254));
        b2.setForeground(Color.GREEN);
        b2.addActionListener(this);
        add(b2);
        
        b3 = new JButton("Exit");
        b3.setBounds(920, 400, 90, 25);
        b3.setBackground(Color.RED);
        b3.setForeground(Color.WHITE);
        b3.addActionListener(this);
        add(b3);
        
        setVisible(true);
    
    }    
    
    public void actionPerformed(ActionEvent ae){
        
    
         if(ae.getSource()==b3){
            System.exit(0); 
         }
         if(ae.getSource()==b2){
             new register().setVisible(true);
         }
         if(ae.getSource()==b1){
            try{
                conn c1 = new conn();
                
                String s1 = t1.getText();
                String s2 = t2.getText();
            
                String str = "select * from login where username = '"+s1+"' and password = '"+s2+"'";
                ResultSet rs = c1.s.executeQuery(str);  
                
                if(rs.next()){
                    JOptionPane.showMessageDialog(this,"Login Successfull");
                    setVisible(false);
                    new Rules(s1);
                }else{
                    JOptionPane.showMessageDialog(this,"Invalid Login");
                }
            
            }catch(HeadlessException | SQLException e){}
            
	}
    }        
            public static void main(String[] args) {
       new Examination_Management();
    }
    
}