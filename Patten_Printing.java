import java.util.*;
import java.util.Scanner;
public class Patten_Printing {
    public static  void main(String args[]){
Scanner sc = new Scanner(System.in);
//int a = sc.nextInt();
//int b = sc.nextInt();
////Solid Rectangle
////outer loop == rows
//for(int i=1;i<=a;i++){
//   //inner loop == coloumns
//    for(int j=1;j<=b;j++){
//        System.out.print("*");
//    }
//    System.out.println("*");
//}
//  //Hollow Rectangle
// for(int i=0;i<=a;i++){
//     for (int j=0;j<=b;j++){
//         if(  i==0 || j==0 || i==a|| j==b) {
//             System.out.print("*");
//         } else{
//             System.out.print(" ");
//         }
//     }
//     System.out.println();
// }

//Half Triangle
// for(int i=a;i>=0;i--){
//     for(int j=0;j<=i;j++){
//         System.out.print("*");
//     }
//    System.out.println();

// }
for(int i=0; i<=10;i++){
    for(int j=0;j<=i;j++){
        System.out.print("*");
    }
    System.out.println();
    
}
for(int i=10; i>=0;i--){
    for(int j=0;j<=i;j++){
        System.out.print("*");
    }
    System.out.println();
    
}

    }
}
