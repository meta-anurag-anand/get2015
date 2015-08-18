package oopsSession1;

import java.util.Scanner;
/**
 * Name: Matrix  
 * @author Anurag
 * Since: 13 August,2015
 * Description: matrix class tranpose the matrix and print the matrix
 **/
public class Matrix
{
	static int data[][];
	static int noRows;
	static int noCols;
	int dataTranspose[][];
   /**
    * Name: matrix constructor
    * @param row: no of rows
    * @param col: no of col
    **/
	public Matrix(int row, int col) 
	{
		this.noRows = row;
		this.noCols = col;
		data = new int[row][col];
		dataTranspose = new int[col][row];
	}
    /**
     * Name: addElements
     * @param row: number of rows
     * @param col: number of cloumn
     * @param value: value to be saved
     * Description: add elements at the fixed position
    **/
	public void addElements(int row, int col, int value)
	{
		data[row][col] = value;
	}
    
	public int getElement(int row, int col)
	{
		return this.data[row][col];
	}
	/**
	 * Name:getNoRows
	 * @return
	 *  Description: returns no of rows
	 */
	public int getNoRows()
	{
		return this.noRows;
	}
	/**
	 * Name:getNoCols
	 * @return
	 *  Description: returns no of column
	 */
	public int getNoCols()
	{
		return this.noCols;
	}/**
     * Name:transpose
     * @return
     * Description: transpose of the matrix
     **/
	public static Matrix transpose() 
	{
		Matrix obj = new Matrix(noRows, noCols);
		for (int countrow = 0; countrow < noRows; countrow++) 
		{
			for (int countcolumn = 0; countcolumn < noCols; countcolumn++)
			{
				obj.dataTranspose[countcolumn][countrow] = data[countrow][countcolumn];
			}

		}
		return obj;
	}
	/**
	 * Name: Show
	 * Description: print the matrix
	 **/
	public void show() 
	{
		for (int i = 0; i < noCols; i++) //printing of transpose
		{
			for (int j = 0; j < noRows; j++) 
			{
				System.out.print(" " + dataTranspose[i][j]);
			}
			System.out.println();
		}
	}
   /**
    * Name: main
    * @param args
    **/
	public static void main(String args[])
	{
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int row = Sc.nextInt();
		System.out.println("Enter the number of column");
		int Column = Sc.nextInt();
		Matrix m1 = new Matrix(row, Column);
		System.out.println("Enter the values at:");
		for (int i = 0; i < row; i++) //input the array
		{
			for (int j = 0; j < Column; j++)
			{
				System.out.print("[" + i + "]" + "[" + j + "]" + ":");
				m1.addElements(i, j, Sc.nextInt());
			}
		}
		Matrix m2 = m1.transpose();//calling of transpose
		System.out.println("Transpose of the matrix is:");
		m2.show();
	}



}
