class CountNum{
    public void PrintCountOfNum(int[] num){
        int positiveNum = 0;
        int negativeNum = 0;
        int zeroNum = 0;
        for(int i = 0;i<num.length;i++){
            if(num[i] == 0){
                zeroNum++;
            }
            else if(num[i] > 0){
                positiveNum++;
            }
            else if(num[i] < 0){
                negativeNum++;
            }
        }
        System.out.println("positive :"+positiveNum);
        System.out.println("negative :"+negativeNum);
        System.out.println("zeros :"+zeroNum);
    }
}
public class CountPositiveNegativeAndZero {
    public static void main(String[] args) {
        CountNum cn = new CountNum();
        int[] num = {10, -5, 0, 8, -2, 0, 15, -7};
        cn.PrintCountOfNum(num);
    }
}
