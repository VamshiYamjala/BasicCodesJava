class RemoveDigitsInString{
    public void RemoveDigits(String value){
        String word = "";
        for(int i = 0;i<value.length();i++){
            if(value.charAt(i) == '0' || value.charAt(i) == '1'|| value.charAt(i) == '2'|| value.charAt(i) == '3'|| value.charAt(i) == '4'|| value.charAt(i) == '5'|| value.charAt(i) == '6'|| value.charAt(i) == '7'|| value.charAt(i) == '8'|| value.charAt(i) == '9'){
                continue;
            }
            else{
                word += value.charAt(i);
            }
        }
        System.out.println(word);
    }
}
public class PrintStringRemoveDigits {
    public static void main(String[] args) {
    RemoveDigitsInString rd = new RemoveDigitsInString();
    String value = "Vamshi123";
    rd.RemoveDigits(value);
    }
}
