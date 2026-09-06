class StartAndEnd{
    public void CheckStartAndEndAreSame(String value){
        String[] word = value.split("\\s+");
        for(String w:word){
            char[] ch = w.toCharArray();
            if(ch[0] == ch[ch.length - 1]){
                System.out.print(w+" ");
            }
        }
    }
}
public class WordStartsAndEndsWithSameLetter {
    public static void main(String[] args) {
        StartAndEnd se = new StartAndEnd();
        String value = "level radar hello";
        se.CheckStartAndEndAreSame(value);
    }    
}
