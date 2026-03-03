import java.util.Scanner;

public class ArrayTwoDMatrix {
   public  static void main(String[] args) {
      int [] [] arr=new int [3] [3];
      int[][] matrix={{1,2,3},
                      {4,5,6},
                      {7,8,9}};
      for(int i=0;i<3;i++){
          for(int j=0;j<3;j++){
              System.out.print(matrix[i][j] + " ");
          }
          System.out.println();
      }

   }
}




/*5️⃣ 2D Array (Matrix)
📌 Theory:

Array of arrays
Represents rows and columns (matrix format)

📌 Syntax:
int[][] arr = new int[3][3];

Meaning:
3 rows, 3 columns*/