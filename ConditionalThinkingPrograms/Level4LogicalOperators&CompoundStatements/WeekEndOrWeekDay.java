import java.util.*;
class CheckDay{
    public void WeekEndOrWeekDay(int num){
        if(num>=1 && num<=7){
            if(num >=1 && num <= 5){
                System.out.println("weekday");
            }
            else{
                System.out.println("weekend");
            }
        }
        else{
            System.out.println("day is out of the week number");
        }
    }
}
public class WeekEndOrWeekDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CheckDay cd = new CheckDay();
        System.out.println("enter the number from 1 to 7 1 = Monday and ends 7 = sunday as end");
        int num = sc.nextInt();
        cd.WeekEndOrWeekDay(num);
        sc.close();
    }
}
