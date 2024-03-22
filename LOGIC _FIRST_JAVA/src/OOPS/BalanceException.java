package OOPS;

@SuppressWarnings("serial")
public class BalanceException extends Exception {
	int amount;
	BalanceException(int am){
		amount=am;
	}

}
