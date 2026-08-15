import java.util.*;
class PrintNum{
    // PrintNumber from 1 to 10 or start to end
    public void OneToTen(int start,int end){
        for(int i = start ; i <= end ; i++){
            System.out.print(i+" ");
        }
    }
    // Print even numbers from range
    public void EvenNum(int start , int end){
        for(int i = start ; i <= end ; i++){
            if(i % 2 == 0){
                System.out.print(i+" ");
            }
        }
    }
    // Print Odd numbers from range
    public void OddNum(int start , int end){
        for(int i = start ; i <= end ; i++){
            if(i % 2 != 0){
                System.out.print(i+" ");
            }
        }
    }

    //Print reverse number 
    public void ReverseNum(int end , int start){
        for(int i = end ; i >= start ; i--){
                System.out.print(i+" ");
        }
    }

    //Print table
    public void PrintTable(int num){
        for(int i = 1; i <= 10 ; i++){
            System.out.println(num +" * "+i+" = "+(num * i));
        }
    }

    //Sum of First N natural numbers
    public void SumOfNNaturalNum(int num){
        int sum = 0;
        for(int i = 1; i <= num ; i++){
            sum = sum + i;
        }
        System.out.println("the sum of first "+num+" natural numbers is "+sum);
    }

    // Sum of n even numbers
      public void SumOfNEvenNum(int num){
        int sum = 0;
        for(int i = 2; i <= num ; i+=2){
            sum = sum + i;
        }
        System.out.println("the sum of first "+num+" Even numbers is "+sum);
    }

    //Sum of first n odd numbers
        public void SumOfNOddNum(int num){
        int sum = 0;
        for(int i = 1; i <= num ; i+=2){
            sum = sum + i;
        }
        System.out.println("the sum of first "+num+" Odd numbers is "+sum);
    }

    //Factorial of a number
    public void FactorialOfNum(int num){
        long fact = 1;
        for(int i = num ; i >=1 ; i--){
            fact *= i;
        }
        System.out.println("the factorial of number "+num+"  is "+fact);
    }
    //Product of the Digit
    public void ProductOfNumDigit(int num){
        int originalNum = num;
        int remainder,Product = 1;
        while(num > 0){
            remainder = num % 10;
            if(remainder == 0){
                num /= 10;
                continue;
            }
            Product *= remainder;
            num /= 10;
        }
        System.out.println("the product of the Digit of the number "+originalNum+" is "+Product);
    }

}

public class PrintNumFrom1to10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintNum pn = new PrintNum();
        System.out.println("enter the start and end number ");
        int start = sc.nextInt();
        int end = sc.nextInt();
        pn.OneToTen(start, end);
        sc.close();
    }
}