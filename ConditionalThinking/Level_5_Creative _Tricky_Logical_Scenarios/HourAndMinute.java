import java.util.*;
class Angle{
    int ang;
    int mang;
    double hang;
    public void CheckAngle(int hour,int minute){
        if((hour >=1 && hour<=12)&&(minute >0 && minute<=60)){
            if(hour == 12){
                hang = 0;
            }
            else{
                hang = (hour*30) + (minute * 0.5);
                mang = (minute * 6);
            }
            double difference = Math.abs(hang - mang);
            if(difference > 180){
                difference = 360 - difference;
            }
            else{
                System.out.println(difference);
            }
        }
        else{
            System.out.println("the data is out of range");
        }
    }
}
public class HourAndMinute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Angle a = new Angle();
        System.out.println("enter the hour and minute");
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        a.CheckAngle(hour, minute);
        sc.close();
    }
}
