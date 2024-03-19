import java.util.Scanner; 
class main{ 
    public static void main(String[] args){ 
        Scanner input = new Scanner(System.in); 
        int N = input.nextInt(); 
        for(int i=0; i<N;i++)
            System.out.print((i+1)+" "); 
            System.out.println(" "); 
        for(int i=N-2; i>0; i--){ 
            System.out.print(1); 
            for(int j=2*i-2; j>-1;j--){
                System.out.print(" ");
            }
            System.out.println(i+1);
            }
        System.out.println("1");
    }
}
            
            