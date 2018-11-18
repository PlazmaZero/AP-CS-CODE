
import java.util.Scanner;


class Alien_wordscanner {
    public static void main(String[] args)
     {
      Scanner scan= new Scanner(System.in);
      String text=(scan.nextLine()+' ');
      int length=text.length();
      int username= (text.indexOf(' '));
      //int messagelength= length-username;
      int arrows=0;
      int qey=0;
      int $=0;
      String ms= (text.substring(username,length));
      ms=ms.toLowerCase();
      int x=0;
                  while (x<ms.length())
                    {
                    if (ms.charAt(x)=='^' && ms.charAt(x-1)=='^' && ms.charAt(x-2)==' ' && ms.charAt(x+1)== ' ')                   
                    {
                     arrows++; 
                    }
                    else if (ms.charAt(x)=='$' && ms.charAt(x-1)==' ' && ms.charAt(x+1)== ' ') 
                    {
                     $++;
                     
                    }
                    else if ((ms.charAt(x)=='y' && ms.charAt(x-1)=='e' && ms.charAt(x-2)== 'q' && ms.charAt(x-3)==' ' && ms.charAt(x+1)== ' ')) 
                    {
                      qey++;
                    }
                    x++;
                  }
      if (qey>0|| $>0||arrows>0) 
      {
      System.out.println("Results:\nBAD\n"+ text.substring(0,username) + "\n^^: " + arrows +"\nqey: " + qey + "\n$: " + $);
      }
      else 
      {
        System.out.println("Results:\nCLEAN");
      }
      
      scan.close();
    }
}