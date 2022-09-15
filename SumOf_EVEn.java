import java.util.*;
public class SumOf_EVEn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        int sum =0;
        for(int i=0;i<n;i++){
            if(arr[i] % 2== 0){
                sum = sum+arr[i];

            }
        }
        System.out.println(sum);
    }
}
