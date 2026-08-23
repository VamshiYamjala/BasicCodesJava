import java.util.*;
class FindElement{
    public void CheckElementInArray(int[] arr,int x){
        boolean found = false;
        for(int num:arr){
            if(num == x){
                System.out.println("the element is in the array "+num);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("the element not found in the array "+x);
        }
    }
}
public class ElementExistsInAArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FindElement fe = new FindElement();
        System.out.println("enter a element to find in the array");
        int x = sc.nextInt();
        int[] arr = {10,20,30,40,50,60};
        fe.CheckElementInArray(arr,x);
        sc.close();
    }
}
