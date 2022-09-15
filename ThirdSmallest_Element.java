import java.util.*;
public class ThirdSmallest_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {10,15,8,5,2,4,3,1};
        int n = arr.length;
//        for(int i=0;i<arr.length;i++){
//            for(int j =i+1;j<arr.length;j++){
//                int temp= 0;
//                if(arr[i]>arr[j]){
//                    temp = arr[i];
//                    arr[i] =arr[j];
//                    arr[j] =temp;
//                }
//            }
//            System.out.print(arr[i] + " ");
//        }

       // Arrays.sort(arr[]);
        int first = arr[0];
        int second =Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            if(first>arr[i]){
                third = second;
                second = first;
                first = arr[i];
            } else if( second >arr[i]){
                third = second;
                second = arr[i];
            }else if ( third>arr[i]){
                third = arr[i];
            }

        }
        System.out.print(third);

    }
}
