class Shift{
    public void ShiftCharby1(String value){
        String word ="";
        for(int i = 0;i<value.length();i++){
            word+=(char)(value.charAt(i)+1);
        }
        System.out.println(word);
    }
}
public class ShiftChar {
    public static void main(String[] args) {
        Shift s = new Shift();
        String value = "abc";
        s.ShiftCharby1(value);
    }
}
