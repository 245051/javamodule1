package oopsday3;

public class Member {
	private double number1;
	private double number2;
	private double result;
	private double n;

public Member() {
	// TODO Auto-generated constructor stub
}

public double getNumber1() {
	return number1;
}

public void setNumber1(double number1) {
	this.number1 = number1;
}

public double getNumber2() {
	return number2;
}

public Member(double number1, double number2, double result, double n) {
	super();
	this.number1 = number1;
	this.number2 = number2;
	this.result = result;
	this.n = n;
}

@Override
public String toString() {
	return "Member [number1=" + number1 + ", number2=" + number2 + ", result=" + result + ", n=" + n + "]";
}

public void setNumber2(double number2) {
	this.number2 = number2;
}

public double getResult() {
	return result;
}

public void setResult(double result) {
	this.result = result;
}

public double getN() {
	return n;
}

public void setN(double n) {
	this.n = n;
}


}

