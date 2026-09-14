class Vowels {
    public void PrintReplaceVowelsWithNum(String value) {
        String value1 = value.toLowerCase();
        String value2 = "";
        char[] ch = value1.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            switch (ch[i]) {
                case 'a':
                    value2 += '1';
                    break;
                case 'e':
                    value2 += '2';
                    break;
                case 'i':
                    value2 += '3';
                    break;
                case 'o':
                    value2 += '4';
                    break;
                case 'u':
                    value2 += '5';
                    break;
                default:
                    value2 += ch[i];
                    break;
            }
        }
        System.out.println(value2);
    }
}

public class ReplaceVowels {
    public static void main(String[] args) {
        Vowels v = new Vowels();
        String value = "hello";
        v.PrintReplaceVowelsWithNum(value);
    }
}
