class Second{
    public void PrintSecondLargest(int[] num){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i = 0;i<num.length;i++){
            if(largest < num[i]){
                secondLargest = largest;
                largest = num[i];
            }
            else if(secondLargest < num[i] && num[i] != largest) {  

                secondLargest = num[i];                            
            }
        }
        System.out.println(secondLargest);
    }
}
public class SecondLargest {
    public static void main(String[] args) {
        Second s = new Second();
        int[] num =  {10, 25, 8, 40, 15};
        s.PrintSecondLargest(num);
    }
}
