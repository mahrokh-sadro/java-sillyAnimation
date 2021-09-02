package sillyFirstAnimation;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Demo extends JPanel implements ActionListener{

	Timer m_timer=new Timer(1000,this);
	
	public Demo() {
		
		m_timer.start();
	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		this.setBackground(Color.cyan);
		
	}
	
	
	
	@Override	
	public void actionPerformed(ActionEvent e) {
	
	}
	
	
}
