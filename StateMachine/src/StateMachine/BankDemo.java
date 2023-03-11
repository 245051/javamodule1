package StateMachine;

public class BankDemo {
	double value;	
	double dCount;	
	
public BankDemo() {
	// TODO Auto-generated constructor stub
}

public BankDemo(double value, double dCount) {
	super();
	this.value = value;
	this.dCount = dCount;
}

public double getValue() {
	return value;
}

public void setValue(double value) {
	this.value = value;
}

public double getdCount() {
	return dCount;
}

public void setdCount(double dCount) {
	this.dCount = dCount;
}
}
