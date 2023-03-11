package strings;



public class TestStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte bytes[] = {65,66,67,68,69,73};
		String str = new String(bytes); //inbuilt string str we are creating.Object creation
		System.out.println("The length of the string"+str.length());
		System.out.println("The bytes in string"+str);
		str = "I love you";
		bytes = str.getBytes();
		for(byte b:bytes) { //bytes name of array and byte  is a data type.
			System.out.println(b);
		}
		char chars[] = {'U','H','K','l'};
		str =new String(chars);
		System.out.println("Converting the char to string:"+str);
		str.getChars(0,chars.length-1,chars, 0);
		System.out.println("To character");
		for(char c :chars) {
			System.out.println(c);
		}
	String string1 =new String("She sells sea. shells in sea shore" );
	int s=0;
	for(int i=0;i<string1.length();i++)
	{
		char si = string1.charAt(i);
		if(si =='s'|| si=='S')
		{
			s++;
			 } 
	}
	System.out.println(s);
	
	//Important
	String words[] = string1.split(" ");// Get the word.
	String word1[] = string1.split("[.]");
	System.out.println("The split when it come with . is");
	for(String b:word1)
	{
		System.out.println(b);
	}
	System.out.println(words.length);
	System.out.println(word1);
	for(String word:words) {   // for each loop.
		
		System.out.println(word);
	}
	string1 = new String("Cartoon");
	System.out.println("To print whether it starts with car:"+string1.startsWith("Car"));
	System.out.println("To check whether it end with oon:"+string1.endsWith("oon"));
	int aps = string1.indexOf('a');
	int ops = string1.indexOf('t');
	System.out.println("The index are:"+aps+","+ops);
	String string2 = string1.substring(aps,ops);
	System.out.println(string2);
			string2 = string1.substring(ops);
	System.out.println(string2);
	
	String string3 = new String("Madam");
	String email = new String("Emmanuel.ShineJoseph@ust.com");
	int y=email.lastIndexOf(".com");
	String String4 = email.substring(0, y);
	System.out.println("The baalnce of the string:"+String4);
	String string5 = new String("welcome");
	String string6 = new String("welcome");
	String string7 = new String("WELCOME");
	String string8 = new String("weLComE");
	boolean result4 = string1.equals(string8);
	boolean result = string5.equals(string6);
	boolean result2 = string5.equals(string7);
	boolean result3 = string5.equalsIgnoreCase(string7);// It just checks whether the content is same or not.
	int z = string5.compareTo(string8);
	int x = string8.compareTo(string5);
	System.out.println("The result is: "+result);
	System.out.println("The result2 is: "+result2);
	System.out.println("The result3 is: "+result3);
	System.out.println("The comparison between string 5 to string 8:"+z);
	System.out.println("The comparison between string 8 to string 5:"+x);
	String string9 = new String("Hello Everyone");
	String str1 = string9.toLowerCase();
	System.out.println(str1);
	// "16-11-477/6/A/3@Hyderabad"
	String string10 = new String("16-11-477/6/A/3 @Hyderabad 500036");
	char ch;
	
	//char ch[] = string10.getsChar();
	for(int i =0;i<string10.length();i++)
	{
		ch = string10.charAt(i);
	}
	
	int sp =0;
	int al =0;
	int d=0;
	int s4=0;
	
	for(int i=0;i<string10.length();i++)
	{
		Character c=string10.charAt(i); //Character is an object type
		if(c.isWhitespace(c)) {
			sp++;
		}
		else if(Character.isAlphabetic(c)) {
			al++;
		}
		else if(Character.isDigit(c)) {
			d++;
		}
		else
		{
			s4++;
		}
	}
	System.out.println(sp);
	System.out.println(al);
	System.out.println(d);
	System.out.println(s4);
	}

}
