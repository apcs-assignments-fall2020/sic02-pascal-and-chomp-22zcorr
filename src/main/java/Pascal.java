/**
 * Builds and prints a Pascal's Triangle!
 * - Uses Rectangular 2D array and is left-justified
 *
 * @author Zack C
 * @version V1
 */
public class Pascal
{
    public static int[][] pascalTriangle(int n) {
        int[][] triangle = new int[n][n];

        triangle[0][0]=1;
        for(int i =0; i<n;i++){
            triangle[i][0]=1;
            triangle[i][i]=1;
        }

        for(int row =2; row<n;row++){
            for(int j = 1;j<row;j++){
                triangle[row][j]= triangle[row-1][j-1]+triangle[row-1][j];
            }
        }
        return triangle;
    }
}
