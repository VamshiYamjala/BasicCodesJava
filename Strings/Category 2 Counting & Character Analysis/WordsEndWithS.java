class Words{
    public void EndsWithS(String value){
        char[] ch = value.toCharArray();
        int count = 0;
        if(ch[ch.length-1] == 's'||ch[ch.length-1] == 'S'){
            count++;
        }
        for(int i = 0;i<ch.length-1;i++){
            if(ch[i + 1] == ' '){
                if(ch[i] == 's' || ch[i] == 'S'){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
public class WordsEndWithS {
    public static void main(String[] args) {
        Words w = new Words();
        String value = "This is a test";
        w.EndsWithS(value);
    }
}
