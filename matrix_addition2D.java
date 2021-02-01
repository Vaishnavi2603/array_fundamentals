package Array_Fundamentals;

public class matrix_addition2D {

	public static void main(String[] args) {
		int m=2,n=3;
		int a1[][] = { {2, 3, 4}, {5, 2, 3} };
        int a2[][] = { {-4, 5, 3}, {5, 6, 3} };
        
        int[][] sum = new int[m][n];
        for(int i = 0; i < m; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                sum[i][j] = a1[i][j] + a2[i][j];
                System.out.print(sum[i][j]+ " ");
            }
            System.out.println();
        }
	}
}