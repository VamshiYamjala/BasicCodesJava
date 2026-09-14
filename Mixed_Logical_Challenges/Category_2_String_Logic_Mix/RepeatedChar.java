class Repeated {

    public void PrintRepeatedChar(String value) {

        char[] ch = value.toCharArray();

        for(int i = 0; i < ch.length; i++){

            boolean alreadyPrinted = false;

            for(int k = 0; k < i; k++){
                if(ch[i] == ch[k]){
                    alreadyPrinted = true;
                    break;
                }
            }

            if(alreadyPrinted){
                continue;
            }

            int count = 0;
            for(int j = 0; j < ch.length; j++){
                if(ch[i] == ch[j]){
                    count++;
                }
            }

            if(count > 1){
                System.out.println(ch[i]);
            }
        }
    }
}

public class RepeatedChar {

    public static void main(String[] args) {

        Repeated r = new Repeated();

        String value = "programming";

        r.PrintRepeatedChar(value);
    }
}