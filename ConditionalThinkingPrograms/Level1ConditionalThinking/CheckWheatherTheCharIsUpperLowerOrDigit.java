import java.util.*;
class CheckTheCharacter{
    public void CheckTheChar(char Character){
        if(Character >= 'a' && Character <= 'z'){
            System.out.println("the character is lowercase ");
        }
        else if(Character >= 'A' && Character <= 'Z'){
            System.out.println("the character is UpperCase ");
        }
        else if(Character >= '0' && Character <= '9'){
            System.out.println("the character is Digit ");
        }
        else{
            System.out.println("the character is Special Character ");
        }
        

    }
}
public class CheckWheatherTheCharIsUpperLowerOrDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CheckTheCharacter ctc = new CheckTheCharacter();
        System.out.print("enter the character to check wheather it is lower or upper or digit or special character :");
        char ch = sc.next().charAt(0);
        ctc.CheckTheChar(ch);
        sc.close();
    }
}
