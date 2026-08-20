class PalindromeNum{
    public void PrintPalindrome(){
        for(int i = 1; i<= 500; i++){
            String palin = "";
            int val;
            int temp = i;

            while(temp > 0){
                val = temp % 10;
                palin += val;
                temp /= 10;
            }
            if(i == Integer.parseInt(palin)){
                System.out.println(i);
            }
        }
    }
}
public class PalindromeNumFrom1to500 {
    public static void main(String[] args) {
        PalindromeNum p = new PalindromeNum();
        p.PrintPalindrome();
    }
}
