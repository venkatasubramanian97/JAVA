package oop;

public class InsufficientfoundException extends Exception {
	double amount;
	InsufficientfoundException(double amt){
		amount=amt;
	}
}
