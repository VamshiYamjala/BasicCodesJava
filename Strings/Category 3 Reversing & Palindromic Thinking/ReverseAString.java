class Reverse{
    public void StringReverse(String value){
        char[] ch = value.toCharArray();
        int first = 0;
        int last = ch.length - 1;
        while(first < last){
            char temp = ch[first];
            ch[first] = ch[last];
            ch[last] = temp;
            first++;
            last--;
        }
        System.out.println( new String(ch));
    }
}
public class ReverseAString{
    public static void main(String[] args) {
        Reverse r = new Reverse();
        String value = "Array";
        r.StringReverse(value);
    }
}