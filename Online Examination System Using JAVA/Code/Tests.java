//Beginner:- 

package examination_management;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Quiz extends JFrame implements ActionListener{
    
    JButton next, submit, lifeline;
    public static int count = 0;
    public static int timer = 15;
    public static int ans_given = 0;
    public static int score = 0;
    JLabel qno, question;
    String q[][] = new String[10][5];
    String pa[][] = new String[10][1];
    String qa[][] = new String[10][2];
    JRadioButton opt1, opt2, opt3, opt4;
    ButtonGroup options;
    
    String username;
    
    Quiz(){
        
        setBounds(0,0,1500,800);
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("examination_management/icons/ques.jpg"));
        JLabel l1 = new JLabel(i1);
        l1.setBounds(0, 0, 1400, 300);
        add(l1);
        
           qno = new JLabel("");
        qno.setFont(new Font("Tahoma", Font.PLAIN, 24));
        qno.setBounds(70, 10, 20, 10);
        add(qno);
        
        question = new JLabel("");
        question.setForeground(Color.WHITE);
        question.setFont(new Font("Tahoma", Font.PLAIN, 24));
        question.setBounds(100, 400, 900, 100);
        add(question);
        
        q[0][0] = "1. What is a correct syntax to output \"Hello World\" in Java?";
        q[0][1] = "print (\"Hello World\");";
        q[0][2] = "System.out.println(\"Hello World\");  ";
        q[0][3] = "Console.WriteLine(\"Hello World\");";
        q[0][4] = "echo(\"Hello World\");";

        q[1][0] = "2. Which data type is used to create a variable that should store text?";
        q[1][1] = "string";
        q[1][2] = "Txt";
        q[1][3] = "String";
        q[1][4] = "myString";

        q[2][0] = "3. How do you create a variable with the numeric value 5?";
        q[2][1] = "num x = 5 ";
        q[2][2] = "x=5";
        q[2][3] = "int x=5";
        q[2][4] = "float x = 5;";

        q[3][0] = "4. How do you create a variable with the floating number 2.8?";
        q[3][1] = "float x = 2.8f;  ";
        q[3][2] = "x = 2.8f;";
        q[3][3] = "x = 2.8f;";
        q[3][4] = "byte x = 2.8f";

        q[4][0] = "5. Which method can be used to find the length of a string?";
        q[4][1] = "len()";
        q[4][2] = "length()";
        q[4][3] = "getLength()";
        q[4][4] = "getSize()";

        q[5][0] = "6. Which method can be used to return a string in upper case letters?";
        q[5][1] = "touppercase()  ";
        q[5][2] = "tuc()";
        q[5][3] = "toUpperCase() ";
        q[5][4] = "upperCase()";

        q[6][0] = "7. How do you create a method in Java?";
        q[6][1] = "methodName.";
        q[6][2] = "methodName[]";
        q[6][3] = "methodName()";
        q[6][4] = "(methodName)";

        q[7][0] = "8. IWhat is the correct way to create an object called myObj of MyClass?";
        q[7][1] = "class MyClass = new myObj();";
        q[7][2] = "new myObj = MyClass();";
        q[7][3] = "class myObj = new MyClass();";
        q[7][4] = "MyClass myObj = new MyClass();  ";

        q[8][0] = "9. Which method can be used to find the highest value of x and y?";
        q[8][1] = "Math.max(x,y)  ";
        q[8][2] = "Math.largest(x,y)";
        q[8][3] = "Math.maxNum(x,y)";
        q[8][4] = "Math.maximum(x,y)";

        q[9][0] = "10. Which keyword is used to import a package from the Java API library?\n";
        q[9][1] = "getlib";
        q[9][2] = "import  ";
        q[9][3] = "package";
        q[9][4] = "lib";
        
        qa[0][1] = "System.out.println(\"Hello World\");";
        qa[1][1] = "String";
        qa[2][1] = "int x=5";
        qa[3][1] = "float x = 2.8f;";
        qa[4][1] = "length()";
        qa[5][1] = "toUpperCase()";
        qa[6][1] = "methodName()";
        qa[7][1] = "MyClass myObj = new MyClass();  ";
        qa[8][1] = "Math.max(x,y)  ";
        qa[9][1] = "import  ";
        
        
        opt1 = new JRadioButton("");
        opt1.setBounds(170, 500, 700, 30);
        opt1.setForeground(Color.WHITE);
        opt1.setFont(new Font("Dialog", Font.PLAIN, 20));
        opt1.setBackground(Color.BLACK);
        add(opt1);
        
        opt2 = new JRadioButton("");
        opt2.setBounds(170, 530, 700, 30);
        opt2.setForeground(Color.WHITE);
        opt2.setFont(new Font("Dialog", Font.PLAIN, 20));
        opt2.setBackground(Color.BLACK);
        add(opt2);
        
        opt3 = new JRadioButton("");
        opt3.setBounds(170, 560, 700, 30);
        opt3.setForeground(Color.WHITE);
        opt3.setFont(new Font("Dialog", Font.PLAIN, 20));
        opt3.setBackground(Color.BLACK);
        add(opt3);
        
        opt4 = new JRadioButton("");
        opt4.setBounds(170, 590, 700, 30);
        opt4.setForeground(Color.WHITE);
        opt4.setFont(new Font("Dialog", Font.PLAIN, 20));
        opt4.setBackground(Color.BLACK);
        add(opt4);
        
        options = new ButtonGroup();
        options.add(opt1);
        options.add(opt2);
        options.add(opt3);
        options.add(opt4);
        
        next = new JButton("Next");
        next.setFont(new Font("Tahoma", Font.PLAIN, 22));
        next.setBackground(new Color(30, 144, 255));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        next.setBounds(1100, 550, 200, 40);
        add(next);
        
     
        submit = new JButton("Submit");
        submit.setFont(new Font("Tahoma", Font.PLAIN, 22));
        submit.setEnabled(false);
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setBounds(1100, 600, 200, 40);
        add(submit);
        
        start(0);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == next){
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            ans_given = 1;
            if(options.getSelection() == null){
                pa[count][0] = "";
            }else {
                pa[count][0] = options.getSelection().getActionCommand();
            }
            
            if(count == 8){
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            
            count++;
            start(count);
        }else if(ae.getSource() == submit){
            ans_given = 1;
            if(options.getSelection() == null){
                pa[count][0] = "";
            }else {
                pa[count][0] = options.getSelection().getActionCommand();
            }

            for(int i =0 ; i < pa.length ; i++){
                if(pa[i][0].equals(qa[i][1])){
                    score+=10;
                }else{
                    score+=0;
                }
            }
            this.setVisible(false);
            new Score(username, score).setVisible(true);
        }else if(ae.getSource() == lifeline){
            if(count == 2 || count == 4 || count == 6 || count == 8 || count == 9){
                opt2.setEnabled(false);
                opt3.setEnabled(false);
            }else {
                opt1.setEnabled(false);
                opt4.setEnabled(false);
            }
            lifeline.setEnabled(false);
        }
    }
    
    public void paint(Graphics g){
        super.paint(g);
        String time = "Time Left - " + timer + " seconds"; // 15
        g.setColor(Color.RED);
        g.setFont(new Font("Tahoma", Font.BOLD, 25));
        
        if(timer > 0) {
            g.drawString(time, 1000, 400);
        }else {
            g.drawString("Times Up!!", 1100, 500);
        }
        
        timer--; // 14
        
        try{
            Thread.sleep(1000);
            repaint();
        }catch(Exception e){
            e.printStackTrace();
        }
        
        if(ans_given == 1){
            ans_given = 0;
            timer = 15;
        }else if(timer < 0){
            timer = 15;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            if(count == 8){
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if(count == 9){
                if(options.getSelection() == null){
                    pa[count][0] = "";
                }else {
                    pa[count][0] = options.getSelection().getActionCommand();
                }
                
                for(int i =0 ; i < pa.length ; i++){
                    if(pa[i][0].equals(qa[i][1])){
                        score+=10;
                    }else{
                        score+=0;
                    }
                }
                this.setVisible(false);
                new Score(username, score).setVisible(true);
            }else{
                if(options.getSelection() == null){
                    pa[count][0] = "";
                }else {
                    pa[count][0] = options.getSelection().getActionCommand();
                }
                count++;
                start(count);
            }
        }
    }
    
    public void start(int count){
        qno.setText("" + (count + 1) + ". ");
        question.setText(q[count][0]);
        opt1.setLabel(q[count][1]);
        opt1.setActionCommand(q[count][1]);
        opt2.setLabel(q[count][2]);
        opt2.setActionCommand(q[count][2]);
        opt3.setLabel(q[count][3]);
        opt3.setActionCommand(q[count][3]);
        opt4.setLabel(q[count][4]);
        opt4.setActionCommand(q[count][4]);
        options.clearSelection();
    }
    
    
    
    
    public static void main(String[] args){
        new Quiz().setVisible(true);
    }
}

/*Intermediate:- 

package examination_management;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class quiz1 extends JFrame implements ActionListener{
    
    JButton next, submit, lifeline;
    public static int count = 0;
    public static int timer = 15;
    public static int ans_given = 0;
    public static int score = 0;
    JLabel qno, question;
    String q[][] = new String[10][5];
    String pa[][] = new String[10][1];
    String qa[][] = new String[10][2];
    JRadioButton opt1, opt2, opt3, opt4;
    ButtonGroup options;
    
    String username;
    
    quiz1(){
        
        setBounds(0,0,1500,800);
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("examination_management/icons/ques.jpg"));
        JLabel l1 = new JLabel(i1);
        l1.setBounds(0, 0, 1400, 300);
        add(l1);
        
           qno = new JLabel("");
        qno.setFont(new Font("Tahoma", Font.PLAIN, 24));
        qno.setBounds(70, 10, 20, 10);
        add(qno);
        
        question = new JLabel("");
        question.setForeground(Color.WHITE);
        question.setFont(new Font("Tahoma", Font.PLAIN, 24));
        question.setBounds(100, 400, 900, 100);
        add(question);
        
        q[0][0] = "1. Which is used to find and fix bugs in the Java programs.?";
        q[0][1] = "JVM";
        q[0][2] = "JDB";
        q[0][3] = "JDK";
        q[0][4] = "JRE";

        q[1][0] = "2. What is the return type of the hashCode() method in the Object class?";
        q[1][1] = "int";
        q[1][2] = "Object";
        q[1][3] = "long";
        q[1][4] = "void";

        q[2][0] = "3. Which package contains the Random class?";
        q[2][1] = "java.util package";
        q[2][2] = "java.lang package";
        q[2][3] = "java.awt package";
        q[2][4] = "java.io package";

        q[3][0] = "4. An interface with no fields or methods is known as?";
        q[3][1] = "Runnable Interface";
        q[3][2] = "Abstract Interface";
        q[3][3] = "Marker Interface";
        q[3][4] = "CharSequence Interface";

        q[4][0] = "5. In which memory a String is stored, when we create a string using new operator?";
        q[4][1] = "Stack";
        q[4][2] = "String memory";
        q[4][3] = "Random storage space";
        q[4][4] = "Heap memory";

        q[5][0] = "6. Which of the following is a marker interface?";
        q[5][1] = "Runnable interface";
        q[5][2] = "Remote interface";
        q[5][3] = "Readable interface";
        q[5][4] = "Result interface";

        q[6][0] = "7. Which keyword is used for accessing the features of a package?";
        q[6][1] = "import";
        q[6][2] = "package";
        q[6][3] = "extends";
        q[6][4] = "export";

        q[7][0] = "8. In java, jar stands for?";
        q[7][1] = "Java Archive Runner";
        q[7][2] = "Java Archive";
        q[7][3] = "Java Application Resource";
        q[7][4] = "Java Application Runner";

        q[8][0] = "9. Which of the following is a mutable class in java?";
        q[8][1] = "java.lang.StringBuilder";
        q[8][2] = "java.lang.Short";
        q[8][3] = "java.lang.Byte";
        q[8][4] = "java.lang.String";

        q[9][0] = "10. Which of the following option leads to the portability and security of Java?";
        q[9][1] = "Bytecode is executed by JVM";
        q[9][2] = "The applet makes the Java code secure and portable";
        q[9][3] = "Use of exception handling";
        q[9][4] = "Dynamic binding between objects";
        
        qa[0][1] = "JDB";
        qa[1][1] = "int";
        qa[2][1] = "java.util package";
        qa[3][1] = "Marker Interface";
        qa[4][1] = "Heap memory";
        qa[5][1] = "Remote interface";
        qa[6][1] = "import";
        qa[7][1] = "Java Archive";
        qa[8][1] = "java.lang.StringBuilder";
        qa[9][1] = "Bytecode is executed by JVM";
        
        
        opt1 = new JRadioButton("");
        opt1.setBounds(170, 500, 700, 30);
        opt1.setForeground(Color.WHITE);
        opt1.setFont(new Font("Dialog", Font.PLAIN, 20));
        opt1.setBackground(Color.BLACK);
        add(opt1);
        
        opt2 = new JRadioButton("");
        opt2.setBounds(170, 530, 700, 30);
        opt2.setForeground(Color.WHITE);
        opt2.setFont(new Font("Dialog", Font.PLAIN, 20));
        opt2.setBackground(Color.BLACK);
        add(opt2);
        
        opt3 = new JRadioButton("");
        opt3.setBounds(170, 560, 700, 30);
        opt3.setForeground(Color.WHITE);
        opt3.setFont(new Font("Dialog", Font.PLAIN, 20));
        opt3.setBackground(Color.BLACK);
        add(opt3);
        
        opt4 = new JRadioButton("");
        opt4.setBounds(170, 590, 700, 30);
        opt4.setForeground(Color.WHITE);
        opt4.setFont(new Font("Dialog", Font.PLAIN, 20));
        opt4.setBackground(Color.BLACK);
        add(opt4);
        
        options = new ButtonGroup();
        options.add(opt1);
        options.add(opt2);
        options.add(opt3);
        options.add(opt4);
        
        next = new JButton("Next");
        next.setFont(new Font("Tahoma", Font.PLAIN, 22));
        next.setBackground(new Color(30, 144, 255));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        next.setBounds(1100, 550, 200, 40);
        add(next);
        
     
        submit = new JButton("Submit");
        submit.setFont(new Font("Tahoma", Font.PLAIN, 22));
        submit.setEnabled(false);
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setBounds(1100, 600, 200, 40);
        add(submit);
        
        start(0);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == next){
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            ans_given = 1;
            if(options.getSelection() == null){
                pa[count][0] = "";
            }else {
                pa[count][0] = options.getSelection().getActionCommand();
            }
            
            if(count == 8){
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            
            count++;
            start(count);
        }else if(ae.getSource() == submit){
            ans_given = 1;
            if(options.getSelection() == null){
                pa[count][0] = "";
            }else {
                pa[count][0] = options.getSelection().getActionCommand();
            }

            for(int i =0 ; i < pa.length ; i++){
                if(pa[i][0].equals(qa[i][1])){
                    score+=10;
                }else{
                    score+=0;
                }
            }
            this.setVisible(false);
            new Score(username, score).setVisible(true);
        }else if(ae.getSource() == lifeline){
            if(count == 2 || count == 4 || count == 6 || count == 8 || count == 9){
                opt2.setEnabled(false);
                opt3.setEnabled(false);
            }else {
                opt1.setEnabled(false);
                opt4.setEnabled(false);
            }
            lifeline.setEnabled(false);
        }
    }
    
    public void paint(Graphics g){
        super.paint(g);
        String time = "Time Left - " + timer + " seconds"; // 15
        g.setColor(Color.RED);
        g.setFont(new Font("Tahoma", Font.BOLD, 25));
        
        if(timer > 0) {
            g.drawString(time, 1000, 400);
        }else {
            g.drawString("Times Up!!", 1100, 500);
        }
        
        timer--; // 14
        
        try{
            Thread.sleep(1000);
            repaint();
        }catch(Exception e){
            e.printStackTrace();
        }
        
        if(ans_given == 1){
            ans_given = 0;
            timer = 15;
        }else if(timer < 0){
            timer = 15;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            if(count == 8){
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if(count == 9){
                if(options.getSelection() == null){
                    pa[count][0] = "";
                }else {
                    pa[count][0] = options.getSelection().getActionCommand();
                }
                
                for(int i =0 ; i < pa.length ; i++){
                    if(pa[i][0].equals(qa[i][1])){
                        score+=10;
                    }else{
                        score+=0;
                    }
                }
                this.setVisible(false);
                new Score(username, score).setVisible(true);
            }else{
                if(options.getSelection() == null){
                    pa[count][0] = "";
                }else {
                    pa[count][0] = options.getSelection().getActionCommand();
                }
                count++;
                start(count);
            }
        }
    }
    
    public void start(int count){
        qno.setText("" + (count + 1) + ". ");
        question.setText(q[count][0]);
        opt1.setLabel(q[count][1]);
        opt1.setActionCommand(q[count][1]);
        opt2.setLabel(q[count][2]);
        opt2.setActionCommand(q[count][2]);
        opt3.setLabel(q[count][3]);
        opt3.setActionCommand(q[count][3]);
        opt4.setLabel(q[count][4]);
        opt4.setActionCommand(q[count][4]);
        options.clearSelection();
    }
    
    
    
    
    public static void main(String[] args){
        new quiz1().setVisible(true);
    }
}
/*Advanced:-

package examination_management;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class quiz2 extends JFrame implements ActionListener{
    
    JButton next, submit, lifeline;
    public static int count = 0;
    public static int timer = 15;
    public static int ans_given = 0;
    public static int score = 0;
    JLabel qno, question;
    String q[][] = new String[10][5];
    String pa[][] = new String[10][1];
    String qa[][] = new String[10][2];
    JRadioButton opt1, opt2, opt3, opt4;
    ButtonGroup options;
    
    String username;
    
    quiz2(){
        
        setBounds(0,0,1500,800);
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("examination_management/icons/ques.jpg"));
        JLabel l1 = new JLabel(i1);
        l1.setBounds(0, 0, 1400, 300);
        add(l1);
        
           qno = new JLabel("");
        qno.setFont(new Font("Tahoma", Font.PLAIN, 24));
        qno.setBounds(70, 10, 20, 10);
        add(qno);
        
        question = new JLabel("");
        question.setForeground(Color.WHITE);
        question.setFont(new Font("Tahoma", Font.PLAIN, 24));
        question.setBounds(100, 400, 900, 100);
        add(question);
        
        q[0][0] = "1. Which of these methods is used to print stack trace?";
        q[0][1] = " displayStackTrace()";
        q[0][2] = " getStackTrace()";
        q[0][3] = "printStackTrace()";
        q[0][4] = "obtainStackTrace()";

        q[1][0] = "2. Which of these points will be valid If superclass method does not throw any exception?";
        q[1][1] = "overridden method of sub class can throw any Runtime Exception.";
        q[1][2] = "Overridden method of sub class may not throw any exception.";
        q[1][3] = " overridden method of sub class cannot throw any checked exception.";
        q[1][4] = "all";

        q[2][0] = "3. Which of these methods return description of an exception?";
        q[2][1] = " obtainDescription()";
        q[2][2] = " getMessage()";
        q[2][3] = " getException()";
        q[2][4] = " obtainException()";

        q[3][0] = "4. Which of these operators is used to generate an instance of exception than can be thrown by using throw?\n";
        q[3][1] = " malloc";
        q[3][2] = " alloc";
        q[3][3] = "thrown";
        q[3][4] = "new";

        q[4][0] = "5. Which of the following could be written with little knowledge of java?";
        q[4][1] = "Java Server Pages";
        q[4][2] = "Java Servlets";
        q[4][3] = "Common Gateway Interface";
        q[4][4] = "Java Community Program";

        q[5][0] = "6. Which of the following is not a kind of exception that is thrown by JDBC method?";
        q[5][1] = "SQL Exception";
        q[5][2] = "DataRounding";
        q[5][3] = "DataTruncation";
        q[5][4] = "SQL Warning";

        q[6][0] = "7.  Assuming that a random number Random rand = Random()generator was created. Which of the following selects an integer from the range 0, 1, 2, 3, 4, 5, 6, 7, 8, 9?";
        q[6][1] = "rand.nextInt(9)";
        q[6][2] = " rand.nextInt()*10";
        q[6][3] = "rand.nextInt(1,10)";
        q[6][4] = "rand.nextInt(10)";

        q[7][0] = "8. Which of the following instructions is correct?";
        q[7][1] = "String alpha (“Hello Quiz!”);";
        q[7][2] = " String = “Hello Quiz!”;";
        q[7][3] = "String alpha = new “Hello Quiz!”;";
        q[7][4] = "String alpha = “Hello Quiz!”;";

        q[8][0] = "9. Consider the following lines of code:\n" +
"\n" +
"int area;\n" +
"String name;\n" +
"\n" +
"How many objects were created?";
        q[8][1] = "None – there is an object reference variable, but no object yet.";
        q[8][2] = "One – there is an object reference variable, so there must be an object.";
        q[8][3] = " Two – one for each variable.";
        q[8][4] = "Two – one for each guy.";

        q[9][0] = "10. What happens to an object that no longer has reference variables that reference it?";
        q[9][1] = " It remains in main memory forever.";
        q[9][2] = "It is swapped out to the hard disk.";
        q[9][3] = "The garbage collection service exposes the memory it occupies to other objects.";
        q[9][4] = "It comes in the dumpster.";
        
        qa[0][1] = "printStackTrace()";
        qa[1][1] = "all";
        qa[2][1] = "getMessage()";
        qa[3][1] = "new";
        qa[4][1] = "Java Server Pages";
        qa[5][1] = "DataRounding";
        qa[6][1] = "rand.nextInt(10)";
        qa[7][1] = "String alpha = “Hello Quiz!”;";
        qa[8][1] = "None – there is an object reference variable, but no object yet.";
        qa[9][1] = "The garbage collection service exposes the memory it occupies to other objects.";
        
        
        opt1 = new JRadioButton("");
        opt1.setBounds(170, 500, 700, 30);
        opt1.setForeground(Color.WHITE);
        opt1.setFont(new Font("Dialog", Font.PLAIN, 20));
        opt1.setBackground(Color.BLACK);
        add(opt1);
        
        opt2 = new JRadioButton("");
        opt2.setBounds(170, 530, 700, 30);
        opt2.setForeground(Color.WHITE);
        opt2.setFont(new Font("Dialog", Font.PLAIN, 20));
        opt2.setBackground(Color.BLACK);
        add(opt2);
        
        opt3 = new JRadioButton("");
        opt3.setBounds(170, 560, 700, 30);
        opt3.setForeground(Color.WHITE);
        opt3.setFont(new Font("Dialog", Font.PLAIN, 20));
        opt3.setBackground(Color.BLACK);
        add(opt3);
        
        opt4 = new JRadioButton("");
        opt4.setBounds(170, 590, 700, 30);
        opt4.setForeground(Color.WHITE);
        opt4.setFont(new Font("Dialog", Font.PLAIN, 20));
        opt4.setBackground(Color.BLACK);
        add(opt4);
        
        options = new ButtonGroup();
        options.add(opt1);
        options.add(opt2);
        options.add(opt3);
        options.add(opt4);
        
        next = new JButton("Next");
        next.setFont(new Font("Tahoma", Font.PLAIN, 22));
        next.setBackground(new Color(30, 144, 255));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        next.setBounds(1100, 550, 200, 40);
        add(next);
        
     
        submit = new JButton("Submit");
        submit.setFont(new Font("Tahoma", Font.PLAIN, 22));
        submit.setEnabled(false);
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setBounds(1100, 600, 200, 40);
        add(submit);
        
        start(0);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == next){
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            ans_given = 1;
            if(options.getSelection() == null){
                pa[count][0] = "";
            }else {
                pa[count][0] = options.getSelection().getActionCommand();
            }
            
            if(count == 8){
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            
            count++;
            start(count);
        }else if(ae.getSource() == submit){
            ans_given = 1;
            if(options.getSelection() == null){
                pa[count][0] = "";
            }else {
                pa[count][0] = options.getSelection().getActionCommand();
            }

            for(int i =0 ; i < pa.length ; i++){
                if(pa[i][0].equals(qa[i][1])){
                    score+=10;
                }else{
                    score+=0;
                }
            }
            this.setVisible(false);
            new Score(username, score).setVisible(true);
        }else if(ae.getSource() == lifeline){
            if(count == 2 || count == 4 || count == 6 || count == 8 || count == 9){
                opt2.setEnabled(false);
                opt3.setEnabled(false);
            }else {
                opt1.setEnabled(false);
                opt4.setEnabled(false);
            }
            lifeline.setEnabled(false);
        }
    }
    
    public void paint(Graphics g){
        super.paint(g);
        String time = "Time Left - " + timer + " seconds"; // 15
        g.setColor(Color.RED);
        g.setFont(new Font("Tahoma", Font.BOLD, 25));
        
        if(timer > 0) {
            g.drawString(time, 1000, 400);
        }else {
            g.drawString("Times Up!!", 1100, 500);
        }
        
        timer--; // 14
        
        try{
            Thread.sleep(1000);
            repaint();
        }catch(Exception e){
            e.printStackTrace();
        }
        
        if(ans_given == 1){
            ans_given = 0;
            timer = 15;
        }else if(timer < 0){
            timer = 15;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            if(count == 8){
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if(count == 9){
                if(options.getSelection() == null){
                    pa[count][0] = "";
                }else {
                    pa[count][0] = options.getSelection().getActionCommand();
                }
                
                for(int i =0 ; i < pa.length ; i++){
                    if(pa[i][0].equals(qa[i][1])){
                        score+=10;
                    }else{
                        score+=0;
                    }
                }
                this.setVisible(false);
                new Score(username, score).setVisible(true);
            }else{
                if(options.getSelection() == null){
                    pa[count][0] = "";
                }else {
                    pa[count][0] = options.getSelection().getActionCommand();
                }
                count++;
                start(count);
            }
        }
    }
    
    public void start(int count){
        qno.setText("" + (count + 1) + ". ");
        question.setText(q[count][0]);
        opt1.setLabel(q[count][1]);
        opt1.setActionCommand(q[count][1]);
        opt2.setLabel(q[count][2]);
        opt2.setActionCommand(q[count][2]);
        opt3.setLabel(q[count][3]);
        opt3.setActionCommand(q[count][3]);
        opt4.setLabel(q[count][4]);
        opt4.setActionCommand(q[count][4]);
        options.clearSelection();
    }
    
    
    
    
    public static void main(String[] args){
        new quiz2().setVisible(true);
    }
}*/
