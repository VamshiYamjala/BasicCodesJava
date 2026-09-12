public class RemoveChar {
    public static void main(String[] args) {
        String value = "banana";
        String vvalue = "";
        char[] ch = value.toCharArray();
        int n = 0;
        char c = 'a';
        Remove(ch, vvalue, n,c);
    }
    static void Remove(char[] ch,String vvalue,int n,char c){
        if(n == ch.length){
            System.out.println(vvalue);
            return ;
        }
        if(ch[n] == c){
            vvalue += "";
        }
        else{
            vvalue += ch[n];
        }
        Remove(ch, vvalue, n+1,c);
    }
}
