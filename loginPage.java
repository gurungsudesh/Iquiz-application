package quiz;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;
public class loginPage extends JFrame implements ActionListener,ItemListener{

	Button lgn_button,regr_button;
	Choice items;
	String table;
	loginPage(){
		setSize(800,500);
		setVisible(true);
		setTitle("Iquiz?");
		setLayout(new GridLayout(10,10));
		setBackground(Color.BLUE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		Panel p1 = new Panel();
		Label heading = new Label("Login",Label.CENTER);
		heading.setFont(new Font("Calibrii",Font.BOLD,20));
		p1.add(heading);
		
		
		Panel p6 = new Panel();
		Label category = new Label("Select a category: ");
		items = new Choice();
		items.addItemListener(this);
		items.add("");
		items.add("User");
		items.add("Admin");
		p6.add(category);
		p6.add(items);
		
		Panel p2 = new Panel();
		Label usr_name = new Label("Username: ");
		TextField username = new TextField(20);
		p2.add(usr_name);
		p2.add(username);
		
		Panel p3 = new Panel();
		Label pass= new Label("Password: ");
		TextField password = new TextField(20);
		p3.add(pass);
		p3.add(password);
		
		Panel p4 = new Panel();
		Label email = new Label("Email: ");
		TextField e_mail = new TextField(20);
		p4.add(email);
		p4.add(e_mail);
		
		
		Panel p5 = new Panel();
		lgn_button = new Button("Login");
		lgn_button.addActionListener(this);
		p5.add(lgn_button);
		regr_button = new Button("Register");
		regr_button.addActionListener(this);
		p5.add(regr_button);
		
		
		add(p1);
		add(p6);
		add(p2);
		add(p3);
		add(p4);
		add(p5);
		
	
		
		
		
	}
	public static void main(String[] args) {
		loginPage lp = new loginPage();
	}

	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()== lgn_button) {
			try {
				if(table == "User") {
					setVisible(false);
					playGame obj = new playGame();
					obj.setVisible(true);
					//System.out.println("login Button clicked");
				}
				else {
					setVisible(false);
					adminPage frame = new adminPage();
					frame.setVisible(true);
					
				}
				
			}
			catch(Exception e) {
				System.out.println(e);
			}
			
			
			
		}
		if(ae.getSource()== regr_button) {
			try {
				setVisible(false);
				
				registerPage reg = new registerPage();
				reg.setVisible(true);
				System.out.println("Button clicked");
			}
			catch(Exception e) {
				System.out.println(e);
			}
			
		
		}
	}

	public void itemStateChanged(ItemEvent ie) {
		
		if(ie.getSource()== items) {
			
			try {
				
				table = items.getSelectedItem();
				System.out.println(table);
				
			}
			catch(Exception ex) {
				System.out.println(ex);
			}
		
		
		}
	}
}
