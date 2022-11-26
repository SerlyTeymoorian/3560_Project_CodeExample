package driver;

import java.util.Scanner;

import Handlers.Dispenser;
import chain.ATMDispenseChain;
import client.Currency;

public class Driver {

	public static void main(String[] args) 
	{
		ATMDispenseChain atmDispenser = new ATMDispenseChain(); 
		
		int amount = 0;
		
		System.out.println("Enter amount to dispense");
		
		Scanner input = new Scanner(System.in);
		
		amount = input.nextInt();
		
		if (amount % 10 != 0) {
			System.out.println("Amount should be in multiple of 10s.");
			return;
		}
		
		// process the request
		atmDispenser.getDispenser().dispense(new Currency(amount));

	}

}
