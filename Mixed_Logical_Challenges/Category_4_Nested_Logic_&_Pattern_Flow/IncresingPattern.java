class Pattern{
    public void PrintPattern(){
        for(char ch = 'A';ch<'F';ch++){
            for(char c = 'A';c<=ch;c++){
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}
public class IncresingPattern {
    public static void main(String[] args) {
        Pattern p = new Pattern();
        p.PrintPattern();
    }
}
