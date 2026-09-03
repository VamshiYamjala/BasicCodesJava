class CheckPalindrome{
    public void CheckPalindromeOrNot(String value){
        String val = value;
        char[] ch = value.toCharArray();
        int left = 0;
        int right = ch.length -1;
        while(left < right){
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
        String v = new String(ch);
        if(val.equals(v)){
            System.out.println("is palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}
public class Palindrome {
    public static void main(String[] args) {
        CheckPalindrome cp = new CheckPalindrome();
        String value = "madam";
        cp.CheckPalindromeOrNot(value);
    }
}
