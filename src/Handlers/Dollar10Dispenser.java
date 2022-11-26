package Handlers;

import client.Currency;

//10$ currency bill 
public class Dollar10Dispenser implements Dispenser {

	private Dispenser chain;
	

	@Override
	public void setNextChain(Dispenser nextChain) {
		this.chain = nextChain; 
		
	}

	@Override
	public void dispense(Currency currency) {
		
		//if the entered amount (REQUEST) is greater than or equal to 10 
		if(currency.getAmount() >= 10){
			
			int num = currency.getAmount() / 10;
			
			int remainder = currency.getAmount() % 10;
			
			//print the amount 
			System.out.println("Dispensing "+num+" 10$ note");
			
			//if there is still remainder left 
			if(remainder != 0) {
				//process the remaining amount through the handlers again 
				this.chain.dispense(new Currency(remainder));
			}
			
		} else {
			//if the REQUEST is less than 10 
			this.chain.dispense(currency);
		}
		
	}

}