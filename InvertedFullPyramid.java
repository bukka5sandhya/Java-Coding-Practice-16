import java.util.Scanner;
public class InvertedFullPyramid {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt(); //5 input
            for(int i=0;i<=N;i++){
                System.out.println(" ".repeat(i)+"* ".repeat(N-i));
        }
    }
}