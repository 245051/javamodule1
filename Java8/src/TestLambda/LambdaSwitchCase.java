package TestLambda;

public class LambdaSwitchCase {
	static double calculate(String operator,double x,double y) {
		return switch(operator) {
		case"+" -> x+y;
		case "-" -> x-y;
		case "*" ->x*y;
		case "/" ->{
			if(y==0) {
				throw new IllegalArgumentException("Can't divide by zero");
				
			}
			yield x/y;
		}
		default ->throw new IllegalArgumentException("Unknown Operator");
		
		};
	}
	
	public static void main(String[] args) {
		LambdaSwitchCase l =  new LambdaSwitchCase();
		l.calculate("+", 8, 9);
		l.calculate("/", 9, 0);
		l.calculate("-", 0, 0);
		
		
	}

}

