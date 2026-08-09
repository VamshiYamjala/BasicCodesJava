import java.util.*;
class CheckTheSideFormATriangles{
    public void ChecSidesA(int side1,int side2,int side3){
        if(side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2){
            if(side1 == side2 && side2 == side3 ){
                System.out.println("Equilateral Triangle");
            }
            else if(side1 == side2 || side2 == side3 || side3 == side1){
                System.out.println("Isosceles Triangle");
            }
            else if(side1 != side2 && side2 != side3 && side3 != side1){
                System.out.println("Scalene Triangle");
            }
            System.out.println("It forms a Triangle : ");
        }
        else{
            System.out.println("No it Doesn't Forms a Triangle :");
        }
    }

}
public class CheckWhatTypeOfTriangleTheyForm{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CheckTheSideFormATriangles ct = new CheckTheSideFormATriangles();
        System.out.println("enter the 3 sides to check wheather it is triangle or not :");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();
        ct.ChecSidesA(side1, side2, side3);
        sc.close();
    }

}
