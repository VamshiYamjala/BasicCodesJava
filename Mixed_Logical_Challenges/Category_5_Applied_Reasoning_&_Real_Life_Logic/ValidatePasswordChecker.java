class Password{
    public void PasswordChecker(String value){
        boolean Capital = false;
        boolean Small = false;
        boolean Number = false;
        boolean Special = false;
        for(int i = 0;i<value.length();i++){
            if(value.charAt(i) > 'a' && value.charAt(i) < 'z'){
                Small = true;
            }
            else if(value.charAt(i) > 'A' && value.charAt(i) < 'Z'){
                Capital = true;
            }
            else if(value.charAt(i) > '0' && value.charAt(i) < '9'){
                Number = true;
            }
            else{
                Special = true;
            }
        }
        if(Capital == true && Small == true && Special == true && Number == true){
            System.out.println("Valid password");
        }
        else{
            System.out.println("Invalid password");
        }
    }
}
public class ValidatePasswordChecker {
    public static void main(String[] args) {
        Password p = new Password();
        String value = "Abc@123";
        p.PasswordChecker(value);
    }
}
