
package examination_management;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class register extends JFrame implements ActionListener{
    JButton b1;
    JTextField t1;
    JPasswordField t2;
    register(){
        setBounds(0,100,1100,500);
        getContentPane().setBackground(Color.YELLOW);
        setLayout(null);
        JLabel l3 = new JLabel("Set a Username :-");
        l3.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
        l3.setForeground(new Color(30, 144, 254));
        l3.setBounds(300, 100, 300, 20);
        add(l3);
        
        t1 = new JTextField();
        t1.setBounds(300, 150, 300, 25);
        t1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(t1);
        
        
        JLabel l4 = new JLabel("Set Password:-");
        l4.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
        l4.setForeground(new Color(30, 144, 254));
        l4.setBounds(300, 200, 300, 20);
        add(l4);
        
        
        t2 = new JPasswordField(8);
        t2.setBounds(300, 250, 300, 20);
        t2.setEchoChar('*');
        add(t2);
        
        b1 = new JButton("Register");
        b1.setBounds(300, 300, 300, 20);
        b1.setBackground(Color.GREEN);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
        
        setVisible(true);
 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            try{
                String url = "jdbc:mysql://localhost:3308/project1";
                String user = "root";
                String password = "";
 
                Connection myConn = null;
                Statement myStmt = null;
                myConn = DriverManager.getConnection(url, user, password);
                System.out.println("Register Clicked");
                myStmt = myConn.createStatement();
                String s1 = t1.getText();
                String s2 = t2.getText();
                System.out.println(s1+" "+s2);
                PreparedStatement pstmt = myConn.prepareStatement("insert into login(username,password) values(?,?)");
                pstmt.setString(1,s1);
                pstmt.setString(2,s2);
                int rs = pstmt.executeUpdate();
                if(rs==1){
                    JOptionPane.showMessageDialog(this,"Registration Successfull");
                    setVisible(false);
                    new Examination_Management();
                }
                else{
                   JOptionPane.showMessageDialog(this,"Registration Failed,Try Again");
                   setVisible(true);
                }
                
            }catch(HeadlessException | SQLException ae){}
        }
    }
    public static void main(String [] args){
        new register();
    }
}
