class Smallest{
    public void SecondSmallest(int[] arr){
        int firstSmallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;
        for(int i = 1;i < arr.length;i++){
            if(firstSmallest > arr[i]){
                secondSmallest = firstSmallest;
                firstSmallest = arr[i];
            }
            else if(arr[i] < secondSmallest && arr[i] != firstSmallest){
                secondSmallest = arr[i];
            }
        }
        System.out.println(secondSmallest);
    }
}
public class SecondSmallestElementInArray {
    public static void main(String[] args) {
        Smallest s = new Smallest();
        int[] arr = {1,2,3,4,5,6,7,8};
        s.SecondSmallest(arr);
    }
}
