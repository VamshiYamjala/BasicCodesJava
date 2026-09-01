class Count{
    public void CountTheVowelAndConstant(String value){
        char[] ch = value.toCharArray();
        int VowelsCount = 0;
        int ConstantCount = 0;
        for(char val:ch){
            if((val == 'a'|| val == 'e'|| val == 'i'||val == 'o'||val == 'u')||(val == 'A'|| val == 'E'|| val == 'I'||val == 'O'||val == 'U')){
                VowelsCount++;
            }
            else if(val >= 'a' && val <= 'z'|| val >='A' && val <= 'Z'){
                ConstantCount++;
            }
            else{
                System.out.println("Not a alphabet string");
            }
        }
        System.out.println("Vowels : "+VowelsCount);
        System.out.println("Constant : "+ConstantCount);
    }
}
public class CountVowelsAndConstant{
    public static void main(String[] args) {
        Count c = new Count();
        String value = "Vamshi";
        c.CountTheVowelAndConstant(value);
    }
}