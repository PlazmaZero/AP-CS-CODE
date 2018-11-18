
import java.util.Scanner;
import java.lang.Math;

class MathodsSamplerPlatter {
  public static void duplicate(String str)
  {
  System.out.print("The duplicated String is: ");
    if (str.length()%2==0)
    {
      for(int i=0;i<str.length();i++)
      {
        for (int x=0;x<(str.length()*2);x++)
        {
         System.out.print(str.charAt(i)); 
        }
      }
    }
    else
    {
            for(int i=0;i<str.length();i++)
      {
        for (int x=0;x<(str.length());x++)
        {
          System.out.print(str.charAt(i));
        }
      }
    }
  }
  public static void isEdhesivePalindrome(String str)
  {
    String hold="";
    String hold2="";
    String hold3="";
    hold=str.replace("4","a");
    hold2=hold.replace("3","e");
    hold3=hold2.replace("0","o");
    str=hold3;
    String pali="";
    for (int i=str.length()-1;i>=0;i--)
    {
      pali=pali+str.charAt((i));
    }        
    if ((str.length()>3 && str.length()<15)&&((str.toUpperCase()).equals(pali.toUpperCase())))
    {
      System.out.println("Nice, you found an Edhesive Palindrome!");
    }
    else
    {
      System.out.println("Too bad, that isn’t an Edhesive Palindrome.");
    }
  }
  public static void numberScramble(double num)
  {
    if (num<0)
    {
     System.out.println("The scrambled number is: 0.0");
    }
else
{
  num+=5;
  num/=2;
  num=Math.sqrt(num);
  System.out.println("The scrambled number is: "+num);
  
}
    
  }
  
    public static void main(String[] args)
     {
      Scanner scan = new Scanner(System.in);
      System.out.println("Welcome to the Methods Sampler Platter. Please enter a String to duplicate.");
      String dupstr=scan.nextLine();
      duplicate(dupstr);
      System.out.println("\nNext, please enter a String to check for Edhesive Palindromes.");
      String palistr=scan.nextLine();
      isEdhesivePalindrome(palistr);
      System.out.println("Almost done! Please enter a number to scramble.");
      double num=scan.nextDouble();
      numberScramble(num);
      
      scan.close();
    }
}