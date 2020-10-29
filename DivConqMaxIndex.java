import java.util.Arrays;

/**
 * Author: Brian Albert
 * Date Created: 10/28/2020
 * Description: An algorithm that uses divide and conquer to find the index of the maximum element in an array
 */
public class DivConqMaxIndex {

    public static int Max(int[] A, int n){
        if (A.length > 2){  // If the array has more than two elements, split the array into two and run the algorithm with each
            int m = A.length / 2; // Find the middle of the array

            int[] b = Arrays.copyOfRange(A, 0, m); // Copy first half of array to b
            int[] c = Arrays.copyOfRange(A, m, A.length); // Copy second half of A to c
            int MaxB = Max(b, b.length);
            int MaxC = Max(c, c.length) + m;

            if (MaxB > MaxC)
                return MaxB;
            else
                return MaxC;
        } else if (A.length == 2){
            if (A[0] < A[1])
                return 1;
            else
                return 0;
        } else 
            return 0;
    }

    public static void main(String[] args) {

        int[] a = {2, 1, 5, 7, 3, 10, 6};
        
        System.out.println("Max IDX = " + Max(a, a.length));
    }
}