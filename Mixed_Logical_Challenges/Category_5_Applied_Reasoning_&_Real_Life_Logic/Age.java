class AgeCategory{
    public void PrintAgeCategory(int[] ages){
        for(int i = 0;i<ages.length;i++){
            if(ages[i] < 0){
                System.out.println("invaild age age can't be negative");
            }
            else if(ages[i] <=16){
                System.out.println("You are minor");
            }
            else if(ages[i] >16 && ages[i] <=59){
                System.out.println("You are adults");
            }
            else if(ages[i] >59){
                System.out.println("You are seniors");
            }
        }
    }
}
public class Age {
    public static void main(String[] args) {
        AgeCategory ac = new AgeCategory();
        int[] ages = {5, 15, 25, 45, 70};
        ac.PrintAgeCategory(ages);
    }
}
