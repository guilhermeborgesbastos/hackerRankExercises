/*
 *
 * Hacker Rank Execise
 * @version    0.1.0
 * @author     Guilherme Borges Bastos
 * @copyright  Copyright 2017 Guilherme Borges Bastos
 * @LinkedIn   https://www.linkedin.com/in/guilhermeborgesbastos/
 * @Facebook   https://www.facebook.com/guilherme.borgesbastos/
 * @E-mail     guilhermeborgesbastos@gmail.com
 * 
*/

public class Solution {

  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    //Get size of matrix
    final int N = Integer.parseInt(br.readLine());
      
    //Get matrix
    final int[][] matrix = new int[N][N];
    for(int y = 0; y < N; ++y){
        String[] row = br.readLine().split(" ");
        for(int x = 0; x < N; ++x){
            matrix[y][x] = Integer.parseInt(row[x]);
        }
    }
    
    //Initialize difference
    long diff = 0;
    
    //Get difference of sum of diagonals
    for(int y = 0, x = N; y < N; ++y){
        diff += matrix[y][y] - matrix[y][--x];
    }
    
    //Convert to absolute difference
    diff = (diff < 0) ? -diff : diff;
      
    //Print absolute difference
    System.out.print(diff);
  }
}