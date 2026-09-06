class Swap {
    public void SwapWords(String value) {
        String[] word = value.split("\\s+");
        String temp = word[0];
        word[0] = word[word.length - 1];
        word[word.length - 1] = temp;
        String w = String.join(" ", word);
        System.out.println(w);
    }
}

public class SwapFirstAndLast {
    public static void main(String[] args) {
        Swap s = new Swap();
        String value = "Java is easy";
        s.SwapWords(value);
    }
}
