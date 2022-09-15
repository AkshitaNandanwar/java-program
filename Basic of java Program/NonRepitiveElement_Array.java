//Implement the algorithm to find the single element in the given array where all other elements are duplicate in O(n) with no extra space.
//        Input : 2,4,2,4,7,6,6,-1,-1
//        Output: 7
//import java.util.*;
//public class NonRepitiveElement_Array {
//    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        int size = sc.nextInt();
////        int sum=0;
//      //  int max =Integer.MIN_VALUE;
//        int max = 0;
//        System.out.println(max);
//
//        int arr[] = new int[size];
//        for(int i=0;i<size;i++){
//            arr[i]=sc.nextInt();
//            sum = sum+arr[i];
//            //max
//
//        }
//    }
//}

// sum
public class NonRepitiveElement_Array {
    public static void main(String[] args) {
        int arr[]={2,4,2,4,7,6,6,-1,-1};
        int size= arr.length;
        int first, second ,third;
         first = Integer.MIN_VALUE;
       //int second = Integer.MIN_VALUE;
         second = first;
        int max = Integer.MIN_VALUE;
        int min =Integer.MAX_VALUE;
        third = Integer.MIN_VALUE;
        for(int i = 0;i<size;i++){
//            if(arr[i]>max){
//                max=arr[i];
//            }
//            if(arr[i]<min){
//                min=arr[i];
//            }


           if(arr[i]>first ){
               second = first;
               first =arr[i];
           }
           if(arr[i]>second && arr[i] != first){
               second = arr[i];
           }


                if (arr[i] > third && arr[i] < second)
                    third = arr[i];
        }
//        System.out.println(max);
//        System.out.println(min);
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

//        //2,4,2,4,7,6,6,-1,-1
//        int uniqElement =0;
//        boolean flag = false;
//        for(int i=0; i<size;i++){
//            for(int j=0;j<size;j++){
//                if(i != j && arr[i]  == arr[j]){
//                     flag = true;
//
//                }
//            }
//            if(flag != false){
//                uniqElement = arr[i];
//            }
//        }
//        System.out.println(uniqElement);

    }
}