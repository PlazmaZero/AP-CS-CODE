import java.util.Scanner;
import java.lang.Math; 

class Main{
    public static void main(String[] args)
     {
Scanner scan = new Scanner(System.in);
System.out.println("Enter message board post:");
String input = scan.nextLine();
String username = input.substring(0, input.indexOf('-'));
int isCorrect = 1;
int error1 = 0;
int error2 = 0;
int error3 = 0;
input = input.substring(input.indexOf('-') + 2, input.length()) + " ";
while(input.length() > 0) {
String word = input.substring(0, input.indexOf(' '));
if(word.equals("^^"))
{
  error1++;
  isCorrect = 0;
}
else if(word.toLowerCase().equals("qey"))
{
  error2++;
  isCorrect = 0;
}
else if(word.equals("$"))
{
  error3++;
  isCorrect = 0;
}
input = input.substring(input.indexOf(' ') + 1, input.length());
}
System.out.println("Results:");
if(isCorrect == 1)
{
  System.out.println("CLEAN");
}
else
{
  System.out.println("BAD");
  System.out.println(username);
        System.out.println("^^: " + error1);
          System.out.println("qey: " + error2);
                                                System.out.println("$: " + error3);

}
    }
}