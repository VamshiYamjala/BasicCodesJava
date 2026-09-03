class ReverseHalf{
    public void Reverse2ndHalf(String value){
        int half = value.length() / 2;
        String val = value.substring(half);
        char[] ch = val.toCharArray();
        int first = 0;
        int last = val.length()-1;
        while(first < last){
            char temp = ch[first];
            ch[first] = ch[last];
            ch[last] = temp;
            first++;
            last--;
        }
        System.out.println(new String(ch));
    }
}
public class SecondHalfReverse {
    public static void main(String[] args) {
        ReverseHalf rh = new ReverseHalf();
        String value = "abcdef";
        rh.Reverse2ndHalf(value);
    }
}
