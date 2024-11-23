package gui;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class MainPage extends JFrame {
    
	private static final long serialVersionUID = 1L;

	public Map<String, MyPanel> pages = new HashMap<>();
	public MenuPanel menuPanel;
	public Config config = (new Config());
	public MainPage () {
		MenuPanel menuPanel = new MenuPanel(this);
		CreateAccountPanel crAc = new CreateAccountPanel(this);
		this.setPanelOn("createAccount");
		this.setLayout(null);
		this.setSize(this.config.frameWidth, this.config.frameHeight);
		this.setVisible(true);
		

	}
	public void setPanelOn(String panName) {
		MyPanel myPan = this.pages.get(panName);
		if(myPan == null) throw new Error(panName + " is not a valid panel");
		this.pages.forEach((k, v) -> {v.setVisible(false);v.remove(v);});
		this.add(myPan);
		myPan.setVisible(true);
	}
	public static void main(String[] args) {
		new MainPage();
		
	}

}
