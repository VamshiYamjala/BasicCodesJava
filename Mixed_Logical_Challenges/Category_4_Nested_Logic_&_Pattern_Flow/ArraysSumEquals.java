class SumEquals{
    public void PrintSumEquals(int[] num,int target){
        for(int i = 0;i<num.length;i++){
            for(int j = i+1;j<num.length;j++){
                if(num[i] + num[j] == target){
                    System.out.println(num[i]+" + "+num[j]+" = "+(num[i]+num[j]));
                }
            }
        }
    }
}
public class ArraysSumEquals {
    public static void main(String[] args) {
        SumEquals se = new SumEquals();
        int[] num = {2, 4, 3, 5, 7, 8, 1};
        int target = 9;
        se.PrintSumEquals(num, target);
    }
}
