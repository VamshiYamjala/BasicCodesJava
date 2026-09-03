class EachWord {
    public void PrintReverseEachword(String value) {
        char[] ch = value.toCharArray();
        int left = 0;
        while (left < ch.length) {
            int space = value.indexOf(" ",left);
            int right;
            if(space == -1){
                right = ch.length -1;
            }
            else{
                right = space -1 ;
            }
            int original = right;
            while (left < right) {
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            }
            left = original + 2;
        }
        System.out.println(new String(ch));
    }
}

public class ReverseEachWord {
    public static void main(String[] args) {
        EachWord ew = new EachWord();
        String value = "Java is easy";
        ew.PrintReverseEachword(value);
    }
}
