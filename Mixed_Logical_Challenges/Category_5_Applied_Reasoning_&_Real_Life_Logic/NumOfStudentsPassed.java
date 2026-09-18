class Students{
    public void PrintPassedStudents(int[] marks){
        int pass = 40;
        int count = 0;
        for(int i=0;i<marks.length;i++){
            if(marks[i]>=pass){
                count++;
            }
        }
        System.out.println("Passed: "+count);
    }
}
public class NumOfStudentsPassed{
    public static void main(String[] args) {
        Students s = new Students();
        int[] marks = {35, 40, 75, 20, 90, 39, 50};
        s.PrintPassedStudents(marks);
    }
}