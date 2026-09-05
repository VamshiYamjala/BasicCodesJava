class ReplaceSpace{
    public void SpaceReplace(String value){
        String word = "";
        for(int i = 0;i<value.length();i++){
            if(value.charAt(i) == ' '){
                word += '_';
            }
            else{
                word += value.charAt(i);
            }
        }
        System.out.println(word);
    }
}
public class ReplaceSpacesWithUnderScore {
    public static void main(String[] args) {
        ReplaceSpace rs = new ReplaceSpace();
        String value = "Hello world";
        rs.SpaceReplace(value);
    }
}
