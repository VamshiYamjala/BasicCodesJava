import java.util.*;
class YearCheck{
    public void CheckTheYear(int year){
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println("Yes the year is leap year ");
        }
        else{
            System.out.println("No not a leap year ");
        }
    }
}
public class CheckWheatherTheYearLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        YearCheck ye = new YearCheck();
        System.out.print("enter the year to check wheather it is leap year or not: ");
        int year = sc.nextInt();
        ye.CheckTheYear(year);
        sc.close();
    }
}
