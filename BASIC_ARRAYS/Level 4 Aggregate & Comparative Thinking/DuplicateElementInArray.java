class Duplicate{
    public void DuplicateElement(int[] arr){
        // for(int i = 0;i<arr.length-1;i++){
        //     if(arr[i] == arr[i+1]){
        //         System.out.println(arr[i]);
        //     }
        // }
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
public class DuplicateElementInArray {
    public static void main(String[] args) {
        Duplicate d = new Duplicate();
        int[] arr = {1,2,3,3,4,4,5,5,6};
        d.DuplicateElement(arr);
    }
}
