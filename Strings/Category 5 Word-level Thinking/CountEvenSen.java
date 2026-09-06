class CountWordEven{
    public void EvenCount(String value){
        String[] word = value.split("\\s+");
        int count = 0;
        for(String w:word){
            if(w.length() % 2 == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
public class CountEvenSen {
    public static void main(String[] args) {
        CountWordEven ce = new CountWordEven();
        String value = "a bb ccc dddd";
        ce.EvenCount(value);
    }
}
