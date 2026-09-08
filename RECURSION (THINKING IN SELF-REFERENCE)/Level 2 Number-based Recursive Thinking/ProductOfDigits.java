public class ProductOfDigits {
    public static void main(String[] args) {
        ProductOfDigits pn = new ProductOfDigits();
        int n = 1234;
        int p = 1;
        System.out.println(pn.product(n, p));
        
    }
    public int product(int n,int p){
        if(n == 0){
            return p;
        }
        p *= n % 10;
        n /= 10;
        return product(n, p);
    }
}
