import java.util.*;
class FirstOccurrence{
    public void firstOccurrenceIndex(int[] arr, int n){
        boolean found = false;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == n){
                System.out.println("the element is in the array at index "+i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("element not in the array ");
        }
    }
}
public class IndexOfFirstOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FirstOccurrence fo = new FirstOccurrence();
        System.out.println("enter the element to find the first occurrence index of number  ");
        int n = sc.nextInt();
        int[] arr = {10,20,30,40,20,30,40};
        fo.firstOccurrenceIndex(arr, n);
        sc.close();
    }
}
