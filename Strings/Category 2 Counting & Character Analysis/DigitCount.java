class CountDigit{
    public void CountDigitsInString(String Value){
        char[] ch = Value.toCharArray();
        int DigitCountNum = 0;
        for(char val:ch){
            if(val >='0' && val <= '9'){
                DigitCountNum++;
            }
        }
        System.out.println("DigitCount : "+DigitCountNum);
    }
}
public class DigitCount {
    public static void main(String[] args) {
        CountDigit cd = new CountDigit();
        String Value = "Vamshi123";
        cd.CountDigitsInString(Value);
    }
}
