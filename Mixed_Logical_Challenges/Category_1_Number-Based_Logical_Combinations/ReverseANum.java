class Reverse{
    public void PrintReverseNum(int num){
        int rnum = 0;
        int rem = 0;
        while(num > 0){
            rem = num % 10;
            rnum = rnum * 10 + rem;
            num /= 10;
        }
        System.out.println(rnum);
    }
}
public class ReverseANum {
    public static void main(String[] args) {
        Reverse r = new Reverse();
        int num = 123;
        r.PrintReverseNum(num);
    }
}
