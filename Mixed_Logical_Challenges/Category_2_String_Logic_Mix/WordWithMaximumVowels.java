class WordsWithVowels{
    public void Words(String value){
        String value1 = value.toLowerCase();
        String[] word = value1.split("\\s+");
        int vcount = 0;
        String maxWord = "";
        for(String w:word){
            int count = 0;
            for(int i = 0;i<w.length();i++){
                if(w.charAt(i) == 'a'||w.charAt(i) == 'e'||w.charAt(i) == 'i'||w.charAt(i) == 'o'||w.charAt(i) == 'u'){
                    count++;
                }
            }
            if(vcount < count){
                vcount = count;
                maxWord = w;
            }
        }
        System.out.println(maxWord);
    }
}
public class WordWithMaximumVowels {
    public static void main(String[] args) {
        WordsWithVowels wv = new WordsWithVowels();
        String value = "java education programming development";
        wv.Words(value);
    }
}
