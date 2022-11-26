package chain;
import Handlers.Dispenser;
import Handlers.Dollar10Dispenser;
import Handlers.Dollar20Dispenser;
import Handlers.Dollar50Dispenser;

public class ATMDispenseChain {
	
	private Dispenser c1;

	public ATMDispenseChain() {
		// initialize the chain
		this.c1 = new Dollar50Dispenser();
		Dispenser c2 = new Dollar20Dispenser();
		Dispenser c3 = new Dollar10Dispenser();

		// set the chain of responsibility
		c1.setNextChain(c2);
		c2.setNextChain(c3);
	}
	
	public Dispenser getDispenser() {
		return c1; 
	}

}
