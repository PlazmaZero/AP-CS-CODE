import java.util.*;

public class Main {
  public static boolean check (ArrayList <PrizeCard> a,PrizeCard b)
  {
    boolean bool=true;
    for (int i=0;i<a.size();i++)
    {
      if (a.get(i)==b)
      {
       return false; 
      }
    }
    
    return bool;
  }

  public static void main (String[] args) {

    // Write your code here
GameWheel one =new GameWheel();
 ArrayList<PrizeCard> player1 = new ArrayList<PrizeCard>();
 ArrayList<PrizeCard> onemod = new ArrayList<PrizeCard>(one.getPrizeCards());
  ArrayList<PrizeCard> player2 = new ArrayList<PrizeCard>();
  
  player1.add(one.spinWheel());
for (int i=0;i<4;i++)//5 unique card loop
 { 
 PrizeCard temp1= new PrizeCard();
temp1=one.spinWheel();

while(!check(player1,temp1))//attempts to find unique cards
{
    temp1=one.spinWheel();
}
player1.add(temp1);

}

 player2.add(one.spinWheel());
for (int i=0;i<4;i++)//5 unique card loop
 { 
 PrizeCard temp2= new PrizeCard();
temp2=one.spinWheel();

while(!check(player2,temp2))//attempts to find unique cards
{
    temp2=one.spinWheel();
}
player2.add(temp2);
}



 int totalOne=0;
 int totalTwo=0;
    for (PrizeCard a: player1)
{
  totalOne+=a.getPrizeAmount();
}
        for (PrizeCard a: player2)
{
  totalTwo+=a.getPrizeAmount();
}
System.out.println("Player 1 Total: $"+totalOne);
    for (PrizeCard a: player1)
{
  System.out.println(a.toString());
}
System.out.println("\nPlayer 2 Total: $"+totalTwo); 
    for (PrizeCard a: player2)
{
  System.out.println(a.toString());
}
    if (totalOne==totalTwo)
    {
     System.out.println("\nIt’s a tie!");
    }
    else if (totalOne-totalTwo>0)
    {
      System.out.println("\nPlayer 1 won by $"+(totalOne-totalTwo)+"!");
    }
    else
    {
      System.out.println("\nPlayer 2 won by $"+(totalTwo-totalOne)+"!");
    }
  }
}
