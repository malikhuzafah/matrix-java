import java.security.SecureRandom;
public class MatrixSquare
{
	public static void main(String[] args)
	{
		SecureRandom randomNumbers = new SecureRandom();
		int number=Integer.parseInt(args[0]);
		int[][] matrix = new int[number][number];
		for (int i=0 ; i<number ; i++){
			for(int j=0 ; j<number ; j++) {
				matrix[i][j] = 5 + randomNumbers.nextInt(21);
			}
		}
		for (int i=0 ; i<number ; i++) {
			for (int j=0 ; j<number ; j++) {
				System.out.printf("%d  ", matrix[i][j]);
			}
			System.out.printf("%n%n");
		}
	}
}