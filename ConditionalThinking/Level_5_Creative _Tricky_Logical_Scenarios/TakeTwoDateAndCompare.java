import java.util.*;
class CheckWhichComesFirst{
    public void CheckwhicDateAndMonthComesFirst(int Date1,int Date2,int Month1,int Month2){
        if(((Date1 >=1 && Date1<=31) ||(Date2 >=1 && Date2<=31 )) && ((Month1 >=1 && Month1<=12)&&(Month2 >=1 && Month2<=12)) ){
            if((Month1 > Month2)){
                System.out.println(Date1 +"&"+Month1 +"is greater then "+Date2+"&"+Month2);
            }
            else if(Month1 == Month2){
                if(Date1 > Date2){
                    System.out.println(Date1 +"&"+Month1 +"is greater then "+Date2+"&"+Month2);
                }
                else{
                    System.out.println(Date2 +"&"+Month2 +"is greater then "+Date1+"&"+Month1);
                }
            }
            else{
                System.out.println(Date2 +"&"+Month2 +"is greater then "+Date1+"&"+Month1);
            }
        }
        else{
            System.out.println("the date or month is out of the range");
        }

    }
}
public class TakeTwoDateAndCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CheckWhichComesFirst cwf = new CheckWhichComesFirst();
        System.out.println("enter the first Date and month");
        int Date1 = sc.nextInt();
        int Month1 = sc.nextInt();
        System.out.println("enter the Second Date and month");
        int Date2 = sc.nextInt();
        int Month2= sc.nextInt();
        cwf.CheckwhicDateAndMonthComesFirst(Date1, Date2, Month1, Month2);
        sc.close();
    }
}
