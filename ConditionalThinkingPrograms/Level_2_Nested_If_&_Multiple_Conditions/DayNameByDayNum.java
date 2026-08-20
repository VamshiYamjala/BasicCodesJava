import java.util.*;
class Day{
    public void CheckDay(int DayNum){
        // if(DayNum == 1){
        //     System.out.println(" Monday! ");
        // }
        // else if(DayNum == 2){
        //     System.out.println(" Tuesday! ");
        // }
        // else if(DayNum == 3){
        //     System.out.println(" Wednesday! ");
        // }
        // else if(DayNum == 4){
        //     System.out.println(" Thursday! ");
        // }
        // else if(DayNum == 5){
        //     System.out.println(" Friday! ");
        // }
        // else if(DayNum == 6){
        //     System.out.println(" Saturday! ");
        // }
        // else if(DayNum == 7){
        //     System.out.println(" Sunday! ");
        // }
        // else{
        //    System.out.println(" Invalid Number ");
        //    }
        
        switch(DayNum){
        case 1 : System.out.println(" Monday! ");
        break;
        case 2 :System.out.println(" Tuesday! ");
        break;
        case 3 :System.out.println(" Wednesday! ");
        break;
        case 4 :System.out.println(" Thursday! ");
        break;
        case 5 :System.out.println(" Friday! ");
        break;
        case 6 :System.out.println(" Saturday! ");
        break;
        case 7 :System.out.println(" Sunday! ");
        break;
        default : System.out.println(" Invalid Number ");
        }
         

    }
}
public class DayNameByDayNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Day d = new Day();
        System.out.println("Enter the Number 1 - 7 to get corresponding Day name : ");
        int DayNum = sc.nextInt();
        d.CheckDay(DayNum);
        sc.close();
    }
}
