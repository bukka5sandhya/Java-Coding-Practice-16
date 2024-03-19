import java.util.Scanner;
class LCM{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int M = input.nextInt(); //12 input
        int N = input.nextInt(); //8 input
        int max = Math.max(M,N);
        int LCM =max;
        while(true){
            if(LCM % M == 0 && LCM %N == 0){
                System.out.println(LCM); //24 output
                break;
            }
            LCM += max;
        }

    }
}
//another input 16 9 
//another output 144