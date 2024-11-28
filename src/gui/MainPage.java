package gui;

import javax.swing.*;

import structuraldata.Bank;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class MainPage extends JFrame {
    
	private static final long serialVersionUID = 1L;
	public Bank bank;
	// Pages
	public Map<String, MyPanel> pages = new HashMap<>();
	public Config config = (new Config());
	public MainPage (Bank b) {
		this.bank = b;
		/**
		 * 
		 * Instantiate every page
		 * 
		 */
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
	 * Page switcher
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
		
		this.pages.forEach((k, v) -> {
			// Remove every page
			v.setVisible(false);
			v.remove(v);
		});
		
		this.add(myPan);
		// Only have selected panel to be visible
		myPan.setVisible(true);
	}

}
