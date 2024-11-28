package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPanel extends MyPanel{

	private static final long serialVersionUID = 1L;

	public MenuPanel ( MainPage mp) {
		super("menu", "ATM EMULATOR", mp);
		int fH = mp.config.frameHeight, 
				fW = mp.config.frameWidth,
				bW = mp.config.buttonWidth,
				bH = mp.config.buttonHeight,
				bHg = mp.config.buttonHeightGap,
				bWg = mp.config.buttonWidthGap,
				cH = fH/2, 
				cW = fW/2;
		
		int pointerX = cW-bWg/2 - bW;
		int pointerY = cH-bH/2 - bHg - bH;
		
		
		MyButton crAccButt = new MyButton("Create Account", this.mp);
		crAccButt.setLocation(pointerX, pointerY);
		this.add(crAccButt);
		
		MyButton chBalButt = new MyButton("Check Balance",this.mp);
		pointerX += bW + bWg;
		chBalButt.setLocation(pointerX,pointerY);
		this.add(chBalButt);

		MyButton depButt = new MyButton("Deposit",this.mp);
		pointerY += bH + bHg ;
		pointerX = cW - bW/2 - bWg - bW;
		depButt.setLocation(pointerX,pointerY);
		this.add(depButt);
		
		MyButton wDButt = new MyButton("Withdraw",this.mp);
		pointerX += bW + bWg;
		wDButt.setLocation(pointerX,pointerY);
		this.add(wDButt);
		
		
		MyButton trButt = new MyButton("Transfer",this.mp);
		pointerX += bW + bWg;
		trButt.setLocation(pointerX,pointerY);
		this.add(trButt);
		
		MyButton loanButt = new MyButton("Loan",this.mp);
		pointerX = cW - bW/2;
		pointerY = cH + bH/2 + bHg; 
		loanButt.setLocation(pointerX,pointerY);
		this.add(loanButt);
		
		
		/**
		 * 
		 * MENU PAGE SWITCHER
		 * 
		 */
		crAccButt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				crAccButt.mp.setPanelOn("createAccount");
			}
		});
		
		chBalButt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				chBalButt.mp.setPanelOn("checkBalance");
			}
		});
		
		depButt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				depButt.mp.setPanelOn("deposit");
			}
		});
		
		wDButt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				wDButt.mp.setPanelOn("withdraw");
			}
		});
		
		trButt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				trButt.mp.setPanelOn("transfer");
			}
		});
		
		loanButt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				trButt.mp.setPanelOn("loan");
			}
		});
		
		
		
		
	}
}
