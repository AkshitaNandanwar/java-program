//que) find missing number from given array  int arr[]= {12,11,14,15};
import java.util.*;
import java.util.Arrays;
public class MissingElement {
    public static void main(String[] args) {
        int arr[]= {12,11,14,15};
        Arrays.sort(arr);
        int n=arr.length;
        int sum=0;
        int TotalSum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        System.out.print(sum);
        System.out.println();
        for(int i=arr[0]; i<=arr[3]; i++){
            TotalSum += i;
        }
        System.out.println("actual sum is "+ TotalSum);

        int  MissingElement = TotalSum - sum;
        System.out.println("missing element is "+ MissingElement);
    }
}
