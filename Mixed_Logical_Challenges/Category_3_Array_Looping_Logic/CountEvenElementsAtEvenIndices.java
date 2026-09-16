class CountEven{
    public void CountEvenElements(int[] num){
        int EvenCount =0;
        for(int i = 0;i<num.length;i++){
            if(((i == 0) && (num[i] % 2 == 0))||((i % 2 == 0) && (num[i] % 2 == 0))){
                EvenCount++;
            }
        }
        System.out.println(EvenCount);
    }
}
public class CountEvenElementsAtEvenIndices {
    public static void main(String[] args) {
        CountEven ce = new CountEven();
        int[] num =  {2, 5, 8, 7, 10, 3};
        ce.CountEvenElements(num);
    }
}
