public class MultiplicationTable {
    public static void main(String[] args) {
        int n = 5;
        int i = 1;
        Table(n, i);
    }
    static void Table(int n,int i){
        if(i == 11){
            return ;
        }
        System.out.printf(n + " * "+ i +" = "+n*i);
        System.out.println();
        Table(n, i+1);
    }
}
