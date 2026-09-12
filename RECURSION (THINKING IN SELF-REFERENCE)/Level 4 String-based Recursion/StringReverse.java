public class StringReverse {
    public static void main(String[] args) {
        String value = "hello";
        int n = value.length()-1;
        String vvalue = "";
        char[] ch = value.toCharArray();
        Reverse(ch, vvalue, n);
    }
    static void Reverse(char[] ch ,String vvalue,int n){
        if(n == -1){
            System.out.println(vvalue);
            return ;
        }
        vvalue += ch[n];
        Reverse(ch, vvalue, n - 1);
    }
}
