package observer.pattern.exercise;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingObserverExample {
	
	JFrame frame;
	
	public static void main(String[] args) {
		
		SwingObserverExample example = new SwingObserverExample();
		example.go();
		
	}
	
	
	public void go(){
		frame = new JFrame();
		JButton button = new JButton("Should I do it?");
		button.addActionListener(new AngelListener());
		button.addActionListener(new DevilListener());
		
		frame.getContentPane().add(BorderLayout.CENTER, button);
		frame.setLocation(400, 500);
	}
	
	
	

}
