class ReplaceVowel1{
    public void VowelReplace1(String value){
        String word = "";
        for(int i = 0;i<value.length();i++){
            if((value.charAt(i) == 'a'||value.charAt(i) == 'e'|| value.charAt(i) == 'i'|| value.charAt(i) == 'o' ||value.charAt(i) == 'u')||(value.charAt(i) == 'A'||value.charAt(i) == 'E'|| value.charAt(i) == 'I'||value.charAt(i) == 'O' || value.charAt(i) == 'U')){
                word +='*';
            }
            else{
                word+=value.charAt(i);
            }
        }
        System.out.println(word);

    }
}
public class ReplaceVowelsWithStar {
    public static void main(String[] args) {
        ReplaceVowel1 rv = new ReplaceVowel1();
        String value = "Vamshi";
        rv.VowelReplace1(value);
    }
}
