package gui;

import javax.swing.JPanel;

public class MyPanel extends JPanel{
	public MainPage mp;
	private static final long serialVersionUID = 1L;
	public MyPanel(String name, MainPage mp) {
		this.mp = mp;
		this.setName(name);
		this.setSize(this.mp.config.frameWidth, this.mp.config.frameHeight);
		this.setLayout(null);
		this.mp.pages.put(name, this);
	}
}
