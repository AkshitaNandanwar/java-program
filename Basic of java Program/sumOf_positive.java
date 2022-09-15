//print the sum of only the first 3 positive no's from the any array.
//
//// example:
//
//// 1)input A={12,34,-20,44,-10,56,-2,86,12},
//
//// ans: 12+34+44=90.
public class sumOf_positive {
    public static void main(String[] args) {
        int arr[] = {12,34,-20,44,-10,56,-2,86,12};
        int sum =0;
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0 && count<3){
                sum = sum + arr[i];
                count++;
            }
        }
        System.out.println(sum);
    }
}
//class sumOf_positive {
//    public static void main(String[] args) {
//        int arr [] = {12,34,-20,44,-10,56,-2,86,12};
//        int n = arr.length;
//        int sum =0;
//        for(int i=0;i<n;i++){
//            if( arr[i] > 0){
//                sum = sum+ arr[i];
//            }
//        }
//        System.out.println(sum);
//    }
//}