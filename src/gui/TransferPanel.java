package gui;


public class TransferPanel extends MyPanel{

	private static final long serialVersionUID = 1L;

	public TransferPanel ( MainPage mp) {
		super("transfer", "Transfer", mp);
		int fH = mp.config.frameHeight, 
				fW = mp.config.frameWidth,
				bW = mp.config.buttonWidth,
				bH = mp.config.buttonHeight,
				bHg = mp.config.buttonHeightGap,
				bWg = mp.config.buttonWidthGap,
				cH = fH/2, 
				cW = fW/2;
		
		int pointerX = cW-bWg/2 - bW;
		int pointerY = cH-bH/2 - 2*bHg - 2*bH;
		
		
		MyLabel idLbl = new MyLabel("ID:", this.mp);
		idLbl.setLocation(pointerX, pointerY);
		this.add(idLbl);
		
		MyTextField idTxtF = new MyTextField("", this.mp);
		pointerX += bW + bWg;
		idTxtF.setLocation(pointerX, pointerY);
		this.add(idTxtF);

		MyLabel pswLbl = new MyLabel("Password:", this.mp);
		pointerX -= bW + bWg;
		pointerY += bH + bHg;
		pswLbl.setLocation(pointerX, pointerY);
		this.add(pswLbl);
		
		MyTextField pswTxtF = new MyTextField("", this.mp);
		pointerX += bW + bWg;
		pswTxtF.setLocation(pointerX, pointerY);
		this.add(pswTxtF);
		
		MyLabel amountLbl = new MyLabel("Amount:", this.mp);
		pointerX -= bW + bWg;
		pointerY += bH + bHg;
		amountLbl.setLocation(pointerX, pointerY);
		this.add(amountLbl);
		
		MyTextField amountTxtF = new MyTextField("", this.mp);
		pointerX += bW + bWg;
		amountTxtF.setLocation(pointerX, pointerY);
		this.add(amountTxtF);
		
	
		MyLabel recipientIdLbl = new MyLabel("Recipient ID:", this.mp);
		pointerX -= bW + bWg;
		pointerY += bH + bHg;
		recipientIdLbl.setLocation(pointerX, pointerY);
		this.add(recipientIdLbl);
		
		MyTextField recipientIdTxtF = new MyTextField("", this.mp);
		pointerX += bW + bWg;
		recipientIdTxtF.setLocation(pointerX, pointerY);
		this.add(recipientIdTxtF);

		MyButton submitButt = new MyButton("Submit", this.mp);
		pointerY += bH + bHg;
		submitButt.setLocation(cW- bW/2, pointerY);
		this.add(submitButt);
		
		
		MyTextField outputTxt = new MyTextField("", mp);
		pointerX = cW-bWg/2 - bW;
		pointerY += bH;
		outputTxt.setEditable(false);
		outputTxt.setBounds( pointerX, pointerY,2*bW + bWg, bH);
		this.add(outputTxt);
		
	}
}
