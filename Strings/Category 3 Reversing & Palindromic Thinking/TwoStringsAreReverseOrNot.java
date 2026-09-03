class TwoString{
    public void CheckString(String value,String value2){
        char[] ch = value.toCharArray();
        int left = 0;
        int right = ch.length-1;
        while(left < right){
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
        String val = new String(ch);
        if(val.equals(value2)){
            System.out.println("They are reverse of each other ");
        }
        else{
            System.out.println("No They are reverse of each other ");
        }
    }
}
public class TwoStringsAreReverseOrNot {
    public static void main(String[] args) {
        TwoString ts = new TwoString();
        String value = "hello";
        String value2 = "olleh";
        ts.CheckString(value, value2);
    }
}
