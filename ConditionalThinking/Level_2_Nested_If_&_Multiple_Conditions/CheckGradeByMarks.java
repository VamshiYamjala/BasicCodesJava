import java.util.*;
class CheckMarks{
    public void CheckGradesbyMarks(float marks){
        if(marks > 35 && marks <= 50){
            System.out.println("Your Grade is D");
        }
        else if(marks > 50 && marks <= 65){
            System.out.println("Your Grade is C");
        }
        else if(marks > 65 && marks <= 75){
            System.out.println("Your Grade is B");
        }
        else if(marks > 75 && marks <= 85){
            System.out.println("Your Grade is A");
        }
        else if(marks > 85 && marks <= 95){
            System.out.println("Your Grade is A+");
        }
        else if(marks > 95 && marks <= 100){
            System.out.println("Your Grade is O");
        }
        else{
            System.out.println("Sorry try again next time");
        }
    }
}
public class CheckGradeByMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CheckMarks cm = new CheckMarks();
        System.out.println("enter you marks to check grades: ");
        float marks = sc.nextFloat();
        cm.CheckGradesbyMarks(marks);
        sc.close();
    }
}
