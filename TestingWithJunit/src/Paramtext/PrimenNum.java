package Paramtext;

public class PrimenNum {
	public boolean b;
	public boolean  ppno(int x) {
		for(int i=0;i<x;i++)
		{
			for(int j=2;j<i;j++)
			{
				if(x%j==0)
				{
					b= false;
					break;
				}
				else 
					b = true;
				
			}
		}
		
		return b;
		
		
		
	}
	
}
