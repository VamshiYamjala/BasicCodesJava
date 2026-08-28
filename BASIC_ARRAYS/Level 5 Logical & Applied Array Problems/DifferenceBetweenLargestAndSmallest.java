class Difference{
    public void DifferenceSmallestAndLargest(int[] arr){
        int Largest = arr[0];
        int smallest = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(Largest < arr[i]){
                Largest = arr[i];
            }
            if(smallest > arr[i]){
                smallest = arr[i];
            }
        }
        System.out.println("Largest "+Largest);
        System.out.println("Smallest "+smallest);
        System.out.println("the Difference Between Largest and smallest is "+(Largest-smallest));
    }
}
public class DifferenceBetweenLargestAndSmallest {
    public static void main(String[] args) {
        Difference d = new Difference();
        int[] arr = {1,2,3,4,5};
        d.DifferenceSmallestAndLargest(arr);
    }
}
