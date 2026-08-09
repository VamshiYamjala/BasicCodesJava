import java.util.*;
class Alphabet{
    public void CheckAlphabetPosition(char alp){
        if((alp >= 'a' && alp <= 'm') || (alp >= 'A' && alp <= 'M')  ){
            System.out.println("The entered alphabet lies between a - m");
        }
        else if((alp >= 'n' && alp <= 'z') || (alp >= 'N' && alp <= 'Z')){
            System.out.println("The entered alphabet lies between n - z");
        }
        else{
            System.out.println("Invalid charater");
        }
    }
}
public class AlphabetCharacterCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Alphabet a = new Alphabet();
        System.out.println(" enter the character to check whether where it lies between a to z ");
        char alp = sc.next().charAt(0);
        a.CheckAlphabetPosition(alp);
        sc.close();
    }
}
