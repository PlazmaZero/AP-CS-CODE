/*
 * AP CS MOOC
 * Term 2 - Assignment 1, Dashboard
 * A class which represents a car dashboard.
 */

public class Dashboard implements Comparable {

    private int odometer;
    private int speedometer;
    private boolean checkEngine;

    public Dashboard() {
        /* missing code */
      odometer=0;
      speedometer=0;
      checkEngine=false;
    }

    public Dashboard(int o, int s) {
        /* missing code */
      if (o>=0&&o<=99999)
      {
       odometer=o; 
      }
      else
      {
        odometer=0;
        checkEngine=true;
      }
      if (s>=0&&s<=100)
      {
       speedometer=s; 
      }
      else
      {
       speedometer=0;
       checkEngine=true;
      }
    }

    public String toString() {
        /* missing code */
      String all= "Speedometer: " + speedometer +" MPH\nOdometer: ";
      String length= Integer.toString(odometer);
      int zeros=(5-length.length());
      for (int i=0;i<zeros;i++)
      {
       all+="0";
      }
      all+=odometer;
      if (checkEngine==true)
      {        
      all+=("\nCheck Engine: On");
      }
      else
      {
        all+=("\nCheck Engine: Off");
      }
      
        return all;
    }
    
    public int compareTo(Object other)
    {
      Dashboard temp = (Dashboard)other;
      if (odometer<temp.odometer)
      {
        return -1;
      }
      else if (odometer>temp.odometer)
      {
        return 1;
      }
      else if (speedometer<temp.speedometer)
      {
        return -1;
      }
      else if (speedometer>temp.speedometer)
      {
        return 1;
      }
      else if (temp.checkEngine==true && checkEngine==false)
      {
        return -1;
      }
      else if (temp.checkEngine==false && checkEngine==true)
      {
        return 1;
      }
      else
        return 0;
      
    }
    
    public String race(Dashboard other, int acc1, int acc2)
    {
      String s="";
      for (int i=0;i<acc1;i++)
      {
        accelerate();
        if (checkEngine==true)
        {}
          break;
      }
      for (int i=0;i<acc2;i++)
      {
        other.accelerate();
        if (other.checkEngine==true)
        {}
          break;  
      }
      if (checkEngine==true)
      {
        s+="First car stalled out!\n";
        speedometer=0;
      }
      if (other.checkEngine==true)
      {
        s+="Second car stalled out!\n";
        other.speedometer=0;
      }
      
      s+="\n"+toString()+"\n\n"+other.toString()+"\n\n";
      
      if (checkEngine==false && other.checkEngine==true)
        s+="Car 1 has won the race!"; 
      
      else if (checkEngine==true && other.checkEngine==false)
        s+="Car 2 has won the race!";
      
      else if (checkEngine==false && other.checkEngine==false)
      {
       if (speedometer>other.speedometer)
         s+="Car 1 has won the race!"; 
       else if(speedometer<other.speedometer)
         s+="Car 2 has won the race!";
       else 
         s+="It's a tie!";
      }
      else if (checkEngine==true && other.checkEngine==true)
         s+="It's a tie!";
      return s;
    }
    
    public String difference(Dashboard other)
    { 
      
      if (odometer>other.odometer)
       {
         int x=(odometer)-(other.odometer);
        int time=(x/(other.speedometer))*60;
        return "Second car will need to drive for "+ time +" minutes to catch first car.";
       }
      else
      {
       int x=(other.odometer)-(odometer);
      int time=(x/(speedometer))*60;
      return "First car will need to drive for "+ time +" minutes to catch second car.";
             }
    }
    
    public void accelerate() {
        /* missing code */
      speedometer+=1;
      if (speedometer>100)
      {
       speedometer=0;
       checkEngine=true;
      }
    }

    public void drive(int n) {
        /* missing code */
      odometer+=((int)((speedometer/60.0)*n));
      if (odometer>99999)
      {
        odometer=0;
        checkEngine=true;
      }
    }

}