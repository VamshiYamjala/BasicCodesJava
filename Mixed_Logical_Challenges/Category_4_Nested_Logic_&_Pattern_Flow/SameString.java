class PrintSameString{
    public void PrintString(String value){
        char[] ch = value.toCharArray();
        for(int i = 0;i<ch.length;i++){
            for(int j = i+1;j<ch.length;j++){
                if(ch[i] == ch[j]){
                    System.out.println(ch[i]+" "+ch[j]);
                }
            }
        }
    }
}
public class SameString{
    public static void main(String[] args) {
        PrintSameString ps = new PrintSameString();
        String value = "banana";
        ps.PrintString(value);
    }
}