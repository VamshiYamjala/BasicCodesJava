class RemoveConsecutive{
    public void DuplicateCharRemove(String value){
        String word = "";
        for(int i = 0;i<value.length();i++){
            if((i > 0) && (value.charAt(i) == value.charAt(i - 1))){
                continue;
            }
            else{
                word += value.charAt(i);
            }
        }
        System.out.println(word);
    }
}
public class ConsecutiveDuplicateCharacters {
    public static void main(String[] args) {
        RemoveConsecutive rc = new RemoveConsecutive();
        String value = "hello";
        rc.DuplicateCharRemove(value);
    }
}
