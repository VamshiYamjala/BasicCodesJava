import java.util.*;
class CheckWheather{
    public void CheckWheatherbyTemp(float temp){
        if(temp <=20.0){
            System.out.println("the temperature is cold and the temperature is: "+temp);
        }
        else if(temp >= 20.0 && temp <=32.0){
            System.out.println("the temperature is warm and the temperature is : "+temp);
        }
        else if(temp >= 33.0)
        {
            System.out.println("the temperature is hot and the temperature is : "+temp);
        }
    }
}
public class TemperaturePredictionUsingRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CheckWheather cw = new CheckWheather();
        System.out.print("enter the temperature to check your wheather: ");
        float temp = sc.nextInt();
        cw.CheckWheatherbyTemp(temp);
        sc.close();
    }
}
