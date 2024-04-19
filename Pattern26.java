import java.util.Scanner;
public class Pattern26 {
    public static void main(String[] args) {
        System.out.println("Enter the number to check:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
