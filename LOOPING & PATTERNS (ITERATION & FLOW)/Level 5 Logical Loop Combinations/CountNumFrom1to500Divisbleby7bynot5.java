class CountNun{
    public void DivisibleBy7notby5(){
        int count = 0;
        for(int i = 1; i<= 500 ; i++){
            int temp = i;
            if((temp % 7 == 0) && (temp % 5 != 0)){
                count++;
            }
        }
        System.out.println(count);
    }
}
public class CountNumFrom1to500Divisbleby7bynot5 {
    public static void main(String[] args) {
        CountNun cn = new CountNun();
        cn.DivisibleBy7notby5();
    }
}
