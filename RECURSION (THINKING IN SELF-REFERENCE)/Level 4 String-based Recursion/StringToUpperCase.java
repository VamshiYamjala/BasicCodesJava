public class StringToUpperCase {
    public static void main(String[] args) {
        String name = "hello";
        char[] ch = name.toCharArray();
        int n = 0;
        String vvalue = "";
        UpperCase(ch, vvalue, n);
    }
    static  void UpperCase(char[] ch,String vvalue,int n){
        if(n == ch.length){
            System.out.println(vvalue);
            return ;
        }
        if(Character.isLowerCase(ch[n])){
            vvalue += Character.toUpperCase(ch[n]);
        }
        else{
            vvalue += ch[n];
        }
        UpperCase(ch, vvalue, n+1);
    }
}
