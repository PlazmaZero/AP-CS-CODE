 import java.util.Scanner;
 import java.util.ArrayList;
class Main{

public static void main(String args []){
    Scanner scan = new Scanner (System.in);
    String name="";
    String id="";
    ArrayList <TeamMember> team = new ArrayList <TeamMember>();
    while (!((name.toUpperCase()).equals("STOP")))
    {
      
      System.out.println("Enter the next name:");
      name=scan.nextLine();
      if ((name.toUpperCase()).equals("STOP"))
          break;
      System.out.println("Enter the next ID:");
      id=scan.nextLine();
      if ((id.toUpperCase()).equals("STOP"))
          break;
      TeamMember temp = new TeamMember(name,id);
      team.add(temp);
      
        for (int i=1;i<team.size();i++)
  {
      TeamMember temp2= team.get(i);
      int s =i-1;
      while ((s>=0)&& (team.get(s).compareTo(temp2)==1))
      {
        team.set(s+1,team.get(s));
        s--;
      }
      team.set(s+1,temp2);
  }

  }
    
    scan.close();
    System.out.println(team.toString());
}
}