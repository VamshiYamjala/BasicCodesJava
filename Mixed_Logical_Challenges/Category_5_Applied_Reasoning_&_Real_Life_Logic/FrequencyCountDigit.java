class FrequencyCount {

    public void Count(String num) {

        for (int i = 0; i < num.length(); i++) {

            boolean alreadyPrinted = false;

            for (int k = 0; k < i; k++) {
                if (num.charAt(i) == num.charAt(k)) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (alreadyPrinted) {
                continue;
            }

            int count = 0;

            for (int j = 0; j < num.length(); j++) {
                if (num.charAt(i) == num.charAt(j)) {
                    count++;
                }
            }

            System.out.println(num.charAt(i) + ":" + count);
        }
    }
}

public class FrequencyCountDigit {

    public static void main(String[] args) {

        FrequencyCount fc = new FrequencyCount();

        String num = "1223341";

        fc.Count(num);
    }
}