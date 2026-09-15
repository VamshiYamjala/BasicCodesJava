class CountCharWord{
    public void PrintCharCount(String value){
        String[] word = value.split("\\s+");
        int count = 0;
        for(String w:word){
            if(w.charAt(0) == w.charAt(w.length()-1)){
                count++;
            }
        }
        System.out.println(count);
    }
}
public class CountTheWordsStartsAndENd {
    public static void main(String[] args) {
        CountCharWord cc = new CountCharWord();
        String value = "madam apple civic hello level";
        cc.PrintCharCount(value);
    }
}
