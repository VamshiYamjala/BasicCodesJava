class CountSpecial{
    public void CountSpecialString(String Value){
        char[] ch = Value.toCharArray();
        int SpecialCount = 0;
        for(char val:ch){
            if((val >='a' && val <='z')||(val >='A' && val <='Z')||(val >='0' && val <='9')){
                continue;
            }
            else{
                SpecialCount++;
            }
        }
        System.out.println("SpecialCount : "+SpecialCount);
    }

}
public class SpecialCharacters {
    public static void main(String[] args) {
        CountSpecial cs = new CountSpecial();
        String Value = "$$Vam$$";
        cs.CountSpecialString(Value);
    }
}
