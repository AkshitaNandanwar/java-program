//Input Array: 3,2,0,12,0,7,0,0,1
//        Output: 3,2,12,7,1,0,0,0,0
//        re-arrange the zero elements towards end of array
//        without changing the sequence of non zero elements
//        in O(n)
//        + no extra space
/*public class ReaarangeElement {
    public static void main(String[] args) {
 int arr[] = {3,2,0,12,0,7,0,0,1};
 int n = arr.length();
 int count = 0;

 for(int i =0;i<n;i++){
     if(arr[i]==0){
         count++;
     }
 }
 for(int i=0; i<count;i++){
     arr[n-1-i]=0;
 }
    }
}*/
