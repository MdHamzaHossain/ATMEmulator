package gui;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyLabel extends JLabel {
	public MainPage mp;
	private static final long serialVersionUID = 1L;
	public MyLabel(String name, MainPage m) {
		super(name);
		mp=m;
		this.setFont(new Font(m.config.font, Font.PLAIN, m.config.fontSize));
	}
	public void setLocation (int x, int y) {
		this.setBounds(x, y, mp.config.buttonWidth,mp.config.buttonHeight);
	}
}
