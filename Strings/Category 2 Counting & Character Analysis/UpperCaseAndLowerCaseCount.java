class CountLetters{
    public void CountUpperAndLower(String Value){
        char[] ch = Value.toCharArray();
        int LowerCaseCount = 0;
        int UpperCaseCount = 0;
        for(char val:ch){
            if(val >='a' && val <='z'){
                LowerCaseCount++;
            }
            else if(val >='A' && val <='Z'){
                UpperCaseCount++;
            }
            else{
                System.out.println("invalid input");
            }
        }
        System.out.println("LowerCase Count :" + LowerCaseCount);
        System.out.println("UpperCase Count :" + UpperCaseCount);
    }
}
public class UpperCaseAndLowerCaseCount {
    public static void main(String[] args) {
        CountLetters cl = new CountLetters();
        String Value = "VAmshi";
        cl.CountUpperAndLower(Value);
    }
}
