class Longest{
    public void PrintLongestWord(String value){
        String[] word = value.split("\\s+");
        String Long = "";
        for(String w:word){
            if(Long.length() < w.length()){
                Long = w;
            }
        }
        System.out.println(Long);
    }
}
public class LongestWord {
    public static void main(String[] args) {
        Longest l = new Longest();
        String value = "Java is easy";
        l.PrintLongestWord(value);
    }
}
