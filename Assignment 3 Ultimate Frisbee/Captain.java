public class Captain extends UltimatePlayer
{
  boolean type;
  
  public Captain(String first, String last, String pos, boolean kind)
  {
    super(first,last,pos);
    type=kind;
  }
  public String toString()
  {
    String role;
    if (type==true)
      role="offense";
    else
      role="defense";
    return(super.toString()+"\n   Captain: "+role);
  }
}