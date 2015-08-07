import java.util.*;
public class Pyramid {
	 
public static String space(int row,int n)
{
    int a=0;
    String s= new String();
    for(int i=n;i>row;i--)
    {
        s=s+" ";
       // System.out.println(s);
    }
    return s;
}
public static String numbers(int row,int n)
{
    String s=new String();
    for(int i=1;i<=row;i++)
    {
        s=s+i;
    }
    for(int i=row-1;i>=1;i--)
    {
        s=s+i;
    }
    return s;
}
public static String[] fina(int n)
{ int a=0;
    String [] finalprint= new String[(2*n)-1];
    for(int i=1;i<=n;i++)
    {
finalprint[a]=space(i,n)+numbers(i, n);
//System.out.print(finalprint[a]);
//System.out.println();
a++;
}

//return s3;
for(int i=(n-1);i>=1;i--)
{
finalprint[a]=space(i,n)+numbers(i, n);
//System.out.print(finalprint[a]);
//System.out.println(); 
a++;
}

return finalprint;


}
public static void main(String args[]) {
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
//System.out.print(s);
}
}