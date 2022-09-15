//Q.Given an unsorted distinct integer, find the largest pair sum in it. For example,
//
//        the largest pair sum in {12, 34, 10, 6, 40} is 74 in O(N) time complexity.
public class Largest_sum {
    public static void main(String[] args) {
        int arr[] ={12, 34, 10, 6, 40,36};
        System.out.println(largestPairSum(arr,arr.length));
    }
    public static int largestPairSum(int [] arr, int n){
        int j=0;
        int max = n==1? arr[0]+arr[1]:arr[0];

        for(int i=0;i<n;i++){
            int sum = arr[j] + arr[i];
            if(sum>max){
                max = sum;
                if(arr[j] < arr[i]){
                    j=i;
                }
            }
        }
        return max;
    }
}
