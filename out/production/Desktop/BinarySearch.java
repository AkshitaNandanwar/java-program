package out.production.Desktop;
import java.util.*;


public class BinarySearch{
    public static void main(String[] args) {
        int arr[]={15,50,40,41,56};
        Arrays.sort(arr);
        int key =15;
        int first,last;
        last =arr.length-1;
        binarysearch(arr,0,last,key);
    }

            public static void binarysearch(int arr[], int first, int last, int key){
                int mid=(first+last)/2;
                while(first<last){
                    if(arr[mid]<=last){
                        first =mid+1;
                    } else if(arr[mid] ==key){
                        System.out.println("Element found in index" + mid);
                        break;
                    } else{
                        last = mid-1;
                    }
                    mid =(first+last)/2;
                }
                if(first>last){
                    System.out.println("Element not found");
                }
            }


}
