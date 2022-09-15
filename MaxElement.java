import java.util.*;
public class MaxElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int arr[] = { 3,5,8,9,4};
//       method 1:
//       Arrays.sort(arr);
//       int max = arr[arr.length-3];
//        System.out.println(max);
        int maxR= Integer.MIN_VALUE;
        //Method 2 without use Arrays.sort();
        for(int i = 0;i<arr.length;i++){
            if(maxR < arr[i]){
                maxR =arr[i];
            }
        }
        System.out.println("this is a 1st max" + maxR);
        System.out.println();
        System.out.println();
    }
}

// how can i find 3rd max without using Arrays.sort
