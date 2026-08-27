class MoreThenOne{
    public void appearsMore(int[] arr){
        for(int i = 0;i<arr.length;i++){
            int count = 0;
            if((i>0) && arr[i] == arr[i-1]){
                continue;
            }
            for(int j = 0;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count > 1){
                System.out.println(arr[i]);
            }
        }
    }
}
public class AppearsMoreThen1 {
    public static void main(String[] args) {
        MoreThenOne mt = new MoreThenOne();
        int[] arr = {1,1,1,2,3,4,4,5,5,5};
        mt.appearsMore(arr);
    }
}
