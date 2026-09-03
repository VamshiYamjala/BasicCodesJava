class OrderR{
    public void ReverseOrderString(String value){
        String[] words = value.split("\\s+");
        int left = 0;
        int right = words.length - 1;
        while(left < right){
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }
        String sen = String.join(" ",words);
        System.out.println(sen);
    }
}
public class ReverseTheOrderOfWords {
    public static void main(String[] args) {
        OrderR or = new OrderR();
        String value = "Java is easy";
        or.ReverseOrderString(value);
    }
}
