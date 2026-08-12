import java.util.*;
class Digit{
    public void ToWord(int num){
        switch(num){
            case 1:System.out.println("One");
            break;
            case 2:System.out.println("Two");
            break;
            case 3:System.out.println("Three");
            break;
            case 4:System.out.println("Four");
            break;
            case 5:System.out.println("Five");
            break;
            case 6:System.out.println("six");
            break;
            case 7:System.out.println("seven");
            break;
            case 8:System.out.println("eight");
            break;
            case 9:System.out.println("nine");
            break;
            case 0:System.out.println("zero");
            break;
            default:System.out.println("invalid not in range");
        }
    }
}
public class DigitToWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Digit d = new Digit();
        System.out.println("enter number from 0-9");
        int num = sc.nextInt();
        d.ToWord(num);
        sc.close();
    }
}
