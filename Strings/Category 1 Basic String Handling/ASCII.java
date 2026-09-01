class AsciiValues{
    public void PrintAsciiValues(String value){
        char[] ch = value.toCharArray();
        for(int i = 0;i<ch.length;i++){
            if(ch[i] >= 'a' && ch[i] <= 'z'){
                int a = ch[i];
                System.out.println(a);
            }
            else if(ch[i] >= 'A' && ch[i] <= 'Z'){
                int a = ch[i];
                System.out.println(a);
            }
            else if(ch[i] >= '0' && ch[i] <= '9'){
                int a = ch[i];
                System.out.println(a);
            }
            else if(ch[i] == ' '){
                System.out.println(32);
            }
        }
    }
}
public class ASCII {
    public static void main(String[] args) {
        AsciiValues av = new AsciiValues();
        String value = "1bc abc";
        av.PrintAsciiValues(value);
    }
}
