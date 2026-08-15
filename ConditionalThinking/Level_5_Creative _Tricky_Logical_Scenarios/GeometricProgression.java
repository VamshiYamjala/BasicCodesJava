import java.util.Scanner;

class GeometricProgressionCheck{
    public void CheckGeometricProgression(int num1 , int num2 ,int num3){
        if((num2 * num2) == (num1 * num3)){
            System.out.println("True");
        }
        else{
            System.out.println("false");
        }
    }
}

public class GeometricProgression {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GeometricProgressionCheck ac = new GeometricProgressionCheck();
        System.out.println("enter the numbers in ascending order to get Arithmethic or not ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        ac.CheckGeometricProgression(num1, num2, num3);
        sc.close();
    }
}
