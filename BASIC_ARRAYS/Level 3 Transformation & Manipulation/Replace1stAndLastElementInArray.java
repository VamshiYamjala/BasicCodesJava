import java.util.Arrays;

class Replace{
    public void replace1stAndLast(int[] arr){
        System.out.println("the element in array are "+Arrays.toString(arr));
        int first = arr[0];
        int last = arr[arr.length-1];
        for(int i = 0;i<arr.length;i++){
            if(i == 0){
                arr[i] = last;
            }
            else if(i == arr.length-1){
                arr[i] = first;
            }
        }
        System.out.println("the element in array are "+Arrays.toString(arr));
    }
}
public class Replace1stAndLastElementInArray {
    public static void main(String[] args) {
        Replace r = new Replace();
        int[] arr = {1,2,3,4,5};
        r.replace1stAndLast(arr);;
    }
}
