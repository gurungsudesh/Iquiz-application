package quiz;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class playGame implements ActionListener{
	JFrame pg = new JFrame();
	
	playGame(){
		pg.setVisible(true);
		pg.setTitle("IQuiz?");
		pg.setLayout(new GridLayout(10,10));
		pg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pg.setSize(800,500);
		
		Panel pa1 = new Panel();
		Label play = new Label("Welcome: ");
		TextField uname = new TextField(40);
		pa1.add(play);
		pa1.add(uname);
		pg.add(pa1);
		
		Panel pa2 = new Panel();
		Button start = new Button("Play Game");
		start.addActionListener(this);
		
	
		pa2.add(start);
		pg.add(pa2);
		
		
	}
	public static void main(String[] args) {
		playGame obj = new playGame();
	}
	public void actionPerformed(ActionEvent ae) {
		
	}
}
