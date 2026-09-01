class CheckString{
    public void CheckStringEmptyOrNot(String value){
        if(value.isEmpty()){
            System.out.println("Empty");
        }
        else{
            System.out.println("Not empty");
        }
    }
}
public class StringEmptyOrNot {
    public static void main(String[] args) {
        CheckString cs = new CheckString();
        String value = "vamshi";
        cs.CheckStringEmptyOrNot(value);
    }
}
