import java.util.Arrays;

class DuplicateChar {
    public void RemoveDuplicate(String value) {
        String word = "";
        for (int i = 0; i < value.length(); i++) {
            int count = 0;
            for (int j = 0; j < value.length(); j++) {
                if (value.charAt(i) == value.charAt(j)) {
                    count++;
                }
            }
            if(count > 1){
                continue;
            }
            word += value.charAt(i);
        }
        System.out.println(word);
    }
}

public class RemoveDuplicateChar {
    public static void main(String[] args) {
        DuplicateChar dc = new DuplicateChar();
        String value = "aabbcc";
        dc.RemoveDuplicate(value);
    }
}
