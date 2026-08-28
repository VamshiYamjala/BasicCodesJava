import java.util.Arrays;

class Avg{
    public void GreaterThenAvg(int[] arr,double avg){
        System.out.println(Arrays.toString(arr));
        System.out.println(avg);
        int count = 0;
        for(int num:arr){
            if(num > avg){
                count++;
            }
        }
        System.out.println(count);
    }
}
public class CountElementsGreaterThenAvg {
    public static void main(String[] args) {
        Avg a = new Avg();
        int[] arr ={1,2,3,4,5,6,7,8};
        double sum = 0;;
        for(int i = 0;i<arr.length;i++){
            sum+=arr[i];
        }
        double avg = (sum/arr.length);
        a.GreaterThenAvg(arr, avg);
    }
}
