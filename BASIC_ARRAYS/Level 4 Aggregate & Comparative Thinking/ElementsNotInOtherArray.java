import java.util.Arrays;

class NotSame{
    public void ElementsNotin2(int[] arr1,int[] arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i = 0;i<arr1.length;i++){
            boolean found = false;
            for(int j = 0;j<arr2.length;j++){
                if(arr1[i] == arr2[j]){
                    found = true;
                    break;
                }
            }
            if(!found){
                System.out.println(arr1[i]);
            }
        }
    }
}
public class ElementsNotInOtherArray {
    public static void main(String[] args) {
        NotSame ns = new NotSame();
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {9,7,6,56,4};
        ns.ElementsNotin2(arr1, arr2);
    }
}
