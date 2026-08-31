public class lexicographically {
    public static void main(String[] args) {
        String fruit1 = "apple";
        String fruit2 = "banana";
        char[] ch1 = fruit1.toCharArray();
        char[] ch2 = fruit2.toCharArray();
        int length = fruit1.length() < fruit2.length() ? fruit1.length() : fruit2.length();
        if (fruit1.length() == fruit2.length()) {
            int count = 0;
            for (int i = 0; i < ch1.length; i++) {
                if (ch1[i] == ch2[i]) {
                    count++;
                }
            }
            if (count == ch1.length) {
                System.out.println(fruit1);
                System.out.println(fruit2);
            }
        } else {
            int i = 0;
            while (i < length) {
                if (ch1[i] < ch2[i]) {
                    System.out.println(fruit1);
                    System.out.println(fruit2);
                    return;
                } else if (ch1[i] > ch2[i]) {
                    System.out.println(fruit2);
                    System.out.println(fruit1);
                    return;
                } else {
                    i++;
                }
            }
        }
        if (fruit1.length() < fruit2.length()) {
            System.out.println(fruit1);
            System.out.println(fruit2);
        }

        else if (fruit1.length() > fruit2.length()) {
            System.out.println(fruit2);
            System.out.println(fruit1);
        }

        else {
            System.out.println(fruit1);
            System.out.println(fruit2);
        }
    }
}
