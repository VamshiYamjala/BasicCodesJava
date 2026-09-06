class Title{
    public void PrintTitleCase(String value){
        String[] word = value.split("\\s+");
        for(String w:word){
            char[] ch = w.toCharArray();
            ch[0] = Character.toUpperCase(ch[0]);
            for(int i = 1;i<ch.length;i++){
                ch[i] = Character.toLowerCase(ch[i]);
            }
            System.out.print(ch);
            System.out.print(" ");
        }
    }
}
public class TitleCase {
    public static void main(String[] args) {
        Title t = new Title();
        String value = "java is easy";
        t.PrintTitleCase(value);
    }
}
