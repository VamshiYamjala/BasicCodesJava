import java.util.*;
class Triangle{
    public void SidesOfTriangle(int side1 , int side2 , int side3){
        if(side1 >= side2 && side1 >= side3){
            if(((side2 * side2)+(side3 * side3) == (side1*side1))){
                System.out.println("True it is a PythagoreanTriplet");
            }
            else{
                System.out.println("False not a PythagoreanTriplet");
            }
        }
        else if(side2 >= side1 && side2 >= side3){
            if(((side1 * side1)+(side3 * side3) == (side2 * side2))){
                System.out.println("True it is a PythagoreanTriplet");
            }
            else{
                System.out.println("False not a PythagoreanTriplet");
            }
        }
        else{
            if(((side2 * side2)+(side1 * side1) == (side3*side3))){
                System.out.println("True it is a PythagoreanTriplet");
            }
            else{
                System.out.println("False not a PythagoreanTriplet");
            }

        }
    }
}
public class PythagoreanTripletChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangle t = new Triangle();
        System.out.println("enter the 3 sides of the triangle ");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();
        t.SidesOfTriangle(side1, side2, side3);
        sc.close();
    }
}
