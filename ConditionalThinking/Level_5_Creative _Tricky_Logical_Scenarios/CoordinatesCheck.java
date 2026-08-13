import java.util.*;
class Coordinates{
    public void XAndYAxis(int x , int y){
        if(x == 0 && y == 0){
            System.out.println("Origin");
        }
        else if(y == 0){
            System.out.println("X-axis");
        }
        else if(x == 0){
            System.out.println("Y-axis");
        }
        else{
            System.out.println("In a quadrant");
        }
    }
}
public class CoordinatesCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Coordinates c = new Coordinates();
        System.out.println("enter the x and y coordinates");
        int x = sc.nextInt();
        int y = sc.nextInt();
        c.XAndYAxis(x, y);
        sc.close();
    }
}
