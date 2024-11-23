package gui;

public class MenuPanel extends MyPanel{
	public MenuPanel ( MainPage mp) {
		super("menu", mp);
		int fH = mp.config.frameHeight, 
				fW = mp.config.frameWidth,
				bW = mp.config.buttonWidth,
				bH = mp.config.buttonHeight,
				bHg = mp.config.buttonHeightGap,
				bWg = mp.config.buttonWidthGap,
				cH = fH/2, 
				cW = fW/2;
		
		TitleLabel t = new TitleLabel("ATM EMULATOR", mp);
		this.add(t);
		
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
		
		
		
	}
}
