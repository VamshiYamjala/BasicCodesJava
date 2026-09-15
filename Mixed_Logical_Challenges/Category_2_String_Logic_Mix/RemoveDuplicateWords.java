class Remove{
    public void RemoveDuplicate(String value){
        String[] word = value.split("\\s+");
        String value1 = "";
        for(int j = 0;j<word.length;j++){
            boolean duplicate = false;
            for(int i = 0;i<j;i++){
                if(word[j].equals(word[i])){
                    duplicate = true;
                    break;
                }
            }
            if(!duplicate){
                value1 += word[j]+" ";
            }

        }
        System.out.println(value1);
    }
}
public class RemoveDuplicateWords {
    public static void main(String[] args) {
        Remove r = new Remove();
        String value = "java is easy java is powerful";
        r.RemoveDuplicate(value);
    }
}
