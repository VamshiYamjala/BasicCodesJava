class CountFrequency{
    public void CountArrayFrequency(int[] arr){
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
            System.out.println(" Number "+arr[i]+" occured "+count+" times ");
        }
    }
}
public class FrequencyCount {
    public static void main(String[] args) {
        CountFrequency cf = new CountFrequency();
        int[] arr ={1,2,2,3,3,4,5};
        cf.CountArrayFrequency(arr);
    }
}
