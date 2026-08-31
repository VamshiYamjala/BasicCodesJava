public class WordCount {
    public static void main(String[] args) {
        int WordCount = 1;
        String sen = "Java is easy to learn";
        char[] ch = sen.toCharArray();
        for(int i = 0;i<ch.length;i++){
            if(ch[i] == ' '){
                WordCount++;
            }
        }
        System.out.println(WordCount);
    }
}
