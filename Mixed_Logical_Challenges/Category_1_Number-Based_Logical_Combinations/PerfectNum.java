class Perfect{
    public void PrintPerfectNum(int num){
        int number = num;
        int per = 0;
        for(int i = 1;i<num;i++){
            if(num % i == 0){
                per += i;
            }
        }
        if(number == per){
            System.out.println(number+" is a perfect number ");
        }
        else{
            System.out.println(number+" is not a perfect number ");
        }
    }
}
public class PerfectNum {
    public static void main(String[] args) {
        Perfect p = new Perfect();
        int num = 28;
        p.PrintPerfectNum(num);
    }
}
