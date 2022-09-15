import java.util.*;
public class SecondLargestElemrnt {
  //  public class SecondMaxElement {
        public static void main(String[] args) {
            int arr[] = { 12, 35, 1, 10, 34, 1 };
            int n = arr.length;
            // print2largest(arr, n);
            int i, first, second;
            /* There should be atleast two elements */
            if (n < 2) {
                System.out.print(" Invalid Input ");
                return;
            }
            first = second = Integer.MIN_VALUE;
            for (i = 0; i < n; i++) {
                /*
                 * If current element is greater than
                 * first then update both first and second
                 */
                if (arr[i] > first) {
                    second = first;
                    first = arr[i];
                }
                /*
                 * If arr[i] is in between first and
                 * second then update second
                 */
                else if (arr[i] > second && arr[i] != first)
                    second = arr[i];
            }
            if (second == Integer.MIN_VALUE)
                System.out.print("There is no second largest"
                        + " element\n");
            else
                System.out.print("The second largest element"
                        + " is " + second);
        }
   // }
}
