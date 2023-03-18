package lsp;

public class LspDemo {
	public void calculateArea(Shape s) {
		System.out.println(s.getarea());
	}
	public static void main(String[] args) {
		LspDemo ls =new LspDemo();
		ls.calculateArea(new Rectangle(1,4));//We are using object foe rectangle class.
		ls.calculateArea(new Square(3));
	}
}
