import java.util.Arrays;

class StringreverseSkip {
    public void SkipSpaces(String value) {
        char[] ch = value.toCharArray();
        int left = 0;
        int right = ch.length - 1;
        while (left < right) {
            if (ch[left] == ' ') {
                left++;
            } else if (ch[right] == ' ') {
                right--;
            } else {
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            }
        }
        System.out.println(new String(ch));
    }
}

public class ReverseStringSkipSpaces {
    public static void main(String[] args) {
        StringreverseSkip sr = new StringreverseSkip();
        String value = "abc def";
        sr.SkipSpaces(value);
    }
}
