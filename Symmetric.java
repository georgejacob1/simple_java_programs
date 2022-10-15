import java.util.Scanner;
public class Symmetric
{	
	public static void main(String args[])
	{
		int rows,cols,i,j,flag=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of rows of the matrix: ");
		rows = sc.nextInt();
		System.out.println("Enter the no. of columns of the matrix: ");
		cols = sc.nextInt();
		if(rows != cols)
		{
			System.out.println("The given matrix is not a square matrix, so it can't be symmetric.");
		}
		else
		{
		int matrix[][] = new int[rows][cols];
		System.out.println("Enter the elements :");
		for (i = 0; i < rows; i++)
		{
			for (j = 0; j < cols; j++)
			{
				matrix[i][j] = sc.nextInt();
			}
		}
		System.out.println("The matrix :");
		for (i = 0; i < rows; i++)
		{
			for (j = 0; j < cols; j++)
			{
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("The transpose of the matrix :");
		for (i = 0; i < rows; i++)
		{
			for (j = 0; j < cols; j++)
			{
				System.out.print(matrix[j][i]+"\t");
			}
			System.out.println();
		}
		for (i = 0; i < rows; i++)
		{
			for (j = 0; j < cols; j++)
			{
				if(matrix[i][j] != matrix[j][i])
				{
					flag = 1;
				}
			}
		}
		if(flag==0)
		{
			System.out.println("Result: The given matrix is symmetric.");
		}
		else
		{
			System.out.println("Result: The given matrix is not symmetric.");
		}
		}
		
	}
}
