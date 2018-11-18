
import java.util.Scanner;


class Alien_wordscanner {
    public static void main(String[] args)
     {
      Scanner scan= new Scanner(System.in);
      System.out.println("Enter the values for the first array, up to 10000 values, enter 'End' to quit");
      int x=-1;
      int counter1=0;
      int counter2=0;
      String []first= new String[10000];
      for (int i=0;i!=x;i++)
      {
        counter1++;
        first[i]= scan.nextLine();
        if (first[i].toUpperCase().equals("END"))
        {
         i=x;
         break;
        }        
      }
      System.out.println("Enter the values for the first array, up to 10000 values, enter 'End' to quit");
            String []second= new String[10000];
      for (int i=0;i!=x;i++)
      {
        second[i]= scan.nextLine();
        counter2++;
        if (second[i].toUpperCase().equals("END"))
        {
         i=x;
         break;
        }        
      }
      String []merged= new String[counter1+counter2];
                 for (int i=0;i<counter1-1;i++)
      {
      merged[i]=first[i];
           }
            for (int i=0;i<counter2-1;i++)
            {
              merged[counter1+i-1]=second[i];
            }
      for (int i=0;i<(counter1-2);i++)
      {

        if (first[i].compareTo(first[i+1])>0)
        {
          String store=first[i];
          first[i]=first[i+1];
          first[i+1]=store;
        }
      }
      
            for (int i=0;i<(counter2-2);i++)
      {

        if (second[i].compareTo(second[i+1])>0)
        {
          String store=second[i];
          second[i]=second[i+1];
          second[i+1]=store;
        }
      }
                        for (int i=0;i<(counter1+counter2-4f);i++)
      {

        if (merged[i].compareTo(merged[i+1])>0)
        {
          String store=merged[i];
          merged[i]=merged[i+1];
          merged[i+1]=store;
        }
      }
                        System.out.println("\nFirst Array");
           for (int i=0;i<counter1-1;i++)
      {
      System.out.println(first[i]);
           }
            System.out.println("\nSecond Array");    
           for (int i=0;i<counter2-1;i++)
      {
      System.out.println(second[i]);
           }
       System.out.println("\nMerged Array");    
                      for (int i=0;i<counter1+counter2-2;i++)
      {
      System.out.println(merged[i]);
           }
           
           
           
      
      scan.close();
    }
}