package gui;

import java.awt.Font;

import javax.swing.JLabel;

public class TitleLabel extends JLabel {
	private static final long serialVersionUID = 1L;
	public MainPage mp;
	public TitleLabel(String name, MainPage m) {
		super(name);
		
		mp=m;
		this.setBounds(
				this.mp.config.frameWidth/2-this.mp.config.titleWidth/2,
				this.mp.config.buttonHeightGap, 
				this.mp.config.titleWidth, 
				this.mp.config.titleHeight
				);
		this.setFont(new Font(m.config.font, Font.BOLD, m.config.titleFontSize));
	}
}
