class CheckElementUnique{
    public void checkUniqueOrNotInArray(int[] arr){
        boolean hasDuplicate = false;
        for(int i = 0; i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    hasDuplicate = true;
                    break;
                }
            }
            if(hasDuplicate){
                break;
            }
        }
        if(hasDuplicate){
            System.out.println("the elements are Duplicate ");
        }
        else{
            System.out.println("there are no Duplicate elements in the array");
        }
    }
}
public class CheckAllElementsOfAnArrayAreUnique {
    public static void main(String[] args) {
        CheckElementUnique ceu = new CheckElementUnique();
        int[] arr = {10,20,80,40};
        ceu.checkUniqueOrNotInArray(arr);
    }
}
