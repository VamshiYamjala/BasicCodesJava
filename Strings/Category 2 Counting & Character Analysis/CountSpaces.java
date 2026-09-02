class Spaces{
    public void CountNumOfSpaces(String value){
        char[] ch = value.toCharArray();
        int SpacesCount = 0;
        for(int i = 0;i<ch.length;i++){
            if(ch[i] == ' '){
                SpacesCount++;
            }
        }
        System.out.println("Spaces Count : "+SpacesCount);
    }
}
public class CountSpaces {
    public static void main(String[] args) {
        Spaces s = new Spaces();
        String value = "Java is easy";
        s.CountNumOfSpaces(value);
    }
}
