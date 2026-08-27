import java.util.*;
class Common{
    public void CommonElementsCount(int[] arr1,int[] arr2){
        int count = 0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i = 0;i<arr1.length;i++){
            if((i > 0) && (arr1[i] == arr1[i-1])){
                continue;
            }
            for(int j = 0;j<arr2.length;j++){
                if(arr1[i] == arr2[j]){
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
public class CountHowManyElementsAreCommon {
    public static void main(String[] args) {
        Common c = new Common();
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {8,6,4,9,5};
        c.CommonElementsCount(arr1, arr2);
    }
}
