public class ReplaceChar {
    public static void main(String[] args) {
        int n = 0;
        String value = "banana";
        char[] ch = value.toCharArray();
        String vname = "";
        Replace(ch, vname,n);
    }
    static void Replace(char[] ch,String vname,int n){
        if(n == ch.length){
            System.out.println(vname);
            return ;
        }
        if(ch[n] == 'a'){
            vname += 'o';
        }
        else{
            vname += ch[n];
        }
        Replace(ch, vname, n+1);
    }
}
