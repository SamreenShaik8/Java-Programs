// write a program to print the given number is perfwect queb or not

import java.util.Scanner;
public class Perfectqueb {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be checked:");
        int num=sc.nextInt();
        
        // initially boolean value is declared as false
        boolean flag=false;
        // initially perfect value is declare as 0
        int pfc_num=0;

        for(int i=0;i<num/2;i++){
            if((i*i*i)==num){
                flag=true;
                pfc_num=i;
                break;
            }
        }

        // printing the given number is perfect cube or not
        if(flag==true){
            // if this condition is true then it will be printed as perfect cube
            System.out.println("The given number is perfect cube:"+pfc_num);
        }
        else{
            // else it will be printed as not perfect cube
            System.out.println("The given number is not a perfect cube");
        }
    

    }

}
