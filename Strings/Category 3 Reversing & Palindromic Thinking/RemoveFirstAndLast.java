class FirstAndLast{
    public void printStringWithoutFirstAndLast(String value){
        int length = value.length()-1;
        String val = value.substring(1,length);
        System.out.println(val);
    }
}
public class RemoveFirstAndLast {
    public static void main(String[] args) {
        FirstAndLast fl = new FirstAndLast();
        String value = "abcdef";
        fl.printStringWithoutFirstAndLast(value);
    }
}
