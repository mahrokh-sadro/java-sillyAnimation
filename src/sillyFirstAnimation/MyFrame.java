package sillyFirstAnimation;

import javax.swing.JFrame;

public class MyFrame extends JFrame{

	Demo demo=new Demo();
	public MyFrame() {
		this.setSize(1500,1000);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.add(demo);
		this.setVisible(true);
	}
}
 