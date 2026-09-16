class Unique{
    public void PrintUnique(int[] num){
        for(int i = 0;i<num.length;i++){
            int count = 0;
            for(int j = 0;j<num.length;j++){
                if(num[i] == num[j]){
                    count++;
                }
            }
            if(count == 1){
                System.out.println(num[i]);
            }
        }
    }
}
public class UniqueElementsInArray {
    public static void main(String[] args) {
        Unique u = new Unique();
        int[] num = {10, 20, 10, 30, 40, 30};
        u.PrintUnique(num);
    }
}
