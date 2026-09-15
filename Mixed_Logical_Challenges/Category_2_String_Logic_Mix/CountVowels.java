class Vowels1{
    public void PrintCountVowels(String value){
        String value1 = value.toLowerCase();
        String[] v = value1.split("\\s+");
        for(String w:v){
            int count = 0;
            for(int i = 0;i<w.length();i++){
                if(w.charAt(i) == 'a'||w.charAt(i) == 'e'||w.charAt(i) == 'i'||w.charAt(i) == 'o'||w.charAt(i) == 'u'){
                    count++;
                }
            }
            System.out.println(w+" -> "+count);
        }
    }
}
public class CountVowels {
    public static void main(String[] args) {
        Vowels1 v = new Vowels1();
        String value ="I love programming";
        v.PrintCountVowels(value);
    }
}
