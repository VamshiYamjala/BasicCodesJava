public class CharactersRecursively {
    public static void main(String[] args) {
        char n = 'A';
        Characters1(n);
    }
    static void Characters1(char n){
        if(n == 'F'){
            return ;
        }
        C('A', n);
        System.out.println();
        Characters1((char)(n+1));
    }
    static void C(char i,char n){
        if(i > n){
            return ;
        }
        System.out.print(i);
        C((char)(i+1),n);
    }
}
