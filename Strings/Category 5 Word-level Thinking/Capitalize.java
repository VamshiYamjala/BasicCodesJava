class First{
    public void CapitalizeFirstLetter(String value){
        String[] word = value.split("\\s+");
        for(String w:word){
            char[] ch = w.toCharArray();
            ch[0] = Character.toUpperCase(ch[0]);
            System.out.print(ch);
            System.out.print(" ");
        }
    }
}
public class Capitalize{
    public static void main(String[] args) {
        First f = new First();
        String value = "java is easy";
        f.CapitalizeFirstLetter(value);
    }
}