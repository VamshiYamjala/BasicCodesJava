class Prime{
    public void CountPrimeNum(int[] arr){
        int primeCount = 0;
        for(int i = 0;i<arr.length;i++){
            int count = 0;
            for(int j =1;j<=arr[i];j++){
                if(arr[i] % j == 0){
                    count++;
                }
            }
            if(count == 2){
                primeCount++;
            }
        }
        System.out.println(primeCount);
    }
}
public class PrimeNumbersInArray {
    public static void main(String[] args) {
        Prime p = new Prime();
        int[] arr = {2, 4, 5, 7, 9, 11};
        p.CountPrimeNum(arr);
    }
}
