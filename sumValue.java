class sumValue{
    public static void main(String[] args){
        int arr[] ={1,2,3,4,5};
        System.out.println("Array Length "+ arr.length);
       
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            System.out.println("index of "+ i + " : "+ arr[i]);
            sum = arr[i] + sum;
        }
        System.out.println("Sum of Array "+ sum);

       // int arr1[] ={1,2,3,4,5,6};
        //int total = addition(arr1);
        //int additionArray = appendtis(arr1);
        //System.out.println("Sum of Array Using function"+ total); 
       // System.out.println("Sum of Array Using function"+ additionArray);
       int arr1[] = {1, 2, 3, 4, 5, 6};
        int additionArray = appendtis(arr1);
        System.out.println("Sum of Array Using function: " + additionArray); 
    }
    public static int appendtis(int arr1[]){
        int count =0;
        int i = 0;
        while (i < arr1.length) {
            count += arr1[i];
            i++;
        }
        return count;
    }
    public static int addition(int arr1[]){
        int count = 0;
        for (int value : arr1) {
            count += value;
        }
         
        return count;
    }
}

/*
 * import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array");
        int size = sc.nextInt();
        int Arr[] = new int[size];
        for(int i=0; i<size; i++){
            System.out.println("Ente the number "+ (i+1) +" : ");
            Arr[i] = sc.nextInt();
        }
        System.out.println(Arr.length);
        int total = SumArray(Arr);
        System.out.println(total);
        
    }
    
    public static int SumArray(int Arr[]){
        int sum =0;
        for (int i : Arr) {
            sum += i;
        }
        return sum;
    }

}
 */