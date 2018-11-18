import java.util.Scanner;
import java.lang.Math;

class Main{
  
  public static void main(String[] args) {
     
    Scanner scan=new Scanner(System.in);
    
     System.out.println("Please enter ratings from the movie review website.");
      int int1= scan.nextInt();
      int int2=scan.nextInt();
      int int3=scan.nextInt();
       double web=(double)((int1+int2+int3)/3.0);
       double int4=((double)((web)*.20));

       
     System.out.println("Please enter ratings from the focus group.");
      double doub1=scan.nextDouble();
      double doub2=scan.nextDouble();
       double group=((doub1+doub2)/2);
       double double1=((group)*.30);

      System.out.println("Please enter the average movie critic rating.");
       double critic=scan.nextDouble();
        double crit=(critic*.50);
      System.out.println("Average website rating: "+ web);
      System.out.println("Average focus group rating: "+group);
      System.out.println("Average movie critic rating: "+critic);
      System.out.println("Overall movie rating: "+(crit+int4+double1));
                                         }              
  
           }