package oopsday6;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		/*
		 * // TODO Auto-generated method stubfefefefeffm int b =args[0]; //args is an
		 * array of string int a = args[]1; int data[] = {a,b}
		 */
System.out.println("Program task begin");
try{        //If we provide 10 20 30 as input then it will only reading to the first 2 values and it will not print exception.
	int b = Integer.parseInt(args[0]);
	int c = Integer.parseInt(args[1]);
	int d = b/c;
	//String name = args[2];// REading the 3rd element in the earray and itb gives an array out of bound exception.
	int data[] = {b,c};
	for(int w:data) {
	   System.out.println(w);
	}
}catch(ArrayIndexOutOfBoundsException e) {
	e.printStackTrace();
}catch(NumberFormatException e) {
	e.printStackTrace();
}catch(Exception e) {
	e.printStackTrace();
}

}
}
