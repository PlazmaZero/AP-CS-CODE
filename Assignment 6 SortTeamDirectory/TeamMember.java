public class TeamMember 
{
 public String fullName;
 private String idString;
 
 public TeamMember(String name,String id)
 {
  String temp="";
   name.toLowerCase();
   temp+=(name.substring(0,1)).toUpperCase();
   for (int i=1;i<name.length();i++)
   {
     if ((name.charAt(i-1)==' ')||(name.charAt(i-1)=='\t'))
     {
       temp+=(name.substring(i,i+1)).toUpperCase();
     }
     else
     {
       temp+=(name.substring(i,i+1)).toLowerCase();
     }
   }
   fullName=temp;
   idString=id;
 }
 public String toString()
 {
   return fullName;
 }
 public int compareTo(TeamMember other)
 {
  int compare= idString.compareTo(other.idString);
  if (compare<0)
    return -1;
  else if (compare==0)
    return 0;
  else 
    return 1;
 }
  
}