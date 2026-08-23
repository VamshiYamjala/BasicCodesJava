import java.util.*;
class CountElement{
    public void countOccuranceOfElement(int[] arr,int n){
        int count = 0;
        for(int num:arr){
            if(num == n){
                count++;
            }
        }
        System.out.println("the number as occured "+count+" times ");
    }
}
public class CountOccuranceOfElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CountElement ce = new CountElement();
        System.out.println("enter the element to find the number of time the element occured ");
        int n = sc.nextInt();
        int[] arr = {10,11,22,33,55,10,99,10,19};
        ce.countOccuranceOfElement(arr, n);
        sc.close();


    }
}
