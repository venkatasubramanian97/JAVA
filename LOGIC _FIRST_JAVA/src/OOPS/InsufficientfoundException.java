package OOPS;

@SuppressWarnings("serial")
public class InsufficientfoundException extends Exception {
	double amount;
	InsufficientfoundException(double amt){
		amount=amt;
	}
}
