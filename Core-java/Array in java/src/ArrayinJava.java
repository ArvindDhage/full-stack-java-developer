//               ✅ 4️⃣ 1D Array (Single Dimensional Array)

public class ArrayinJava {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

}

/*  Defination :
    Array is the collection of sequence of simeler data stores in continues memory location .

    Syntax:
      datatype[] arrayName;
      or
      datatype arrayName[];
      ex:
      int[] arr;

     initialization of Array
         Method 1: Declaration + Memory Allocation
             int[] arr = new int[5];
             Here:

              new → creates object
                     5- size

               Default values will be stored

               Method 2: Direct Initialization
                    int[] arr = {10, 20, 30, 40};

                    ✅ 4️⃣ 1D Array (Single Dimensional Array)
📌 Theory:

Stores elements in a single row.

📌 Syntax:
int[] arr = new int[5];


*/