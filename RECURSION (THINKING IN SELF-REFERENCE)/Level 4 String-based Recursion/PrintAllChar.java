public class PrintAllChar {
    public static void main(String[] args) {
        String word = "Hello";
        char[] ch = word.toCharArray();
        int n = 0;
        LetterPrint(ch, n);
    }
    static void LetterPrint(char[] ch,int n){
        if(n == ch.length){
            return ;
        }
        System.out.println(ch[n]);
        LetterPrint(ch, n+1);
    }
}
