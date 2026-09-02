class Count1{
    public void CountBeforeAfterM(String value){
        char[] ch = value.toCharArray();
        int BeforeM = 0;
        int AfterM = 0;
        for(int i = 0;i<ch.length;i++){
            if(ch[i] < 'm'){
                BeforeM++;
            }
            else if(ch[i] > 'm'){
                AfterM++;
            }
        }
        System.out.println("the count of character before m : "+BeforeM);
        System.out.println("the count of character after m : "+AfterM);
    }
}
public class CountBeforeMAndAfterM {
    public static void main(String[] args) {
        Count1 c = new Count1();
        String value = "abcdefghijklmno";
        c.CountBeforeAfterM(value);
    }
}
