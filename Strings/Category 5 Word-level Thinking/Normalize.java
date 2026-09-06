class NormalizeString{
    public void printNormalizeString(String value){
        String words = value.trim();
        String[] word = words.split("\\s+");
        for(String w:word){
            w = w.trim();
            System.out.print(w+" ");
        }
    }
}
public class Normalize {
    public static void main(String[] args) {
        NormalizeString ns = new NormalizeString();
        String value = " I am a student ";
        ns.printNormalizeString(value);
    }
}
