class Divisile{
    public void NumDivisible(int[] arr){
        int CountDiv = 0;
        for(int num:arr){
            if((num % 3 == 0) && (num % 5 == 0)){
                CountDiv++;
            }
        }
        System.out.println("In the give array the count of numbers divisible by both 3 & 5 are "+CountDiv);
    }
}
public class NumDivisibleBy3And5 {
    public static void main(String[] args) {
        Divisile d = new Divisile();
        int[] arr = {5,3,6,9,15,18,21,24,27,30};
        d.NumDivisible(arr);
    }
}
