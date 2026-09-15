class MM{
    public void PrintMaxAndMin(int[] arr){
        int min = arr[0];
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(max < arr[i]){
                max = arr[i];
            }
            else if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("min value "+min);
        System.out.println("Max value "+max);
    }
}
public class MaximumAndMinimum{
    public static void main(String[] args) {
        MM m = new MM();
        int[] arr = {1,2,3,4,5,6};
        m.PrintMaxAndMin(arr);
    }
}