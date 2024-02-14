import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{
	JButton  button;
   MyFrame(){
	   
	   ImageIcon image = new ImageIcon("wizard.jpg");
	   
	   button = new JButton();
	   button.setBounds(100,100,400,200);
	   button.addActionListener(this);
	   button.setText("click me");
	   button.setFocusable(false);
	   button.setIcon(image);
	   button.setBackground(new Color(100,185,80));
	   button.setForeground(new Color(100,0,100));
	  
	   
	   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   this.setLayout(null);
	   this.setSize(500,500);
	   this.setVisible(true);
	   this.add(button);
	  
   }

@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==button) {
		System.out.println("You clicked the button that the wizard was pointing at!");
	}
		
	
}
}
