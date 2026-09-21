import java.util.Random;

class HT {
    public void PrintCountOfHOrT(int n) {
        int countH = 0;
        int CountT = 0;

        Random r = new Random();

        for (int i = 0; i < n; i++) {

            int toss = r.nextInt(n);

            if (toss == 0) {
                countH++;
            } else {
                CountT++;
            }
        }

        System.out.println("Heads: " + countH);
        System.out.println("Tails: " + CountT);
    }
}

public class HeadOrTails {
    public static void main(String[] args) {
        HT h = new HT();
        int n = 10;
        h.PrintCountOfHOrT(n);
    }
}
