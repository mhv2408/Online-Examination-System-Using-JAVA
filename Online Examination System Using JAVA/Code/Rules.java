
package examination_management;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Rules extends JFrame implements ActionListener{
    JButton b1, b2;
    String username;
    Rules(String username){
        setBounds(300,120,800,700);
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        
        JLabel l1 = new JLabel("Welcome " + username + " to Simple Minds");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("Merriweather", Font.BOLD, 28));
        l1.setBounds(50, 20, 700, 30);
        add(l1);
               
        JLabel l2 = new JLabel("");
        l2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l2.setForeground(Color.WHITE);
        l2.setBounds(20, 50, 700, 475);
        l2.setText(
            "<html>"+ 
                "1. The quizzes consists of questions carefully designed to help you self-assess your comprehension of the information presented on the topics covered in the module." + "<br><br>" +
                "2. There are a total of 10 questions where each question in the quiz is of multiple-choice format." + "<br><br>" +
                "3. Read each question carefully, and click on the button next to your response." + "<br><br>" +
                "4. For each correct question 10 marks will be awarded." + "<br><br>" +
                "5. Each question is given a time limit of 15 seconds" + "<br><br>" +
                "6. Each correct or incorrect response will result in appropriate feedback at the end of the test." + "<br><br>" +
                "7. You can only submit if you visit all the questions."+"<br><br>"+
                    "NOTE : Once next question is poped you can visit previous questions." + "<br><br>" +
                    
                    "ALL THE BEST!!"+"<br>"+
            "<html>"
        );
        add(l2);
        
        b1 = new JButton("Back");
        b1.setBounds(50, 500, 100, 30);
        b1.setBackground(new Color(30, 144, 255));
        b1.setForeground(Color.GREEN);
        b1.addActionListener(this);
        add(b1);
        
        
        b2 = new JButton("Start");
        b2.setBounds(400, 500, 100, 30);
        b2.setBackground(new Color(30, 144, 255));
        b2.setForeground(Color.GREEN);
        b2.addActionListener(this);
        add(b2);
        
        setVisible(true);
    }
   public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            this.setVisible(false);
            new Examination_Management().setVisible(true);
        }else if(ae.getSource() == b2){
            this.setVisible(false);
            new start(username).setVisible(true);
        }
       
    }
    
    public static void main(String[] args){
        new Rules("");
        
    }
    
}
