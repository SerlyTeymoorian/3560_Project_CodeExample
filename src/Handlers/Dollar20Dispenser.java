package Handlers;

import client.Currency;

//20$ currency bill 
public class Dollar20Dispenser implements Dispenser{

	private Dispenser chain;
	

	@Override
	public void setNextChain(Dispenser nextChain) {
		this.chain = nextChain;
	}

	@Override
	public void dispense(Currency currency) {
		
		//if the entered amount (REQUEST) is greater than or equal to 20
		if(currency.getAmount() >= 20){
			
			int num = currency.getAmount() / 20;
			
			int remainder = currency.getAmount() % 20;
			
			//print the amount 
			System.out.println("Dispensing "+num+" 20$ note");
			
			//if there is remainder left 
			if(remainder !=0) {
				//process the remaining amount through the handlers again 
				this.chain.dispense(new Currency(remainder));
			}
			
		}else{
			//if the REQUEST amount is less than 20 
			this.chain.dispense(currency);
		}
		
	}

}