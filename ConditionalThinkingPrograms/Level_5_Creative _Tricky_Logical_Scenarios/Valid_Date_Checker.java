import java.util.*;
class CheckDateInMonth{
    public void DatesAndMonths(int date, int month) {
        if ((month >= 1 && month <= 12) && (date >= 1 && date <= 31)) {
            if (month <= 7) {
                if (month == 2) {
                    if (date <= 28) {
                        System.out.println("valid");
                    } else {
                        System.out.println("invalid");
                    }
                }
                else if (month % 2 != 0) { 
                    if (date <= 31) {
                        System.out.println("valid");
                    } else {
                        System.out.println("invalid");
                    }
                } 
                else {
                    if (date <= 30) {
                        System.out.println("valid");
                    } else {
                        System.out.println("invalid");
                    }
                }
            } 
            else {
                if (month > 7 && month <= 12) {
                    if (month % 2 == 0) {
                        if (date <= 31) {
                            System.out.println("valid");
                        } else {
                            System.out.println("invalid");
                        }
                    } 
                    else {
                        if (date <= 30) {
                            System.out.println("valid");
                        } else {
                            System.out.println("invalid"); // Fixed: Changed from "valid" to "invalid"
                        }
                    }
                }
            }
        } else {
            System.out.println("invalid"); 
        }
    }
}

public class Valid_Date_Checker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CheckDateInMonth cdm = new CheckDateInMonth();
        
        int date = sc.nextInt();
        int month = sc.nextInt();
        cdm.DatesAndMonths(date, month);
        
        sc.close();
    }
}
