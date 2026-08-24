class PerfectSquare{
    public void CountPerfectSquare(int[] arr){
        int psCount = 0;
        for(int num:arr){
            if(num>=0){
                double sqrt = Math.sqrt(num);
            
            if(sqrt % 1 == 0){
                psCount++;
            }
        }
        }
        System.out.println("the count of perfectSquares in the array are "+psCount);

    }
}
public class CountOfPerfectSquare {
    public static void main(String[] args) {

        PerfectSquare ps = new PerfectSquare();
        int[] arr = {4,9,16,7,4};
        ps.CountPerfectSquare(arr);
    }
}
