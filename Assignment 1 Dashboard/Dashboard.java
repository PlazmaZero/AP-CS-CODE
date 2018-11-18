/*
 * AP CS MOOC
 * Term 2 - Assignment 1, Dashboard
 * A class which represents a car dashboard.
 */

public class Dashboard {

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