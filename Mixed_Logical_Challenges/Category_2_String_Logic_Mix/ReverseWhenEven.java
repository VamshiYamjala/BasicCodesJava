class Reverse{
    public void PrintReverseIfEvenLength(String value){
        String[] v = value.split("\\s+");
        String value1 = "";
        for(String va:v){
            if(va.length() % 2 == 0){
                for(int i = va.length()-1;i>=0;i--){
                    value1+=va.charAt(i);
                }
                value1+=" ";
            }
            else{
                value1+=va;
                value1+=" ";
            }
        }
        System.out.println(value1);
    }
}
public class ReverseWhenEven {
    public static void main(String[] args) {
        Reverse r = new Reverse();
        String value = "Java is very easy";
        r.PrintReverseIfEvenLength(value);
    }
}
