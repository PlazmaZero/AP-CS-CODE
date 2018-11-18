public class Coach extends Person
{
  String role;
  
  public Coach(String first,String last,String job)
  {
    super(first,last);
    role=job;
  }
  public String toString()
  {
    return(super.toString()+"\n   Role: "+role);
  }
}