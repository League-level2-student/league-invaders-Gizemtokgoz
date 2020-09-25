import java.awt.Dimension;

import javax.swing.JFrame;

public class LeagueInvaders {
	static final int WIDTH = 500;
	static final int HEIGHT = 800;
	JFrame frame;

	public static void main(String[] args) {
		LeagueInvaders invaders = new LeagueInvaders();
		invaders.setup();
	}

	LeagueInvaders() {
		frame = new JFrame();
	}

	void setup() {
		frame.setVisible(true);
		frame.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
