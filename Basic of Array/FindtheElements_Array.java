import java.util.Scanner;

//public class FindtheElements_Array {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int k = 5;
//        boolean abc= false;
//        int arr[] = new int[size];
//        for(int i=0;i<size;i++){
//            arr[i] = sc.nextInt();
//        }
//        for(int i=0;i<size;i++){
//            if(arr[i] == k){
//                abc = true;
//            }
//        }
//        if(abc){
//            System.out.println("Present");
//        } else{
//            System.out.println("absent");
//        }
//
//
//    }
public class FindtheElements_Array
{
    public static void main(String[] args) {
        int [] arr={2,1,3,2,3};
        int ans= unique(arr);
        System.out.println(ans);
    }
    static int unique(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                return arr[i];
            }
        }
        return -1;
    }
}


//    // int size = sc.nextInt();
//    //int arr[] = new int[size];
//    int arr[]={1,2,3,4,5};
//    // int size = arr.length;
//    int  k =5;
//    boolean element = false;
//        for(int i=0;i<arr.length;i++){
//        //arr[i] =sc.nextInt();
//        if(arr[i] == k){
//        element = true;
//        }
//        }
//        if( element){
//        System.out.println("Present");
//        } else{
//        System.out.println("absent");
//        }