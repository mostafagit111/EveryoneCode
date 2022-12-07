

package course.countinggame;
// I Imported this class ,because I need values from user
import java.util.Scanner;
// I Imported this class to process Exceptions
import java.util.InputMismatchException;


public class CountingGame {
    
    public static void main(String[] args) {
        
        
        
       Scanner scr=new Scanner(System.in); 
       
       // EntredNumber ,A value entered by user , the maximum value in the game
       int EntredNumber=0;
       System.out.println( "Pleas enter the maximum value that you would like to test");
       
        // Exception handling in this section
       try{ 
           EntredNumber= scr.nextInt();
          }
       catch(Exception e)
        {
          if(e instanceof InputMismatchException)
               { 
           System.out.println( "Pleas enter a number not a string");
           System.out.println( "Make sure that thé nummber you entered is integer");
               }
          
         }
      
       /* 
       I use this loop to traverse all numbers from 1 to 
       the maximum value (EntredNumber)
       
       */
     for(int i=1;i<=EntredNumber;i++)
              { 
         /* 
                  the first condition is bthat the remainder
                  of the division by 3 is not zero and the
                  remainder of the division by 15 is not equal 
                  to zero
       */
   if (i % 3 == 0 && i % 5 != 0 && i % 15 != 0)
   {
  System.out.println(i +" ka");
   }  
   else if (i % 5 == 0 && i % 15 != 0) 
   {
  System.out.println( i +"ching");
   }
   
  else if (i % 15 == 0) 
   {
  System.out.println( i +" ka-ching");
   }
  else
  {
   System.out.println(i);
 }
        } 
     
      System.out.println( "Thanks for sharing this game");
      
      
      
      
      }
                            }
