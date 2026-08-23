import java.util.*;
class LastOccurance{
    public void lastOccuranceIndex(int[] arr , int n){
        boolean found = false;
        for(int i = arr.length -1;i>=0;i--){
            if(arr[i] == n){
                System.out.println("the last index of the element in the array is "+i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("element not in the array ");
        }
    }
}
public class IndexOfLastOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LastOccurance lo = new LastOccurance();
        System.out.println("enter the element to find the index of lastOcuurance of the element ");
        int n = sc.nextInt();
        int[] arr = {10,20,30,20,49,39,20};
        lo.lastOccuranceIndex(arr, n);
        sc.close();

    }
}
