public class ThreeDArray {
    public static void main(String []args){
        int[][][] arr = new int[2][2][2];

        arr[0][0][0] = 1;
        arr[0][0][1] = 2;

        System.out.println(arr[0][0][1]);
    }
}
/* ✅ 6️⃣ 3D Array
📌 Theory:

Array of 2D arrays

Used rarely but important for understanding memory.

📌 Syntax:
int[][][] arr = new int[2][3][4];

Meaning:
2 blocks → 3 rows → 4 columns*/