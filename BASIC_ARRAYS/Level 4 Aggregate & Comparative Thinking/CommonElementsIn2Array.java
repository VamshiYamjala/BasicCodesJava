import java.util.Arrays;

class TwoArray{
    public void CommonElementsInArray(int[] arr1,int[] arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i = 0;i<arr2.length-1;i++){
            if(i > 0 && arr2[i] == arr2[i+1]){
                continue;
            }
            for(int j = 0;j<arr1.length;j++){
                if(arr2[i] == arr1[j]){
                    System.out.println(arr2[i]);
                    break;
                }
            }
        }
    }
}
public class CommonElementsIn2Array {
    public static void main(String[] args) {
        TwoArray ta = new TwoArray();
        int[] arr1 ={1,3,4,5,6,7,8};
        int[] arr2 ={9,8,7,6,5,7,8,3,3,2,1};
        ta.CommonElementsInArray(arr1, arr2);
    }
}
