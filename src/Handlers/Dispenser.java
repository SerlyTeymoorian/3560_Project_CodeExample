package Handlers;

import client.Currency;

//BASE interface 
public interface Dispenser {
	
	//define the next processor in the chain
	void setNextChain(Dispenser nextChain);
	
	//process the request
	void dispense(Currency currency); 

}
