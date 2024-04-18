// Write a program to reverse the string without altering the position of a word

import java.util.Scanner;
public class Revese_str {
    public static void main(String[] args) {
        // Take the user input
        // Step1
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=sc.nextLine();
        // initially space count is declared as zero
        int spc_count=0;

        // trim() will remove the leading and tailing spaces in the string
        // step2
        str=str.trim();
        
        // step3
        // Removing the extra space in between the string and finding the space count
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==' ' && str.charAt(i+1)!=' '){
                spc_count++;
            }
            
        }

        // step4
        // finding the word count by incrementing the spc_count by 1
        int word_count=spc_count+1;
        System.out.println("The count of words is"+word_count);

        String arr[]=new String[word_count];

        // initially temp is declared as zero
        int temp=0;

        //
        String str2=" ";


    }
}
