import java.util.*;
public class KmaxIn_AnArray {
    // arr[] ={1,2,5,8,9,4};
    //k=2;
    //output:- 8.
    public static void main(String[] args) {
        int arr[]={1,2,5,8,9,4};
        int k=2;
        int n = arr.length;
        Arrays.sort(arr);
//        System.out.println(arr.toString());
       int result =arr[n-k];
        System.out.println(result);
    }

}
