package session4;

import java.util.*;

/**
 * Name:Queens
 * @author Anurag 
 * Since:12 August,2015 
 * Description:Solves the N queen Problem
 **/
public class Queens 
{
	static int[] position;// where the position of queens is stored
	int array1[][];
	/**
	 * Name:Queens constructor
	 * @param N
	 * Description: Intialize the Array X
	 **/
	public Queens(int N) 
	{
		position = new int[N];
	}

	/**
	 * Name: main
	 * @param args
	 **/
	public static void main(String[] args)
	{
		System.out.println("N QUEENS PROBLEM");
		System.out.println("Enter  No Of queens");
		Scanner sc = new Scanner(System.in);
		int queens = sc.nextInt();
		Queens Q = new Queens(queens);
		int[][] resultArray = Q.callplaceNqueens();
		for (int row = 0; row < queens; row++) // traversal of row
		{
			for (int column = 0; column < queens; column++) // traversal of  column
			{
				if (position[row] == column) // matches the if value of position  is equal to column
				{
					System.out.print(" 1 ");
				} 
				else 
				{
					System.out.print(" 0 ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	/**
	 * Name: printQueens
	 * @param x
	 * @return
	 **/
	public int[][] printQueens(int[] position) 
	{
		int N = position.length;
		int array[][] = new int[N][N];
		for (int i = 0; i < N; i++)
		{
			for (int j = 0; j < N; j++) 
			{
				if (position[i] == j) 
				{
					array[i][j] = '1';// inputing the position of queens as 1
				} 
				else 
				{
					array[i][j] = '0';// inputs other position as 0
				}
			}
		}
		return array;
	}
    /**
     * Name:canPlaceQueen
     * @param row :no of rows
     * @param c :count
     * @return
     * Description: checks for the position if queen can be placed or not
     **/
	public boolean canPlaceQueen(int row, int c)
	{
		for (int i = 0; i < row; i++) 
		{
			if (position[i] == c || (i - row) == (position[i] - c)|| (i - row) == (c - position[i]))//checks the position
			{
				return false;
			}
		}
		return true;
	}
   /**
    * Name:placeNQueens
    * @param row :which row
    * @param numberOfQueens
    * @return
    * Description: position where queen to be placed
    **/
	public int[][] placeNqueens(int row, int numberOfQueens) 
	{
		for (int c = 0; c < numberOfQueens; c++) 
		{
			if (canPlaceQueen(row, c)) 
			{
				position[row] = c;
				if (row == numberOfQueens - 1) 
				{
					array1 = printQueens(position);
					return array1;
				} 
				else 
				{
					placeNqueens(row + 1, numberOfQueens);
				}
			}
		}
		return array1;
	}
    /**
     * Name:callplaceNqueens
     * @return
     * Description:calls the main function
     **/
	public int[][] callplaceNqueens()
    {
		array1 = placeNqueens(0, position.length);
		return array1;
	}

}
