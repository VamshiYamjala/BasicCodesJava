import java.util.*;
class FindWhereItLies{
    public void QuadrantChec(int x , int y){
        if(x > 0 && y > 0){
            System.out.println("Quadrant 1 Which is Positive and Positive  Top Right (+,+)");
        }
        else if(x < 0 && y > 0){
            System.out.println("Quadrant 2 Which is Negative and Positive Top left (-,+)");
        }
        else if(x < 0 && y < 0){
            System.out.println("Quadrant 3 Which is Negative and Negative Bottom left (-,-)");
        }
        else if(x > 0 && y < 0){
            System.out.println("Quadrant 4 Which is Positive and Negative Bottom Right (+,-)");
        }
        else if( x == 0 && y == 0){
            System.out.println("No position on the Quadrant");
        }
        else{
            System.out.println("invalid position");
        }
    }
}
public class CoordinatesInQudrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FindWhereItLies fi = new FindWhereItLies();
        System.out.println("enter the x and y coordinates");
        int x = sc.nextInt();
        int y = sc.nextInt();
        fi.QuadrantChec(x, y);
        sc.close();
    }
}
