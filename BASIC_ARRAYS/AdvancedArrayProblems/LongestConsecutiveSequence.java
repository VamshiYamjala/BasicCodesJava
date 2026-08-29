import java.util.Arrays;

class Longest{
    public void longestSequence(int[] arr){
        Arrays.sort(arr);
        int count = 1;
        int longcount = 1;
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i+1] - arr[i]== 1){
                count++;
                if(count > longcount){
                    longcount = count;
                }
            }
            else if(arr[i+1] != arr[i]){
                count = 1;
            }
        }
        System.out.println(longcount);
    }
}
public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        Longest l = new Longest();
        int[] arr = {100, 4, 200, 1, 3, 2};
        l.longestSequence(arr);
    }
}
