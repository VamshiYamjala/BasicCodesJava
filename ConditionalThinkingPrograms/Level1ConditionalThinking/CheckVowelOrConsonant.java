import java.util.*;
class CheckCharaterisVowel{
    public boolean CheckChar(char Character){
        if(Character == 'a' ||Character == 'e'||Character == 'i'||Character == 'o'||Character == 'u'){
            System.out.println("the character entered is vowel :");
            return true;
        }
        else{
            System.out.println("the character entered is constant :");
            return false;
        }
    }
}
public class CheckVowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CheckCharaterisVowel ck = new CheckCharaterisVowel();
        System.out.print("enter the character to check wheather it is vowel or constant : ");
        char ch = sc.next().charAt(0);
        System.out.println(ck.CheckChar(ch));
        sc.close();

    }
}
