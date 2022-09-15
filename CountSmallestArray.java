////Que public class CouterArrayFromRight {
////    input:- { 12, 10, 5, 4, 2, 20, 6, 1, 0, 2 };
////    Output:- { 8, 7, 5, 4, 1, 4, 3, 1, 0, 0 };
//
//public class CountSmallestArray {
//    public static void main(String[] args) {
//      //  CountSmallestArray small = new CountSmallestArray();// here CountSmallestArray is the class & small is the object of CountSmallestArray.
//        int arr[]={ 12, 10, 5, 4, 2, 20, 6, 1, 0, 2 };//--Given array.
//        int n = arr.length;//---length of an array.
//        int low[]= new int[n];//var-name = new type [size]; -->array declaration. ---> here we create new array (name is low)
//        //arrays declaration -->int[] arr = new int[size]; --> here arr is the NameOfArray , new is AllocateMemory, size is the size of an array.
//        // initialy in my new array i.e low all values is 0 because my array is empty and its traverse 10 times(0 to 9) i.e n=10.
//
//        for(int i=0;i<n;i++){
//            for(int j=i+1; j<n;j++){
//                if(arr[j]<arr[i]){
//                    low[i]++;
//                }
//            }
//        }
//for(int i=0;i<n;i++){
//    System.out.print(low[i] + " ");
//}
//    }
//
//}
public  class CountSmallestArray {
    public static void main(String[] args) {
        int arr[]={ 12, 10, 5, 4, 2, 20, 6, 1, 0, 2 };
       int n = arr.length;
       int low[] = new int[n];
       for(int i=0;i<n;i++){
           for(int j=i+1;j<n;j++) {
               if (arr[j] < arr[i]) {
                   low[i]++;
               }

           }
       }
       for(int i=0;i<n;i++){
           System.out.print(low[i]+" ");
       }
    }
}

