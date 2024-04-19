// write a program to find the given number is perfect square or not
import java.util.Scanner;
public class Perfectsquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enthe the number to be checked:");

        int num=sc.nextInt();

        // initially boolean value is given as flag
        boolean flag=false;

        // initially perfect number is declared as zero
        int pfc_num=0;

        // loop
        for(int i=0;i<num/2;i++){
            if((i*i)==num){
                flag=true;
                pfc_num=i;
                break;
            }
        }

        // printing the perfect square
        if(flag==true){
            System.out.println("The given number is perfect square:"+pfc_num);
        }
        else{
            System.out.println("The given number is not a perfect square:");
        }
    }
}
