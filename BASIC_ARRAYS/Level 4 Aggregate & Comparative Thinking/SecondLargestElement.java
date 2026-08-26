class SecondLargest {
    public void largest2ndElement(int[] arr) {
        int largest = arr[0];
        int secondLargest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            if((arr[i] > secondLargest) && (arr[i] != largest)){
                secondLargest = arr[i];
            }
        }
        System.out.println(secondLargest);

    }
}

public class SecondLargestElement {
    public static void main(String[] args) {
        SecondLargest sl = new SecondLargest();
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        sl.largest2ndElement(arr);
    }
}
