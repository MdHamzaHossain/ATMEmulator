package gui;

import java.awt.Font;

import javax.swing.JButton;

public class MyButton extends JButton {
	public int height = 150;
	public int width = 50;
	public MainPage mp;
	private static final long serialVersionUID = 1L;
	public MyButton(String name, MainPage m) {
		super(name);
		mp=m;
		this.setFont(new Font(m.config.font, Font.PLAIN, m.config.fontSize));
	}
	public void setLocation (int x, int y) {
		this.setBounds(x, y, mp.config.buttonWidth,mp.config.buttonHeight);
	}
}
