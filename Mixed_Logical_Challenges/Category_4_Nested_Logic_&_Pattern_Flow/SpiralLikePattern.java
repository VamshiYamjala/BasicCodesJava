class Spiral{
    public void PrintSpiral(int n){
        int[][] arr = new int[n][n];

        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right = n-1;
        int value = 1;
        while(top <= bottom && left<=right){

            for(int i = left;i<=right;i++){
                arr[top][i] = value;
                value++;
            }
            top++;
            for(int i = top;i<=bottom;i++){
                arr[i][right]=value;
                value++;
            }
            right--;
            for(int i = right;i>=left;i--){
                arr[bottom][i]=value;
                value++;
            }
            bottom--;
            for(int i = bottom;i>=top;i--){
                arr[i][left]=value;
                value++;
            }
            left++;
        }
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
public class SpiralLikePattern {
    public static void main(String[] args) {
        Spiral s = new Spiral();
        int n = 4;
        s.PrintSpiral(n);
    }
}
