import java.util.*;
class CheckAge{
    public void CheckAgeForVote(int age){
        if(age >=0 && age < 18){
            System.out.println("As per the age you can't vote : ");
        }
        else if(age >= 18 && age <= 180){
            System.out.println("You can Vote! ");
        }
        else{
            System.out.println("invalid age , check the age entered! ");
        }
    }
}
public class Votingeligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CheckAge ca = new CheckAge();
        System.out.println("enter your age to check wheather you can vote or not : ");
        int age = sc.nextInt();
        ca.CheckAgeForVote(age);
        sc.close();
    }
}
