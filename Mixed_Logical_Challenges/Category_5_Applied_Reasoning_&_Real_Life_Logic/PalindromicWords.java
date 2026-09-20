import java.util.Arrays;

class Palindrome{
    public void PrintPalindrome(String value){
        String[] v = value.split("\\s+");
        for(String words:v){
            String word ="";
            for(int i =words.length()-1;i>=0;i--){
                word += words.charAt(i);
            }
            if(words.equals(word)){
                System.out.println(word);
            }
        }
    }
}
public class PalindromicWords {
    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        String value = "madam level hello radar";
        p.PrintPalindrome(value);
    }
}
