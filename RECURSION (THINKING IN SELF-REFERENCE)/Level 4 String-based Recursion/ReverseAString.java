public class ReverseAString{
    public static void main(String[] args) {
        String name = "Hello";
        int n = name.length() -1;
        Reverse(name, n);
    }
    static void Reverse(String name,int n){
        if(n == -1){
            return ;
        }
        System.out.print(name.charAt(n));
        Reverse(name, n - 1);
    }
}