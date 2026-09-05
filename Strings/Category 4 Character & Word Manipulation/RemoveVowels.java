class Vowels{
    public void VowelsRemove(String value){
        String word = "";
        for(int i = 0;i<value.length();i++){
            if((value.charAt(i) == 'a'||value.charAt(i) == 'e'|| value.charAt(i) == 'i'|| value.charAt(i) == 'o' ||value.charAt(i) == 'u')||(value.charAt(i) == 'A'||value.charAt(i) == 'E'|| value.charAt(i) == 'I'||value.charAt(i) == 'O' || value.charAt(i) == 'U')){
                continue;
            }
            else{
                word+=value.charAt(i);
            }
        }
        System.out.println(word);
    }
}
public class RemoveVowels{
    public static void main(String[] args) {
        Vowels v = new Vowels();
        String value = "Vamshi";
        v.VowelsRemove(value);
    }
}