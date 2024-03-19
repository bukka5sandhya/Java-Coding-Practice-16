import java.util.Scanner;
public class FullPyramid2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt(); //5 input
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
       
        
    }
    
}
