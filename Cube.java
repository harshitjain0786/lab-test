//THE PROG. OF CUBE OF NUMBERS

import java.util.Scanner;
 class Cube
 {                                 

   public static void main(String[] args)

{
    int i,No,Cube;
    System.out.println("Enter a No :- ");
    Scanner scan = new Scanner(System.in);     
		    No = scan.nextInt();

     for(i=1;i<=No;i++)                      
     {
         
         Cube = i*i*i;                		
         System.out.println("Num is " +i+ " Cube of Num :-" +i+" is : "  +Cube );
         // System.out.println("\n");

    }

 }
}
