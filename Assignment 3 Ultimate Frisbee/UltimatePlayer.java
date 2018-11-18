public class UltimatePlayer extends Person
{
  private int jerseyNumber;
  private String position;
  private static int num;
  
 
  public UltimatePlayer(String first, String last,String pos)
  {
    super(first,last);
    num++;
    jerseyNumber=num;
    if (pos=="cutter")
    {
     position=pos; 
    }
    else
      position="handler";
  }
  public String getPosition()
  {
   return (position); 
  }
  public String toString()
  {
    return (super.toString()+"\n   Jersey #: "+ jerseyNumber+"\n   Position: "+position);
  } 
}