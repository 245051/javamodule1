package shape;

public class StringP {
	public static void main(String[] args) {
		String s ="Emmanuel";
		StringBuffer b = new StringBuffer(s);
		b.append("Hello");
		System.out.println(b);
		System.out.println(b.insert(8, "Shine"));
		String b1=b.toString();
		System.out.println(b);
		//System.out.println(b1.reverse());
	}
	

}
