import java.util.*;
class Days{
    public void DaysInMonth(int MonthNum){
        // int Days = 30 + ((MonthNum + (MonthNum/8)) % 2);
        // System.out.println("The number of Days in Month "+MonthNum+ " is "+ Days);
        if(MonthNum >= 1 && MonthNum <= 7){
            if(MonthNum == 2){
                System.out.println(" 28 days ");
            }
            else if(MonthNum % 2 == 0){
                System.out.println(" 30 days ");
            }
            else{
                System.out.println(" 31 days ");
            }
        } 
        else if(MonthNum >= 8 && MonthNum <= 12){
            if(MonthNum % 2 == 0){
                System.out.println(" 31 days ");
            }
            else{
                System.out.println(" 30 days ");
            }
        }
        else{
            System.out.println("Invalid Month Number ");
        }
    }
}
public class NumOfDaysInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Days dy = new Days();
        System.out.println("Enter the month number from 1 - 12 to check number of days in month :");
        int DayNum = sc.nextInt();
        dy.DaysInMonth(DayNum);
        sc.close();
    }
}
