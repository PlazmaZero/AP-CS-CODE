
import java.io.*;


import java.util.Scanner;


class Main{
  
    public static void main (String str[]) throws IOException {
      Scanner scan= new Scanner(System.in);
      System.out.println("Welcome. What is your name?");
      String Name=scan.nextLine();
      System.out.println("Hello "+Name+". Try your best to crack the code!\n\n");
      System.out.println("PHASE 1\nEnter a number:");
      int P1=scan.nextInt();
      if (P1==3)
      {
        System.out.println("Correct!\n\n\nPHASE 2\nEnter a number:");
        int P2=scan.nextInt();
        if (P2==1||(P2>=33&&P2<=100))
        {
          System.out.println("Correct!\n\n\nPHASE 3\nEnter a number:");
          int P3=scan.nextInt();
          if (P3%3==0||P3%7==0)
          {
            System.out.println("Correct!\nYou have cracked the code!");
          }
          
        }
                System.out.println("Sorry, that was incorrect!\nBetter luck next time!"); 
      }
      else 
      {
        System.out.println("Sorry, that was incorrect!\nBetter luck next time!"); 
      }
      scan.close();
}
}