class Remove{
    public void SpacesRemove(String value){
        String word = value.replaceAll(" ", "");
        System.out.println(word);
    }
}
public class RemoveSpaces {
    public static void main(String[] args) {
        Remove r = new Remove();
        String value = "Hello World in ja v a ";
        r.SpacesRemove(value);
    }
}
