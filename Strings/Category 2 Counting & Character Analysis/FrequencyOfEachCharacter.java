import java.util.Arrays;

class EachCharCount{
    public void FrequencyOfEachChar(String value){
        char[] ch = value.toCharArray();
        Arrays.sort(ch);
        for(int i = 0;i<ch.length;i++){
            int count = 0;
            if((i>0) && (ch[i] == ch[i-1])){
                continue;
            }
            for(int j = 0;j<ch.length;j++){
                if(ch[i] == ch[j]){
                    count++;
                }
            }
            System.out.println("the Frequency of element is "+ch[i]+" is "+count);
        }
    }
}
public class FrequencyOfEachCharacter {
    public static void main(String[] args) {
        EachCharCount ec = new EachCharCount();
        String value  = "Array";
        ec.FrequencyOfEachChar(value);
    }
}
