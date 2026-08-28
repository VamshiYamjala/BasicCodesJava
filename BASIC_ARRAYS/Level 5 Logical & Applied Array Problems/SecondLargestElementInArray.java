class Largest{
    public void secondLargestArray(int[] arr){
        int largest = arr[0];
        int secondLargest = 0;
        for(int i = 1;i<arr.length;i++){
            if(largest < arr[i]){
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }
        System.out.println(secondLargest);
    }
}
public class SecondLargestElementInArray {
    public static void main(String[] args) {
        Largest l = new Largest();
        int[] arr = {1,2,3,4,5,6,7,8};
        l.secondLargestArray(arr);
    }
}
