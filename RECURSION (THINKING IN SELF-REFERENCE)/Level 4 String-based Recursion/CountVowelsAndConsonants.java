public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        String name = "hello";
        char[] ch = name.toCharArray();
        String vvalue = "";
        int n = 0;
        int vcount = 0;
        int ccount = 0;
        VowelsAndConsonants(vvalue, ch, n,vcount,ccount);
    }
    static void VowelsAndConsonants(String vvalue,char[] ch,int n,int vcount,int ccount){
        if(n == ch.length){
            System.out.println("Vowels: "+vcount);
            System.out.println("Consonants: "+ccount);
            return ;
        }
        if((ch[n] == 'a'|| ch[n] == 'e'|| ch[n] == 'i'|| ch[n] == 'o'|| ch[n] == 'u')||(ch[n] == 'A'|| ch[n] == 'E'|| ch[n] == 'I'|| ch[n] == 'O'|| ch[n] == 'U')){
            vcount++;
        }
        else{
            ccount++;
        }
        VowelsAndConsonants(vvalue, ch, n+1, vcount, ccount);
    }
}
