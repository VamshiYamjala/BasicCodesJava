class Common{
    public void CommonElements(int[] arr,int[] arr1){
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr1.length;j++){
                if(arr[i] == arr1[j]){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
public class CommonElementsInArray {
    public static void main(String[] args) {
        Common c = new Common();
        int[] arr = { 1, 2 ,3 ,4 ,5};
        int[] arr1 = {3 ,4 ,5 ,6 ,7};
        c.CommonElements(arr, arr1);
    }
}
