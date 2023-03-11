package listdemo;

public class Parser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=121;
		String str = i+"";
		System.out.println(str);
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb);
		StringBuilder rev = sb.reverse();
		System.out.println(rev);
		boolean result = str.equals(rev);
		System.out.println(result);
	}

}
