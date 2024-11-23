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
		
		new MenuPanel(this);
		new CreateAccountPanel(this);
		new CheckBalancePanel(this);
		new DepositPanel(this);
		new WithdrawPanel(this);
		new LoanPanel(this);
		new TransferPanel(this);
		
		this.setPanelOn("menu");
		this.setLayout(null);
		this.setSize(this.config.frameWidth, this.config.frameHeight);
		this.setVisible(true);
		

	}
	/**
	 * @param panName
	 * menu
	 * createAccount
	 * checkBalance
	 * deposit
	 * withdraw
	 * transfer
	 * loan
	 */
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
