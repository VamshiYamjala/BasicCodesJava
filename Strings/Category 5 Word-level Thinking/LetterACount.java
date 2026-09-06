class A{
    public void PrintCountOfA(String value){
        String[] word = value.split("\\s+");
        int count = 0;
        for(String w:word){
            if(w.contains("a")){
                count++;
            }
        }
        System.out.println(count);
    }
}
public class LetterACount {
    public static void main(String[] args) {
        A a = new A();
        String value = "Java is easy";
        a.PrintCountOfA(value);
    }
}
