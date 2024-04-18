import java.util.Scanner;
class Noofspacesstr{
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string ");
        String str=sc.nextLine();
        // space count initially declare as zero
        int spc_count=0;

        // Trim will remove the leading &  tailing spaces 
        str=str.trim();

        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==' ' && str.charAt(i+1)!=' '){
                spc_count++;
            }
        }
        int word_count=spc_count+1;
        System.out.println("Word count in the given string is:"+word_count);

    }
}