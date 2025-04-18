public class indexSearch {
    public static void main(String[] args) {
        int Arr[] ={10,20,30,40,50};
        int targate = 30;
        int value = -1;
        for(int i=0;i<Arr.length;i++){
            if (Arr[i] == targate) {
                value = Arr[i];
            }
        }
        if (value != -1) {
            System.out.println("Element found "+ value);
            
        }else{
            System.out.println("Element not found");
        }
    }
}
