class Short{
    public void PrintShortestWord(String value){
        String[] word = value.split("\\s+");
        String shortword = value.substring(0,value.indexOf(" "));
        for(String w:word){
            if(shortword.length() > w.length()){
                shortword = w;
            }
        }
        System.out.println(shortword);
    }
}
public class Shortest {
    public static void main(String[] args) {
        Short s = new Short();
        String value = "Java is easy";
        s.PrintShortestWord(value);
    }
}
