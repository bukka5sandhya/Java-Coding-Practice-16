import java.util.Scanner;
public class InvertedFullPyramid2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt(); //5 input
        int s=0;
        for(int i=0;i<N;i++){
            String sp =" ".repeat(s);
            String p = "";
        for(int j=1;j<=N-i;j++){
            p += (String.valueOf(j)+" ");
        }
        System.out.println(sp+p);
        s+=1;

        }
    }
    
}
