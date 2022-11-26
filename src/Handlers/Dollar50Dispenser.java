package Handlers;

import client.Currency;

//50$ currency bill 
public class Dollar50Dispenser implements Dispenser{
	
	private Dispenser chain;

	@Override
	public void setNextChain(Dispenser nextChain) {
		this.chain = nextChain; 
		
	}

	@Override
	public void dispense(Currency currency) {
		
		//if the entered amount (REQUEST) is greater than or equal to 50
		if(currency.getAmount() >= 50){
			
			int num = currency.getAmount() / 50;
			
			int remainder = currency.getAmount() % 50;
			
			System.out.println("Dispensing "+num+" 50$ note");
			
			//if there is remainder 
			if(remainder !=0) {
				//process the remainder 
				this.chain.dispense(new Currency(remainder));
			}
		
		} else{
			//if the REQUEST amount is less than 50 
			this.chain.dispense(currency);
		}
		
	} 
	
	

}
