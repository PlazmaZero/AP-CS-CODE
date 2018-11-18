
import java.util.Scanner;


class Main {
    public static void main(String[] args)
     {
      Scanner scan= new Scanner(System.in);
      System.out.println("Enter the values for the first array, up to 10000 values, enter 'End' to quit");
      int x=-1;
      int counter1=0;
      int counter2=0;
      int test=1;
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
      for (int i=0;i<(counter1-1);i++)
      {

          first[i]= (first[i].substring(0,1)).toUpperCase()+ (first[i].substring(1)).toLowerCase();
                          if (i<counter1-2)
                {
        if ((first[i].toUpperCase()).compareTo((first[i+1]).toUpperCase())>0)
        {
test=0;
        }
                if (first[i].compareTo(first[i+1])>0)
        {
          String store=first[i];
          first[i]=first[i+1];
          first[i+1]=store;
        }
        }
      }
      
      
      
            for (int i=0;i<(counter2-1);i++)
      {
          second[i]= (second[i].substring(0,1)).toUpperCase()+ (second[i].substring(1)).toLowerCase();
                                if (i<counter2-2)
                      { 
        if ((second[i].toUpperCase()).compareTo((second[i+1]).toUpperCase())>0)
        {
test=0;
        }
                if (second[i].compareTo(second[i+1])>0)
        {
          String store=second[i];
          second[i]=second[i+1];
          second[i+1]=store;
        }
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
                        for (int i=0;i<(counter1+counter2-4);i++)
      {

        if (merged[i].toUpperCase().compareTo((merged[i+1]).toUpperCase())>0)
        {
          String store=merged[i];
          merged[i]=merged[i+1];
          merged[i+1]=store;          
        }
          merged[i]= (merged[i].substring(0,1)).toUpperCase()+ (merged[i].substring(1)).toLowerCase();
      }
                        System.out.println("\nFirst Array");
           for (int i=0;i<counter1-1;i++)
      {
      System.out.print(first[i]+" ");
           }
            System.out.println("\nSecond Array");    
           for (int i=0;i<counter2-1;i++)
      {
      System.out.print(second[i]+" ");
           }
           if (test==0)
           {
             System.out.println("\n Error: Arrays not in correct order");
                                   for (int i=0;i<counter1-1;i++)
                                   
      {
      System.out.print(first[i]+ " ");
           }
             for (int i=0;i<counter2-1;i++)
                                   
      {
      System.out.print(second[i]+ " ");
           }
           }
           else{
       System.out.println("\nMerged Array");    
                      for (int i=0;i<counter1+counter2-2;i++)
      {
      System.out.print(merged[i]+ " ");
           }
           }
           
           
      
      scan.close();
    }
}