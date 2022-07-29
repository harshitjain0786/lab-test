//THE PROG. OF CUBE OF NUMBERS

import java.util.Scanner;
 class Cube
 {                                 

   public static void main(String[] args)

{
    int i,Num,Cube;
    System.out.println("Enter a Num :- ");
    Scanner scan = new Scanner(System.in);     
		    Num = scan.nextInt();

     for(i=1;i<=Num;i++)                      
     {
         
         Cube = i*i*i;                		
         System.out.println("Num is " +i+ " Cube of Num :-" +i+" is : "  +Cube );
         // System.out.println("\n");

    }

 }
}
