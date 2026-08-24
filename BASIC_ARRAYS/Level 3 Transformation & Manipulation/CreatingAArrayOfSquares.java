import java.util.*;

class NewArray {
    public void squareArray(int[] arr1, int[] arr2) { 
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i] * arr1[i]; 
        }
        
        System.out.println("The 1st array elements are: " + Arrays.toString(arr1));
        System.out.println("The 2nd array elements are: " + Arrays.toString(arr2));
    }
}

public class CreatingAArrayOfSquares {
    public static void main(String[] args) {
        NewArray na = new NewArray();
        
        int[] arr1 = {2, 3, 5};
        int[] arr2 = new int[arr1.length]; 
        
        na.squareArray(arr1, arr2);
    }
}
