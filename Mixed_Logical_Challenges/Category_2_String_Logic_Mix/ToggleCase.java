class Toggle{
    public void ToggleAlternative(String value){
        String value1 = "";
        String[] words = value.split("\\s+");
        for(int i = 0;i<words.length;i++){
            if((i == 0) ||(i % 2 == 0)){
                value1 += words[i].toUpperCase();
                value1 += " ";
            }
            else{
                value1+= words[i];
                value1+= " ";
            }
        }
        System.out.println(value1);
    }
}
public class ToggleCase {
    public static void main(String[] args) {
        Toggle t = new Toggle();
        String value = "java is very easy to learn";
        t.ToggleAlternative(value);
    }
}
