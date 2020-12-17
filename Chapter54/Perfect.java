import java.util.Scanner;

public class Perfect{
    public static boolean Perrfect(int n){
        
        int sum = 0;
        
        for (int i = 1; i <= n/2; i++){
            sum += i;
        }

        return sum == n;
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter upper limit: ");
        int limit = scan.nextInt();

        for (int j = 0; j < limit; j++){
            if (Perrfect(j)){
                System.out.println(j);
            }
        }

    }
}