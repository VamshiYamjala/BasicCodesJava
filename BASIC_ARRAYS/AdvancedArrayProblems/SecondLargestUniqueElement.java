class SecondLargest{
    public void UniqueSecondLargest(int[] arr){
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(largest < arr[i]){
                second = largest;
                largest = arr[i];
            }
            if(arr[i] > second && arr[i] != largest){
                second = arr[i];
            }
        }
        if(second == largest){
            System.out.println("no second largest element");
        }
        else{
            System.out.println(second);
        }
    }
}
public class SecondLargestUniqueElement{
    public static void main(String[] args) {
        SecondLargest sl = new SecondLargest();
        int[] arr = {10, 5, 8, 10, 3, 8};
        sl.UniqueSecondLargest(arr);
    }
}