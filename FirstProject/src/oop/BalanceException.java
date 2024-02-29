package oop;

public class BalanceException extends Exception {
	int amount;
	BalanceException(int am){
		amount=am;
	}

}
