import java.util.ArrayList;
public class UltimateTeam
{
  ArrayList<UltimatePlayer> players=new ArrayList<UltimatePlayer>();
  ArrayList<Coach> coaches = new ArrayList<Coach>();
  
  public UltimateTeam(ArrayList<UltimatePlayer> player, ArrayList<Coach> coach)
  {
    players=player;
    coaches=coach;
  }
  public String getCutters()
  {
    String s="";

    for(UltimatePlayer a: players)
    {
     if (a.getPosition()=="cutter")
           s+=("\n"+a.toString());
    }
    return(s);
  }
    public String getHandlers()
  {
    String s="";
    for(UltimatePlayer a: players)
    {
     if (a.getPosition()=="handler")
           s+=("\n"+a.toString());
    }
    return(s);
  }
    public String toString()
    {
      String s="";
      String v="";
      for(Coach a: coaches)
      s+=("\n"+a.toString());
      for(UltimatePlayer a: players)
      v+=("\n"+a.toString());
        
      
      return("COACHES"+s+"\n\nPLAYERS"+v); 
    }
}