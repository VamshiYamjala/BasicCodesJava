import java.util.Arrays;

class Duplicate {
    public void DuplicateInArray(int[] arr) {
        int n = arr.length;
        int[] newarrray = new int[n];
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > 1) {
                boolean isarr = true;
                for (int k = 0; k < newarrray.length; k++) {
                    if (arr[i] == newarrray[k]) {
                        isarr = false;
                        break;
                    }
                }
                if (isarr == true) {
                    newarrray[s] = arr[i];
                    s++;
                }
            }
        }
        System.out.println(Arrays.toString(newarrray));
    }
}

public class DuplicateElementsInArray {
    public static void main(String[] args) {
        Duplicate d = new Duplicate();
        int[] arr = { 1, 2, 3, 2, 4, 2, 3, 1, 4, 5, 6, 7, 8 };
        d.DuplicateInArray(arr);
    }
}
