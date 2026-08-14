import java.util.*;
class Century{
    public void CheckTheCentury(int year){
        if((year % 10 == 0 )&& ((year / 10 ) % 10 == 0)){
            int cen = year / 100;
            System.out.println("the century is "+cen);
        }
        else{
            int cent = (year / 100) + 1;
            System.out.println("the century is "+cent);

        }
    }
}
public class Century_Calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Century c = new Century();
        System.out.println("enter the year");
        int year = sc.nextInt();
        c.CheckTheCentury(year);
        sc.close();
    }
}
