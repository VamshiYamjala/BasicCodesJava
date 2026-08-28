class DescSorted{
    public void checkSortedDesc(int[] arr){
        int left = 0;
        int right = 1;
        boolean desc = true;
        while(right < arr.length){
            if(arr[left] < arr[right]){
                desc = false;
                break;
            }
            left++;
            right++;
        }
        if (desc == true) {
            System.out.println("yes it is in descending order ");
        }
        else{
            System.out.println("Not in descending order ");
        }
    }
}
public class CheckArrayIsInSortedDesc {
    public static void main(String[] args) {
        DescSorted ds = new DescSorted();
        int[] arr = {6,5,4,3,2,1};
        ds.checkSortedDesc(arr);
    }
}
