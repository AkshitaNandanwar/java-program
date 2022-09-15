import java.util.*;
public class NonRepitive_element {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int arr[] ={1,2,3,2,3};
        int size = arr.length;
        boolean isSame = false;
        int first =arr[0];
        int second =Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        for(int i =1;i<size;i++){

        }

//        for(int i =1;i<size;i++){
//            if(arr[i]>first){
//                third=second;
//                second=first;
//                first=arr[i];
//            } else if(arr[i]>second){
//                second =first;
//                first =arr[i];
//            } else if(arr[i]>third){
//                third =arr[i];
//            }
//        }
//
////
//        System.out.println(third);

//        for(int i=0;i<size;i++){
//            for(int j=0;j<size;j++){
//                if(i !=j && arr[i] == arr[j]){
//                    isSame =true;
//                    break;
//                }
//            }
//            if(isSame == false){
//                System.out.println(arr[i]);
//                break;
//            }else {
//                isSame =false;
//            }
//        }
//
    }
}
