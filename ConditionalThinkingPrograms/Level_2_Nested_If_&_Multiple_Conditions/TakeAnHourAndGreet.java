import java.util.*;
class CheckTimeAndGreet{
    public void Greet(int time){
        if(time >=0 && time < 12){
            System.out.println("Good Morning! ");
        }
        else if(time >= 12 && time < 17){
            System.out.println(" Good Afternoon! ");
        }
        else if(time >= 17 && time < 20){
            System.out.println("Good evening! ");
        }
        else if(time >= 20 && time < 24){
            System.out.println("Good Night! ");
        }
        else{
            System.out.println("invaild time check it once! ");
        }
    }
}
public class TakeAnHourAndGreet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CheckTimeAndGreet cg = new CheckTimeAndGreet();
        System.out.print("Enter the time according to 24hrs format! ");
        int time = sc.nextInt();
        cg.Greet(time);
        sc.close();
    }
}
