public class TrianglePattern {
    public static void main(String[] args) {
        int n = 1;
        Triangle(n);
    }
    static void Triangle(int n){
        if(n == 6){
            return ;
        }
        System.out.print("*".repeat(n));
        System.out.println();
        Triangle(n+1);      
    }
}
