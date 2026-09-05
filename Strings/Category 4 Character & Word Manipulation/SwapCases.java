class Swap{
    public void ConvertUpperToLowerAndLowerToUpper(String value){
        String word = "";
        for(int i = 0;i<value.length();i++){
            if(value.charAt(i) >= 'A' && value.charAt(i) <= 'Z'){
                word += Character.toLowerCase(value.charAt(i));
            }
            else if(value.charAt(i) >= 'a' && value.charAt(i) <= 'z'){
                word += Character.toUpperCase(value.charAt(i));
            }
            else{
                word += value.charAt(i);
            }
        }
        System.out.println(word);
    }
}
public class SwapCases {
    public static void main(String[] args) {
        Swap s = new Swap();
        String value = "Hello";
        s.ConvertUpperToLowerAndLowerToUpper(value);
    }
}
