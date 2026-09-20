class CommonChar{
    public void PrintCommonChar(String value1,String value2){
        for(int i = 0;i<value1.length();i++){
            for(int j =0;j<value2.length();j++){
                if(value1.charAt(i) == value2.charAt(j)){
                    System.out.println(value1.charAt(i));
                }
            }
        }
    }
}
public class CharactersCommonString{
    public static void main(String[] args) {
        CommonChar cc = new CommonChar();
        String value1 = "hello";
        String value2 = "world";
        cc.PrintCommonChar(value1, value2);
    }
}