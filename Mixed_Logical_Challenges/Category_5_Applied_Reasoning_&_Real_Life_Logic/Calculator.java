import java.util.Scanner;

class Ca{
    public void PrintCalculator(int num1,int num2,String v){
        switch(v){
            case "*":System.out.println(num1 * num2);
            break;
            case "/":System.out.println(num1 / num2);
            break;
            case "+":System.out.println(num1 + num2);
            break;
            case "-":System.out.println(num1 - num2);
            break;
            case "%":System.out.println(num1 % num2);
            break;
            default:System.out.println("Invaild operator");
            break;
        }
    }
}
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ca a = new Ca();
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        String v = sc.next();
        a.PrintCalculator(num1, num2, v);
        sc.close();
    }
}
