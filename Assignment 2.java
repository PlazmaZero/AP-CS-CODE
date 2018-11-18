
import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;

import java.lang.Math;

class Main{

     public static void main (String str[]) throws IOException {
       Scanner scan= new Scanner(System.in);
       
       System.out.println("Seconds Since Unix Epoch:");
         int int1= scan.nextInt();
       int year= (1970+(int1/31104000));
       int month=(((int1%31104000))/2592000);
       int day=(((int1%31104000))%2592000/86400);
       int hour=((((int1%31104000)%2592000)%86400)/3600);
       int min=(((((int1%31104000)%2592000)%86400)%3600)/60);
       int sec=(((((int1%31104000)%2592000)%86400)%3600)%60);
         System.out.println("\n\nYear: "+year+"\nMonth: "+month+"\nDay: "+day+"\nHour: "+hour+"\nMin: "+min+"\nSec: "+sec);
     }
}