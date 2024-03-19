import java.util.Scanner;
public class HollowFullPyramid2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt(); // 5 input
        for (int i=1;i<N+1;i++){ 
            String ls =""; 
            ls += " ".repeat(N-i); 
         if (i >2 && i<N){ 
             String hs =""; 
             hs += " ".repeat(2*(i-2)); 
             String a = "1 "+hs+(String.valueOf(i)+" "); 
             System.out.println(ls+a);
          } else{ 
             String a =""; 
             for(int j=1; j<i+1;j++)
                 a= a+(String.valueOf(j)+" "); 
                 System.out.println(ls+a); 
          }
        }
    }
    
}

