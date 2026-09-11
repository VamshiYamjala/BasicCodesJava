public class Plaindrome {
    public static void main(String[] args) {
        String name = "madam";
        String rname = "";
        int n = name.length() - 1;
        System.out.println(Palin(rname, name, n));
    }

    static boolean Palin(String rname, String name, int n) {
        if (n == -1) {
            if (rname.equals(name)) {
                return true;
            }
            return false;
        }
        rname += name.charAt(n);
        return Palin(rname, name, n-1);
    }
}
