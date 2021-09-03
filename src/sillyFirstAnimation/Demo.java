package sillyFirstAnimation;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;

public class Demo extends JPanel implements ActionListener {

	Timer m_timer = new Timer(60, this);
	JLabel m_label;
	Random m_random = new Random();
	int m_xForSun;
	int m_yForSun;
	int m_xSunRandomPosChange;
	int m_ySunRandomPosChange;

	int m_xForDrop;
	int m_yForDrop;
	int m_xDropRandomPosChange;
	int m_yDropRandomPosChange;
	
	
	
	public Demo() {

		m_label = new JLabel(new ImageIcon("1.png"));
		m_label.setSize(100, 200);
		
		m_label.setLocation(800, 800);
		setLayout(null);
		add(m_label);
		m_timer.start();
	}

	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		this.setBackground(Color.cyan);

		Graphics2D g2d = (Graphics2D) g;

		g2d.setColor(Color.yellow);
		g2d.fillOval(m_xForSun, m_yForSun, 100, 100);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (m_xForSun > 800 || m_xForSun < 0)
			m_xSunRandomPosChange = -m_xSunRandomPosChange;
		if (m_yForSun > 800 || m_yForSun < 0)
			m_ySunRandomPosChange = -m_ySunRandomPosChange;
		
		m_xSunRandomPosChange = m_random.nextInt(51) - 15;
		m_ySunRandomPosChange = m_random.nextInt(51) - 15;

		m_xForSun += m_xSunRandomPosChange;
		m_yForSun += m_ySunRandomPosChange;
		

		
//		if (m_xForDrop > 900 || m_xForDrop < 0)
//			m_xDropRandomPosChange = -m_xDropRandomPosChange;
//		if (m_yForDrop > 800 || m_yForDrop < 0)
//			m_yDropRandomPosChange = -m_yDropRandomPosChange;
//		
//		 m_xDropRandomPosChange=m_random.nextInt(51) - 25;;
//		 m_yDropRandomPosChange=m_random.nextInt(51) - 25;;
//		 
		 
//		 m_xForDrop += m_xDropRandomPosChange;
//		 m_yForDrop += m_xDropRandomPosChange;
		
		repaint();

		m_label.setLocation(m_yForSun, m_xForSun);

	}

}
