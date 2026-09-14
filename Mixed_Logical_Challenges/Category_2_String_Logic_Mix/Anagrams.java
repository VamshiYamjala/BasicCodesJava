import java.util.*;
class Ana{
    public void PrintAnagramOrNot(String name,String name2){
        if(name.length() != name2.length()){
            System.out.println("not a Anagram");
            return;
        }
        char[] ch1 = name.toCharArray();
        char[] ch2 = name2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(Arrays.equals(ch1,ch2)){
            System.out.println("yes it is a anagram");
        }
        else{
            System.out.println("not a anagram");
        }
    }
}
public class Anagrams{
    public static void main(String[] args) {
        Ana a = new Ana();
        String name = "listen";
        String name2 = "silent";
        a.PrintAnagramOrNot(name, name2);
    }
}