public class iterating {
    public static void main(String[] args) {
        int original[] = {10,20,30,40,50};
        int copy[] = new int[original.length];
        
        for(int i=0;i<original.length;i++){
            copy[i] = original[i];
        }

        for (int i : copy) {
            System.out.print(i+"  ");
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
