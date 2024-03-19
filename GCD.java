import java.util.Scanner;
class GCD{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int M = input.nextInt(); //input 4
        int N = input.nextInt(); //input 6
        int GCD =0;
        for(int i=1;i<=M;i++){
            if(M %i == 0 && N %i == 0){
                GCD = i;
            }
        }
        System.out.println(GCD); //output 2

    }
}
//another inputs 16 9 output 1