import java.util.Arrays;

class Duplicate1{
    public void removeDuplicate(int[] arr){
        Arrays.sort(arr);
        int[] newArray = new int[arr.length];
        int count = 0;
        newArray[count] =arr[0];
        count++;
        for(int i = 1;i<arr.length;i++){
            if(arr[i] != arr[i-1]){
                newArray[count] = arr[i];
                count++;
            }
        }
        System.out.println(Arrays.toString(Arrays.copyOf(newArray, count)));
    
    }
}
public class RemoveDuplicateElement {
    public static void main(String[] args) {
        Duplicate1 d = new Duplicate1();
        int[] arr = {1,1,2,2,3,4,4,6,7,1,3,2,4,5,6};
        d.removeDuplicate(arr);
    }
}
