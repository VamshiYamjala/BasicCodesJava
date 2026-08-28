import java.util.*;
class Unique {
    public void printUnique(int[] arr) {
        Arrays.sort(arr);
        for(int i = 0;i< arr.length;i++){
            int count = 0;
            if((i > 0) && arr[i] == arr[i-1]){
                continue;
            }
            for(int j = 0;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count == 1){
                System.out.println("the Unique element that occurs only once is :"+arr[i]);
            }
        }
    }
}

public class UniqueElements {
    public static void main(String[] args) {
        Unique u = new Unique();
        int[] arr = { 1, 2, 3, 2, 1, 2, 4, 5, 6, 3, 4, 3, 9 };
        u.printUnique(arr);

    }
}
