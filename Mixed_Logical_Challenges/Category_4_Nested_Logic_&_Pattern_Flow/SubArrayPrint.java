class Sub{
    public void PrintSubArray(int[] num){
        for(int i = 0;i<num.length;i++){
            for(int j = i;j<num.length;j++){
                for(int k = i;k<=j;k++){
                    System.out.print(num[k]+" ");
                }
                System.out.println();
            }
        }
    }
}
public class SubArrayPrint {
    public static void main(String[] args) {
        Sub s = new Sub();
        int[] num = {1,2,3};
        s.PrintSubArray(num);
    }
}
