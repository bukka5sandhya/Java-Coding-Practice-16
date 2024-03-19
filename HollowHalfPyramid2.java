import java.util.Scanner;
public class HollowHalfPyramid2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        for(int i=1;i<=N;i++){
            for(int j=1;j<=i;j++){
                if(i==N || j == 1 || j==i){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
    
}
