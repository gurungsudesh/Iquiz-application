package quiz;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;
public class loginPage implements ItemListener,ActionListener{
	JFrame f = new JFrame();
	Button lgn_button,regr_button;
	Choice items;
	loginPage(){
		f.setSize(800,500);
		f.setVisible(true);
		f.setTitle("Iquiz?");
		f.setLayout(new GridLayout(10,10));
		f.setBackground(Color.BLUE);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		Panel p1 = new Panel();
		Label heading = new Label("Login",Label.CENTER);
		heading.setFont(new Font("Calibrii",Font.BOLD,20));
		p1.add(heading);
		
		
		Panel p6 = new Panel();
		Label category = new Label("Select a category: ");
		Choice items = new Choice();
		items.addItemListener(this);
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
		Button lgn_button = new Button("Login");
		lgn_button.addActionListener(this);
		p5.add(lgn_button);
		Button regr_button = new Button("Register");
		regr_button.addActionListener(this);
		p5.add(regr_button);
		
		
		f.add(p1);
		f.add(p6);
		f.add(p2);
		f.add(p3);
		f.add(p4);
		f.add(p5);
		
	
		
		
		
	}
	public static void main(String[] args) {
		loginPage lp = new loginPage();
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==lgn_button) {
			
		}
		if(e.getSource()==regr_button) {
			
		}
		
	}
	public void itemStateChanged(ItemEvent ie) {
		
		if(ie.getSource()== items) {
			
		try {
			String table= "";
			table += items.getSelectedItem();
			System.out.println(table);
			
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
		
		
	}
	}
}
