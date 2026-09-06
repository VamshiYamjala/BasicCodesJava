class Word{
    public void PrintWord(String value){
        String[] Word = value.split("\\s+");
        for(String sen:Word){
            System.out.println(sen);
        }
    }
}
public class EachWordNewLine{
    public static void main(String[] args) {
        Word w = new Word();
        String value = "Java is easy";
        w.PrintWord(value);
    }
}