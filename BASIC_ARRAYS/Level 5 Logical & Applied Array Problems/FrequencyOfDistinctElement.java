import java.util.Arrays;

class Frequency{
    public void countFrequency(int[] arr){
        Arrays.sort(arr);
        for(int i = 0;i<arr.length;i++){
            int count = 0;
            if((i > 0) && arr[i] == arr[i-1]){
                continue;
            }
            for(int j = 0;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            System.out.println("the count of "+arr[i]+" is "+count+" times");
        }
    }
}
public class FrequencyOfDistinctElement{
    public static void main(String[] args) {
        Frequency f = new Frequency();
        int[] arr = {1,2,3,2,1,2,4,5,6,3,4,3,9};
        f.countFrequency(arr);
    }
}