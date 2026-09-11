public class RemoveAllSpaces {
    public static void main(String[] args) {
        String value = "java is easy";
        char[] va = value.toCharArray();
        String v = "";
        int n = 0;
        Remove(va, v, n);
    }
    static void Remove(char[] va,String v,int n){
        if(n == va.length){
            System.out.println(v);
            return ;
        }
        if(va[n] != ' '){
            v += va[n];   
        }
        Remove(va, v, n+1);

    }
}
