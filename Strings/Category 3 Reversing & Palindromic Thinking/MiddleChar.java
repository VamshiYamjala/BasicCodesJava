class PrintMiddleValue{
    public void printValue(String value){
        int val = (value.length() / 2);
        if(value.length() % 2 != 0){
            System.out.println(value.charAt(val));
        }
        else{
            System.out.print(value.charAt(val - 1));
            System.out.print(value.charAt(val ));
        }
    }
}
public class MiddleChar {
    public static void main(String[] args) {
        PrintMiddleValue pm = new PrintMiddleValue();
        String value = "Vamshi";
        pm.printValue(value);
    }
}
