class SubString{
    public void CountSubString(String value){
        char[] ch = value.toCharArray();
        int count = 0;
        for(int i = 0;i<ch.length;i++){
            for(int j = i;j<ch.length;j++){
                if(ch[i] == ch[j]){
                    count++;
                }
            }
        }
        System.out.println("the count is "+ count);
    }
}
public class CountSubStringSame {
    public static void main(String[] args) {
        SubString ss = new SubString();
        String value = "aba";
        ss.CountSubString(value);
    }
}
