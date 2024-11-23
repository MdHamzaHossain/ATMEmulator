package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class MyPanel extends JPanel{
	public MainPage mp;
	private static final long serialVersionUID = 1L;
	public MyPanel(String name, String title, MainPage mp) {
		this.mp = mp;
		this.setName(name);
		this.setSize(this.mp.config.frameWidth, this.mp.config.frameHeight);
		this.setLayout(null);
		this.mp.pages.put(name, this);
		this.setVisible(false);
		
		TitleLabel t = new TitleLabel(title, mp);
		this.add(t);
		
		if(name != "menu") {
			MyButton homeButt = new MyButton("Back To Home", mp);
			homeButt.setLocation(0,0);
			this.add(homeButt);
			homeButt.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					mp.setPanelOn("menu");
				}
			});
		}
		
		 
	}
}
