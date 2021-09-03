package sillyFirstAnimation;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Demo extends JPanel implements ActionListener{

	Timer m_timer=new Timer(1,this);
	int m_xForSun;
	int m_yForSun;
	int m_xPosChange=1;
	
	
	
	public Demo() {
		
		m_timer.start();
	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		this.setBackground(Color.cyan);
		
		Graphics2D g2d=(Graphics2D) g;
		
		g2d.setColor(Color.yellow);
		g2d.fillOval(m_xForSun, m_yForSun, 100, 100);
		
		
		
		
	}
	
	
	
	@Override	
	public void actionPerformed(ActionEvent e) {
		if(m_xForSun>800 || m_xForSun<0) m_xPosChange=-m_xPosChange;

		m_xForSun+=m_xPosChange;
		repaint();

	}
	
	
}
