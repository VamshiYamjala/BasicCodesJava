import java.util.Arrays;

class ReplaceElement{
    public void ReplaceNegative(int[] arr1){
         System.out.println("the elements  before replace in array "+Arrays.toString(arr1));
        for(int i = 0;i<arr1.length;i++){
            if(arr1[i] < 0){
                arr1[i] = 0;
            }
        }
        System.out.println("the elements in array "+Arrays.toString(arr1));
    }
}
public class ReplaceNegativeNumWithZero {
    public static void main(String[] args) {
        ReplaceElement re = new ReplaceElement();
        int[] arr1 = {-2,-3,4,5,6,-6,7,-7,8};
        re.ReplaceNegative(arr1);
    }
}
