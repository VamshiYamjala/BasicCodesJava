import java.util.*;
class time{
    public void ShowAmOrPm(int Time){
        if(Time >= 0 && Time <= 24){
            if(Time >= 0 && Time <12){
                System.out.println("Time is in AM");
            }
            else if(Time >=12 && Time <24){
                System.out.println("Time is in PM");
            }
        }
        else{
            System.out.println("Time is not in range");
        }
    }
}
public class CheckWheatherItisAmOrPm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        time t = new time();
        System.out.println("enter the time");
        int Time = sc.nextInt();
        t.ShowAmOrPm(Time);
        sc.close();
    }
}
