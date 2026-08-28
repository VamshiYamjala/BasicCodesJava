class AscSorted {
    public void checkSortedAsc(int[] arr) {
        int left = 0;
        int right = 1;
        boolean asc = true;
        while (right < arr.length) {
            if (arr[left] > arr[right]) {
                asc = false;
                break;
            }
            left++;
            right++;
        }
        if (asc == true) {
            System.out.println("Yes it is in ascending order ");
        } else {
            System.out.println("not in ascending order");
        }

    }
}

public class CheckArrayIsInSortedAsc {
    public static void main(String[] args) {
        AscSorted as = new AscSorted();
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        as.checkSortedAsc(arr);
    }
}