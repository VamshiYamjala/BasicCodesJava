class CheckRotation{
    public void PrintRotationOrNot(String value1,String value2){
        if(value1.length() != value2.length()){
            System.out.println("Not Rotation");
            return ;
        }
        String valuef = value1+value1;
        if(valuef.contains(value2)){
            System.out.println("Rotation");
        }
        else{
            System.out.println("Not Rotation");
        }

    }
}
public class Rotation {
    public static void main(String[] args) {
        CheckRotation cr = new CheckRotation();
        String value1 = "abcde";
        String value2 = "cdeab";
        cr.PrintRotationOrNot(value1, value2);
    }
}
