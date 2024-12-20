package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import errors.MyException;
import structuraldata.Account;

public class WithdrawPanel extends MyPanel{

	private static final long serialVersionUID = 1L;

	public WithdrawPanel ( MainPage mp) {
		super("withdraw", "Withdraw", mp);
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
		
		
		submitButt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String idIn = idTxtF.getText().trim(),
						passIn = pswTxtF.getText().trim(),
						depIn = amountTxtF.getText().trim();
				
				
				try {
					if(depIn.isBlank()  || idIn.isBlank() || passIn.isBlank()  ) throw new Exception("Valid input");
					int id = Integer.parseInt(idIn);
					int amount = Integer.parseInt(depIn);

					Account acc = mp.bank.findAccount(id);

					acc.validatePassword(passIn);
					acc.validateBalance(amount);
					acc.balance -= amount;
					outputTxt.setText("Your balance is "+ acc.balance);
			
				} catch (Exception e1) {
					outputTxt.setText("Enter valid Input");
				} catch (MyException e1) {
					outputTxt.setText(e1.getMessage());

				}
				
				
			}
		});
	}
}
