package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import errors.MyException;

import structuraldata.Account;

public class CreateAccountPanel extends MyPanel{

	private static final long serialVersionUID = 1L;

	public CreateAccountPanel ( MainPage mp) {
		super("createAccount", "Create Account", mp);
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
		
		
		MyLabel nameLbl = new MyLabel("Name:", this.mp);
		nameLbl.setLocation(pointerX, pointerY);
		this.add(nameLbl);
		
		MyTextField nameTxtF = new MyTextField("", this.mp);
		pointerX += bW + bWg;
		nameTxtF.setLocation(pointerX, pointerY);
		this.add(nameTxtF);

		MyLabel pswLbl = new MyLabel("Password:", this.mp);
		pointerX -= bW + bWg;
		pointerY += bH + bHg;
		pswLbl.setLocation(pointerX, pointerY);
		this.add(pswLbl);
		
		MyTextField pswTxtF = new MyTextField("", this.mp);
		pointerX += bW + bWg;
		pswTxtF.setLocation(pointerX, pointerY);
		this.add(pswTxtF);
		
		MyLabel emailLbl = new MyLabel("Email:", this.mp);
		pointerX -= bW + bWg;
		pointerY += bH + bHg;
		emailLbl.setLocation(pointerX, pointerY);
		this.add(emailLbl);
		
		MyTextField emailTxtF = new MyTextField("", this.mp);
		pointerX += bW + bWg;
		emailTxtF.setLocation(pointerX, pointerY);
		this.add(emailTxtF);
		
		MyLabel addressLbl = new MyLabel("Address:", this.mp);
		pointerX -= bW + bWg;
		pointerY += bH + bHg;
		addressLbl.setLocation(pointerX, pointerY);
		this.add(addressLbl);
		
		MyTextField addressTxtF = new MyTextField("", this.mp);
		pointerX += bW + bWg;
		addressTxtF.setLocation(pointerX, pointerY);
		this.add(addressTxtF);
		

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
				String nameIn = nameTxtF.getText(),
						passIn = pswTxtF.getText().trim(),
						addIn = addressTxtF.getText(),
						emailIn = emailTxtF.getText();
				try {
					
					if(nameIn.isBlank() || passIn.isBlank() || addIn.isBlank() || emailIn.isBlank() ) throw new Exception("Valid input");
					Account acc = mp.bank.createAccount(nameIn, passIn, emailIn, addIn);
					outputTxt.setText("Your ID is "+ acc.id);
				
				} catch (Exception e1) {
					outputTxt.setText("Enter valid Input");
				} catch(MyException e1) {
					outputTxt.setText(e1.getMessage());
				}
				
				
			}
		});
	}
}
