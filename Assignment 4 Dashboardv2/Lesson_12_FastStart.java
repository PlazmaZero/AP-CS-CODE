import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;
import java.lang.Math;

import java.util.ArrayList;


public class Lesson_12_FastStart {
 

    public static void main(String[] args) {
      ArrayList<String> words = new ArrayList<String>();
      words.add("one");
      words.add("two");
      words.add("three");
      words.add("four");
      words.add("five");
      words.add("six");
      words.add("seven");
      words.add("eight");
      words.add("nine");
      words.add("ten");
      int x=(int)(Math.random()*10);
      System.out.println(words.get(x));
      words.remove(x);
      //ArrayList<String> temp =new ArrayList<String>();
      //for (int i=10;i>x;i--)
      //{
        //temp.add(words.get(i));
      //}
      //int count=0;
      //for (int i=9;i>x;i--)
      //{
        //words.set(i,(temp.get(count)));
        //count++;
      //}
      //words.remove(10);
      System.out.println(words.get((int)Math.random()*10));
      
    }
    
}