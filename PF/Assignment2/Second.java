import java.util.Scanner;
public class Second {
		
	
public static String space(int n)
	{
	 
	    String s= new String();
	    for(int i=0;i<n;i++)
	    {
	        s=s+" ";
	       // System.out.println(s);
	    }
	    return s;
	}
	public static String numbers(int n)
	{
	    String s=new String();
	    for(int i=1;i<=n;i++)
	    {
	        s=s+i;
	    }
	    return s;
	  
	}
	public static String[] fina(int n)
	{String [] finalprint= new String[n];
	   int a=0;
	    for(int i=n;i>=1;i--)
	    {
	   
	    finalprint[a]=space(a)+numbers( i);
	   a++;
	}
	return finalprint;
	
	
	}
	
	
	public static void main(String args[]){
		String[] finaltriangle=new String[20];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int number=sc.nextInt();
		finaltriangle=fina(number);
		System.out.println("pyramid pattern");
		for(int i=0;i<finaltriangle.length;i++)
		{
			System.out.println(finaltriangle[i]);
		}
	}
}