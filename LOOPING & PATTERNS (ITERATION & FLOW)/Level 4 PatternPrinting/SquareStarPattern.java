class Patterns{
    // squarePattern
    public void SquarePattern(){
        for(int i = 1 ; i <= 5 ; i++){
            for(int j = 1 ; j <=5 ; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    //increasing Triangle
    public void IncreasingTriangle(){
        for(int i = 1 ; i <=5 ; i++){
            for(int j = 1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public void RightAlignTriangle(){
        for(int i = 1 ; i<=5 ; i++){
            for(int s = 1 ; s<=5-i;s++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <=i ; j++){
                System.out.print("*"+"");
            }
            System.out.println();
        }
    }

    public void Pyramid(){
        for(int i = 1; i <=5 ; i++){
            for(int s = 1 ; s<=5-i ; s++){
                System.out.print(" ");
            }
            for(int j = 1;j<=i ; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public void IncreasingSequence(){
        for(int i = 1;i<=5;i++){
            for(int j = 1 ; j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public void IncreasingNumberPyramid(){
        for(int i = 1 ; i<=5;i++){
            for(int j = 1 ; j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}

public class SquareStarPattern{
    public static void main(String[] args) {
        Patterns p = new Patterns();
        p.SquarePattern();
    }
}