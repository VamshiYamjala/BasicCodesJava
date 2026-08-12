import java.util.*;
class CheckInput{
    public void CheckInputType(char ch){
        if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z'){
            System.out.println("It is a letter");
        }
        else if(ch >='0' && ch<='9'){
            System.out.println("it is a digit");
        }
        else{
            System.out.println("neither of digit or letter");
        }
    }
}
public class CheckWheatherItIsNumOrLetter{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CheckInput ci = new CheckInput();
        System.out.println("enter the data");
        char ch = sc.next().charAt(0);
        ci.CheckInputType(ch);
        sc.close();
    }
}