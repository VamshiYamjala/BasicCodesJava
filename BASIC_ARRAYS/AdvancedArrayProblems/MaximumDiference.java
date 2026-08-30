class Difference{
    public void DifferenceBetween2Elements(int[] arr){
        int smallest = arr[0];
        int largest = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(smallest > arr[i]){
                smallest = arr[i];
            }
            if(largest < arr[i]){
                largest = arr[i];
            }
        }
        System.out.println("the Maximum difference of 2 elements is  "+(largest - smallest));
    }
}
public class MaximumDiference {
    public static void main(String[] args) {
        Difference d = new Difference();
        int[] arr = {1,2,3,4,5,6,7,8};
        d.DifferenceBetween2Elements(arr);
    }
}
