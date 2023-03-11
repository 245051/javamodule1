package listdemo;

import java.util.HashMap;

public class FrequencyHashMaptest {
	
	public static void main(String[] args) {
		
		 String str="hai how are you You kmow hai is the word given to you";
		 String str1[] = str.split(" ");
		 
		 
		HashMap<String ,Integer> test = new HashMap<String,Integer>();
		int i=0;
		for(String s:str1)
		{
			if(test.containsKey(s)!=true) //test.get(s)==null
			{
				test.put(s, 1);
			}
			else
			{
				i=test.get(s);
				i++;
				test.put(s, i);
				
			}
		}
		System.out.println(test);
	
	
	
	}

}
