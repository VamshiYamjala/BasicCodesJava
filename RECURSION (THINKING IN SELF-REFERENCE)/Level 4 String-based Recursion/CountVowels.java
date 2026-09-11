public class CountVowels {
    public static void main(String[] args) {
        String name = "programming";
        int n = name.length()-1;
        int count = 0;
        CountVowels cv = new CountVowels();
        System.out.println(cv.Vowels(name, n, count));
    }
    public int Vowels(String name,int n,int count){
        if(n == -1){
            return count;
        }
        if((name.charAt(n) == 'a'||name.charAt(n) == 'e'||name.charAt(n) == 'i'||name.charAt(n) == 'o'||name.charAt(n) == 'u')||(name.charAt(n) == 'A'||name.charAt(n) == 'E'||name.charAt(n) == 'I'||name.charAt(n) == 'O'||name.charAt(n) == 'U')){
            count++;
        }
        return Vowels(name, n-1, count);
    }
}
