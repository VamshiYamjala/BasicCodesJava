class Search {
    public int elementSearch(int[] arr,int target) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = (start + end)/2;
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return arr[mid];
            }
        }
        return -1;
    }
}

public class BinarySearch {
    public static void main(String[] args) {
        Search s = new Search();
        int[] arr = { 1, 3, 5, 7, 9, 11, 13 };
        int target = 7;
        System.out.println( s.elementSearch(arr,target));;
    }
}
