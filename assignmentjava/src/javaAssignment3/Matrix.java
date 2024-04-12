/*4. Create a class called 'Matrix' containing constructor that initializes thenumber
of rows and number of columns of a new Matrix object. The Matrix class has thefollowing information:
a. number of rows of matrix
b. number of columns of matrix
c. elements of matrix in the form of 2D array
The Matrix class has methods for each of the following:
a. get the number of rows
b. get the number of columns
c. set the elements of the matrix at given position (i,j)
d. adding two matrices. If the matrices are not addable, "Matrices cannot beadded" will be displayed. */

package javaAssignment3;

public class Matrix {
	
		 int rows;
		 int column;
		 int matrix[][];
		
		public Matrix(int rows, int column) {
			
			this.rows = rows;
			this.column = column;
			matrix=new int[rows][column];
		
		}
		public int getRows()
		{
			return rows;
		}
		public int getColumns()
		{
			return column;
		}
		private void insertElement(int i,int j,int value)
		{
			if(i>=0 && i<rows && j>=0 && j<column) 
			{
				matrix[i][j]=value;
			}
			else {
				System.out.println("Invalid index Position");
			}
		}
		public static Matrix addMatrix(Matrix obj1,Matrix obj2)
		{
			if(obj1.rows!=obj2.rows || obj1.column!=obj2.column)
			{
				System.out.println("Addition not possible");
				return null;
			}
			else
			{
				Matrix result=new Matrix(obj1.rows,obj2.column);
			
				for(int i=0;i<obj1.rows;i++)
				{
					for(int j=0;j<obj1.column;j++)
					{
						result.matrix[i][j]=obj1.matrix[i][j]+obj2.matrix[i][j];
				}
			}
				return result;
		}
	}
		public void display() {
			for(int i=0;i<rows;i++) 
			{
				for(int j=0;j<column;j++)
				{
					System.out.print(matrix[i][j]+" ");
				}
				System.out.println();
				
			}
		}
		public static void main(String[] args) {
		Matrix one=new Matrix(2,2);
		Matrix two=new Matrix(2,2);
		one.insertElement(0, 0, 1);
		one.insertElement(0, 1, 1);
		one.insertElement(1, 0, 1);
		one.insertElement(1, 1, 1);
		two.insertElement(0, 0, 2);
		two.insertElement(0, 1, 2);
		two.insertElement(1, 0, 2);
		two.insertElement(1, 1, 2);
		Matrix result=addMatrix(one,two);
		result.display();
	}
	}



