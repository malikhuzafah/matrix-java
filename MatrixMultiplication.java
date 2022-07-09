import java.security.SecureRandom;
import java.util.Scanner;
public class MatrixMultiplication
{
	public static void main(String[] args)
	{
		SecureRandom randomNumbers=new SecureRandom();
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number of rows of Matrix 1: ");
		int rows1=input.nextInt();
		System.out.print("Enter number of columns of Matrix 1: ");
		int columns1=input.nextInt();
		int[][] matrix1=new int[rows1][columns1];
		for (int i=0;i<matrix1.length;i++){
			for(int j=0;j<matrix1[i].length;j++) {
				matrix1[i][j]=1+randomNumbers.nextInt(5);
			}
		}
		System.out.print("Enter number of rows of Matrix 2: ");
		int rows2=input.nextInt();
		System.out.print("Enter number of columns of Matrix 2: ");
		int columns2=input.nextInt();
		int[][] matrix2=new int[rows2][columns2];
		for (int i=0;i<matrix2.length;i++){
			for(int j=0;j<matrix2[i].length;j++) {
				matrix2[i][j]=1+randomNumbers.nextInt(5);
			}
		}
		System.out.println("Matrix 1:");
		for (int i=0;i<matrix1.length;i++){
			for(int j=0;j<matrix1[i].length;j++) {
				System.out.printf("%d  ",matrix1[i][j]);
			}
			System.out.println();
		}
		System.out.println("Matrix 2:");
		for (int i=0;i<matrix2.length;i++){
			for(int j=0;j<matrix2[i].length;j++) {
				System.out.printf("%d  ",matrix2[i][j]);
			}
			System.out.println();
		}
		int sum=0;
		if (columns1==rows2) {
			System.out.println("Matrix multiplication is possible");
			int mult[][]=new int [rows1][columns2];
			for (int i=0;i<mult.length;i++) {
				for (int j=0;j<mult[i].length;j++) {
					sum=0;
						sum=sum+matrix1[i][k]*matrix2[k][j];
					for (int k=0;k<rows2;k++) {
					}
					mult[i][j]=sum;
				}
			}
			for (int i=0;i<mult.length;i++) {
				for (int j=0;j<mult[i].length;j++) {
					System.out.printf("%d  ",mult[i][j]);
				}
				System.out.println();
			}
		}
		else {
			System.out.println("Matrix multiplication is not possible");
		}
		//for (int i=0;i<number;i++) {
			//for (int j=0;j<number;j++) {
				//System.out.printf("%d  ",matrix[i][j]);
			//}
			//System.out.printf("%n%n");
		//}
	}
}