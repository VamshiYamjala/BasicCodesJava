class SumOfall{
    public void sumOfElementsExcept1stAndLast(int[] arr){
        int Largest = arr[0];
        int smallest = arr[0];
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum += arr[i];
            if(Largest < arr[i]){
                Largest = arr[i];
            }
            if(smallest > arr[i]){
                smallest = arr[i];
            }
        }
        // for(int i = 0;i<arr.length;i++){
        //     if((arr[i] != Largest) && (arr[i] != smallest)){
        //         sum += arr[i];
        //     }
        // }
        System.out.println("the sum of elements except first and last is "+(sum-(Largest+smallest)));
    }
}
public class SumOfAllElementsExcept1stAndLast {
    public static void main(String[] args) {
        SumOfall sa = new SumOfall();
        int[] arr = {1,2,3,4,5,6};
        sa.sumOfElementsExcept1stAndLast(arr);
    }
}
