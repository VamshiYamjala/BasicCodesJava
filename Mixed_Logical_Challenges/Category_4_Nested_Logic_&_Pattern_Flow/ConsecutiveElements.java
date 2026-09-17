class Consecutive{
    public void PrintNumOfConsecutive(int[] num){
        int count = 1;
        for(int i = 0;i<num.length-1;i++){
            if(num[i+1] - num[i] != 1){
                count++;
            }
        }
        System.out.println(count);
    }
}
public class ConsecutiveElements {
    public static void main(String[] args) {
        Consecutive c = new Consecutive();
        int[] num = {1, 2, 3, 5, 6, 8, 9, 10};
        c.PrintNumOfConsecutive(num);
    }
}
