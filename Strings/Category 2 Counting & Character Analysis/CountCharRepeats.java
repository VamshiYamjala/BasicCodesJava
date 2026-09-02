class CharRepeat{
    public void CountCHar(String value,char a){
        char[] ch = value.toCharArray();
        int countChar = 0;
        for(int i = 0;i<ch.length;i++){
            if(ch[i] == a){
                countChar++;
            }
        }
        System.out.println("the character "+a+" repeated "+countChar);
    }
}
public class CountCharRepeats {
    public static void main(String[] args) {
        CharRepeat cr = new CharRepeat();
        String value = "Array";
        char a = 'r';
        cr.CountCHar(value, a);
    }
}
