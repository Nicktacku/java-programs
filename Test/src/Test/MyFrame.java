package Test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.util.Random;

public class MyFrame extends JFrame implements ActionListener{
	JButton button;
	JLabel label;
	
	MyFrame(){
		label = new JLabel();
		
		button = new JButton();
		button.setBounds(200, 300, 250, 100);
		button.addActionListener(this);
		button.setText("Roll dice");
		button.setFocusable(false);
		button.setHorizontalTextPosition(JButton.CENTER);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500, 500);
		this.setVisible(true);
		this.add(button);
		this.add(label);
	}
	
	public void actionPerformed(ActionEvent e) {
		Random rand = new Random();
		String dice = "";
		if(e.getSource()==button) {
			label.setText(dice.valueOf(rand.nextInt(6) + 1));
		}
	}
}
