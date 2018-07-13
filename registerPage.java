package quiz;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class registerPage implements ActionListener{
	JFrame frm = new JFrame(); 
	Button register;
	TextField usr_name,p_word,email;
	//JDC connection
	Statement stmt;
	Connection conn;
	
	registerPage(){
		frm.setVisible(true);
		frm.setSize(800,500);
		frm.setTitle("IQuiz?");
		frm.setLayout(new GridLayout(10,10));
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Panel pl1 = new Panel();
		Label reg_heading = new Label("Register",Label.CENTER);
		reg_heading.setFont(new Font("Calibrii",Font.BOLD,20));
		pl1.add(reg_heading);
		frm.add(pl1);
		
		Panel pl2 = new Panel();
		Label uname = new Label("Username: ");
		 usr_name = new TextField(20);
		pl2.add(uname);
		pl2.add(usr_name);
		frm.add(pl2);
		
		Panel pl3 = new Panel();
		Label pword = new Label("Password: ");
		p_word = new TextField(20);
		pl3.add(pword);
		pl3.add(p_word);
		frm.add(pl3);
		
		Panel pl4 = new Panel();
		Label e_mail = new Label("Email: ");
		email = new TextField(20);
		pl4.add(e_mail);
		pl4.add(email);
		frm.add(pl4);
		
		Panel pl5= new Panel();
		 register = new Button("Register");
		register.addActionListener(this);
		Button lgn = new Button("Login");
		pl5.add(register);
		pl5.add(lgn);
		frm.add(pl5);
	}
	public static void main(String[] args) {
		registerPage reg = new registerPage();

	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==register) {
			try {
				String uname,password,e_mail;
				uname = usr_name.getText();
				//System.out.println(uname);
				password = p_word.getText();
				e_mail = email.getText();
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				String url = "jdbc:mysql://localhost:8080/Quiz/";
				Connection conn = DriverManager.getConnection(url, "root", "");
				System.out.println("Connected");
				//stmt = conn.createStatement();
				//stmt.executeQuery("INSERT INTO Users ( Username,Password,Email) VALUES ('"+uname+"','"+password+"','"+e_mail+"')");
				conn.close();
				
				
			}
			catch(Exception e) {
				System.out.println(e);
			}
			
			
			
		}
	}
}
