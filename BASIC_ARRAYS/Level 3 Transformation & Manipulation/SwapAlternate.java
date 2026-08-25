import java.util.*;

class Swap {
    public void alternateSwap(int[] arr) {
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length-1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}

public class SwapAlternate {
    public static void main(String[] args) {
        Swap s = new Swap();
        int[] arr = { 1, 2, 3, 4, 5 };
        s.alternateSwap(arr);
    }
}
