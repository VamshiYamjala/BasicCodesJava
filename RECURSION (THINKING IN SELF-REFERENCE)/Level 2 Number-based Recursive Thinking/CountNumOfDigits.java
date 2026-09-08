public class CountNumOfDigits{
    public static void main(String[] args) {
        CountNumOfDigits cn = new CountNumOfDigits();
        int count = 0;
        int n = 12345;
        System.out.println(cn.CountNum(n, count));
    }
    public int CountNum(int n,int count){
        if(n == 0){
            return count;
        }
        count++;
        n = n / 10;
        return CountNum(n, count);
    }
}