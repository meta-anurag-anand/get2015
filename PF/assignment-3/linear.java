import java.util.Scanner;
/**
 * Name:linear
 * @author anurag
 * since: 10 august 2015
 * description: finds the value requested by user
 */

public class linear
{

    public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of elements");
		int noofelements=sc.nextInt();
		int input[]=new int[noofelements];
		System.out.println("ennter the values");
		for(int i=0;i<noofelements;i++)
		{
			input[i]=sc.nextInt();
		}
		System.out.println("enter the value to be searched");
		int search=sc.nextInt();
		int result=linear(input,search,0);
		if(result==1)
		{
			System.out.print("found");
		}
		else
		{
			System.out.print("not found");
		}

	}
    /**
     * Name:linear
     * @param input:array inputed
     * @param search:value to be searched
     * @param i: position to  be checked
     * description:takes the input and value to be searched and matches it
     * @return
     */
	public static int linear(int []input,int search,int i)
	{   
		if(i==input.length)// if not found
	    {
		return -1;
	    }
	   else
	    {
		  if(input[i]==search)// matches the value
		  {
			return 1;
		  }
		  else
		  return	linear(input,search,i+1);
	    }
	}

}
