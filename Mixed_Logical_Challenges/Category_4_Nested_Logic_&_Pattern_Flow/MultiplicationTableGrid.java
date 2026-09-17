class Table{
    public void MultiplicationTable(){
        for(int i = 1;i<=5;i++){
            for(int j =1;j<=5;j++){
                System.out.print(i*j+" ");
            }
            System.out.println();
        }
    }
}
public class MultiplicationTableGrid {
    public static void main(String[] args) {
        Table t = new Table();
        t.MultiplicationTable();
    }
}
