class Vowels{
    public void CountVowelsStart(String value){
        char[] ch = value.toCharArray();
        int count = 0;
        if((ch[0] == 'a'||ch[0] == 'e'||ch[0] == 'i'||ch[0] == 'o' ||ch[0] == 'u')||(ch[0] == 'A'||ch[0] == 'E'||ch[0] == 'I'||ch[0] == 'O' ||ch[0] == 'U')){
                count++;
            }
        for(int i = 1;i<ch.length;i++){
            if(ch[i - 1 ] == ' '){
                 if((ch[i] == 'a'||ch[i] == 'e'||ch[i] == 'i'||ch[i] == 'o' ||ch[i] == 'u')||(ch[i] == 'A'||ch[i] == 'E'||ch[i] == 'I'||ch[i] == 'O' ||ch[i] == 'U')){
                count++;
            }
            }
        }
        System.out.println(count);
    }
}
public class StartWordsVowels {
    public static void main(String[] args) {
        Vowels v = new Vowels();
        String value = "I am an engineer";
        v.CountVowelsStart(value);
    }
}
