import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrixA = new int[rows][cols];
        int[][] matrixB = new int[rows][cols];
        int[][] result = new int[rows][cols];

        // Input matrix A
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println("A[" + i + "][" + j +"] :");
                matrixA[i][j]=sc.nextInt();
            }
        }

        // Input matrix B
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println("B[" + i + "][" + j +"] :");
                matrixB[i][j]=sc.nextInt();
            }
        }

         // Add matrices
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                result[i][j]= matrixA[i][j] + matrixA[i][j];
            }
        }

         // Print Result
         System.out.println("\nResultant Matrix (A + B):");
         for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }

    }
}


/*
 * 
 * import java.util.Scanner;

public class Test {

   public static void main(String[] args) {
        int original[] = originalArray();
        CopyArray(original);

   }
   public static int[] originalArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            System.out.print("enter the value "+ i +" : ");
            arr[i]=sc.nextInt();
        }
        System.out.println(arr.length);
        return arr;
    }

   public static void CopyArray(int arr[]){
      int copy[] = new int[arr.length];
      for(int i=0;i<arr.length;i++){
        copy[i]=arr[i];
      }
      System.out.println("Copy Array");
      for (int i : copy) {
        System.out.println(i);
      }
   }
   

}
 */



/*
 * 
 * import java.util.Scanner;
public class Test {

    public static void main(String[] args) {
        
        int arr[] = {10,20,30,40,50};
        int sum = 0;
        for (int i=0;i<arr.length;i++){
            System.out.println(i);
            System.out.println(arr[i]);
            sum += arr[i];
        } 
       
        for (int i : arr) {
            sum += i;
            System.out.println(i);
        }
        
        System.out.println("Sum of the Array "+ sum);
    }
}
 */










/*
 * 
 * 
 * class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();
        int Arr[] = new int[size];
        for(int i=0;i<size; i++){
            System.out.println("Enter the index value "+ i +": ");
            Arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target you want to search");
        int targate = sc.nextInt();

        int foundIndex = indexSearch(Arr,targate); 
        if (foundIndex != -1) {
            System.out.println("Number found at index: " + foundIndex);
        }else{
            System.out.println("not found");
        }
    }
    public static int indexSearch(int Arr[], int targate){
       
        for(int i=0;i< Arr.length; i++){
            if (Arr[i] == targate) {
                return i;
            }
        }
        return -1;
    }
}


 */




/*
 * import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array :");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            System.out.print("Enter the index "+i +" :");
            arr[i]= sc.nextInt();
            int targate = 30;
            int foundIndex = indexSearch(arr,targate);
            if (foundIndex != -1) {
                System.out.println("Number found at index: " + foundIndex);
            } else {
                System.out.println("Number not found.");
            }
    
            sc.close();
        }
    }
        public static int indexSearch(int arr[], int key) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == key) {
                    return i; // Return the index where key is found
                }
            }
            return -1; // If not found
        }
    
}
 */