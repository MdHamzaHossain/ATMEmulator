package gui;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class MainPage extends JFrame {
    
	private static final long serialVersionUID = 1L;

	public Map<String, MyPanel> pages = new HashMap<>();

	public Config config = (new Config());
	public MainPage () {
		MenuPanel menu = new MenuPanel(this);
		this.add(menu);
		
		this.setPanelOn("menu");
		this.setLayout(null);
		this.setSize(this.config.frameWidth, this.config.frameHeight);
		this.setVisible(true);
		/*
		int frameHeight = config.frameHeight;
		int frameWidth = config.frameWidth;
		
		JFrame myFrame = new JFrame();
		JPanel jpl = new JPanel();
		MyButton b1 = new MyButton("TEST");
		b1.setBounds(frameWidth/2-75, frameHeight/2-25, 150,50);		
		jpl.add(b1);
		
		JPanel jpl2 = new JPanel();
		
		MyButton b2 = new MyButton("TEST2");
		b2.setBounds(frameWidth/2-75, frameHeight/2-25, 150,50);		
		jpl2.add(b2);
		

		jpl.setSize(frameHeight, frameWidth);
		jpl.setLayout(null);
		jpl.setVisible(true);
		myFrame.add(jpl);
		myFrame.add(jpl2);
		

		jpl2.setSize(frameHeight, frameWidth);
		jpl2.setLayout(null);
		
		myFrame.setLayout(null);
		myFrame.setResizable(false);
		myFrame.setSize(frameWidth, frameHeight);
		myFrame.setVisible(true);
		try {
			
			TimeUnit.SECONDS.sleep(6);
		} catch (Exception e) {
			
		}
		jpl.setVisible(false);
		jpl2.setVisible(true);
		*/

	}
	public void setPanelOn(String panName) {
		MyPanel myPan = this.pages.get(panName);
		if(myPan == null) throw new Error(panName + " is not a valid panel");
		this.pages.forEach((k, v) -> v.setVisible(false));
		myPan.setVisible(true);
	}
	public static void main(String[] args) {
		new MainPage();
		
	}

}
