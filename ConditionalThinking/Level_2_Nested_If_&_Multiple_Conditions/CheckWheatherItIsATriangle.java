import java.util.*;
class CheckTheSideFormATriangle{
    public void ChecSides(int side1,int side2,int side3){
        if(side1 + side2 >= side3 || side2 + side3 >= side1 || side3 + side1 >= side2){
            System.out.println("It forms a Triangle : ");
        }
        else{
            System.out.println("No it Doesn't Forms a Triangle :");
        }
    }

}
public class CheckWheatherItIsATriangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CheckTheSideFormATriangle ct = new CheckTheSideFormATriangle();
        System.out.println("enter the 3 sides to check wheather it is triangle or not :");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();
        ct.ChecSides(side1, side2, side3);
        sc.close();
    }

}