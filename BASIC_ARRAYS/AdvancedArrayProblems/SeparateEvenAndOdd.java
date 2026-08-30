import java.util.Arrays;

class Separate {
    public void EvenAndOdd(int[] arr) {
        int[] arr2 = new int[arr.length];
        int CountOdd = 0;
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                CountOdd++;
                continue;
            }
            arr2[j] = arr[i];
            j++;
        }
        int k = (arr.length - CountOdd);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr2[k] = arr[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}

public class SeparateEvenAndOdd {
    public static void main(String[] args) {
        Separate s = new Separate();
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        s.EvenAndOdd(arr);
    }
}