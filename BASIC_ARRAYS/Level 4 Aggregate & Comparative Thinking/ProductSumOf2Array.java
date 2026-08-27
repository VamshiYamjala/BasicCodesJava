import java.util.Arrays;

class Product{
    public void ProductOf2Arrays(int[] arr ,int[] arr2){
        int[] productArray = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            productArray[i] = (arr[i]*arr2[i]);
        }
        System.out.println(Arrays.toString(productArray));
    }
}
public class ProductSumOf2Array {
    public static void main(String[] args) {
        Product p = new Product();
        int[] arr = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10};
        p.ProductOf2Arrays(arr, arr2);
    }
}
