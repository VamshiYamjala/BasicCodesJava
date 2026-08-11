import java.util.*;
class Angles{
    public void FindThirdAngle(int angle1 , int angle2){
        if((angle1 + angle2 >= 180) || angle1 <= 0 || angle2 <= 0){
            System.out.println("can't from a triangle ");
        }
        else{
            System.out.println("the third angle is "+(180 - (angle1+angle2)));
        }
    }
}
public class TakeTwoAnglesAndCompute3rd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Angles a = new Angles();
        System.out.println("enter the 1st and 2nd angles ");
        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();
        a.FindThirdAngle(angle1, angle2);
        sc.close();
    }
}
