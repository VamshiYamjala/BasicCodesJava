import java.util.*;

class RotateAnArray {
    public void kPositionRotate(int[] arr, int k) {
        if (k > arr.length) {
            k = (k % arr.length);
        }
        int split = arr.length - k;
        int[] firstArray = new int[split];
        int[] secondArray = new int[arr.length - split];
        for (int i = 0; i < arr.length; i++) {
            if (i < split) {
                firstArray[i] = arr[i];
            } else {
                secondArray[i - split] = arr[i];
            }
        }
        System.arraycopy(secondArray, 0, arr, 0, secondArray.length);
        System.arraycopy(firstArray, 0, arr, (secondArray.length), firstArray.length);
        System.out.println(Arrays.toString(arr));
    }
}

public class RotateAnArrayByKPositions {
    public static void main(String[] args) {
        RotateAnArray r = new RotateAnArray();
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int k = 3;
        r.kPositionRotate(arr, k);
    }
}