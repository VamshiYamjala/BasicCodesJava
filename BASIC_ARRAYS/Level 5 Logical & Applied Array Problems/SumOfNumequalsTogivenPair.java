class SumOfelements{
    public void CountSumEqualtok(int[] arr,int k){
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i] + arr[j] == k){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
public class SumOfNumequalsTogivenPair {
    public static void main(String[] args) {
        SumOfelements se = new SumOfelements();
        int[] arr = {6,8,5,10,4,5,9};
        int k = 14;
        se.CountSumEqualtok(arr,k);
    }
}
