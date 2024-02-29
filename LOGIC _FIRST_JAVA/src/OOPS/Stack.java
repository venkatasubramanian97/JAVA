package OOPS;

public class Stack {
	char s[]=new char[5];
	int lfo;
	Stack(){
		lfo=-1;
	}
	void push(char item) {
		if(lfo<4)
			s[++lfo]=item;
		else
			System.out.print("stack is full");
	}
	int pop() {
		if(lfo>=0) 
			return s[lfo--];
		return lfo;
	}
	}

