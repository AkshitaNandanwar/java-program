import java.util.*;
public class SumOf_Palidrom {
    public static void main(String[] args) {
        int arr[] = { 8, 7, 2, 5, 3, 1 };
        int target = 152;
        boolean flag = false;

        // consider each element except the last
        for (int i = 0; i < arr.length - 1; i++){
            // start from the i'th element until the last element
            for (int j = i + 1; j < arr.length; j++){
                // if the desired sum is found, print it
                if (arr[i] + arr[j] == target){
                    System.out.println("Pair found (" + arr[i] + "," + arr[j] + ")");
                   // System.out.println("true");
                    flag =true;
                }
            }
        }
        if(flag){
            System.out.println(flag);
        }else{
            System.out.println(flag);
            System.out.println("Pair not found");
        }
        // we reach here if the pair is not found
        //System.out.println("Pair not found");

    }
}
