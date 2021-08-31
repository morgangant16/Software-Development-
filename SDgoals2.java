import java.util.Arrays;
import java.text.NumberFormat;
import java.util.Scanner;
import java.util.List;
import java.util.*;
/**
 * Morgan Gant 
 * 8-27-21
 */
public class SDgoals2 
{
    public static void main(String[] args)
    {
            In file= new In("Software Development practice coding file.txt");
            String inLine= new String();
            String name;
            String Goal;
            goal[] all= new goal[20]; //big enough for our class size 
            goal aStudent; //creating students 
            int i=0;
            int j=0;
            //Scanner scan= new Scanner(System.in);
            
            while(file.hasNextLine())
            { 
               inLine = file.readLine();
               String[] splitString= inLine.split(":");
               name= splitString[0];
               Goal= splitString[1];
               // adding students 
               aStudent= new goal(name, Goal);
               i++;
               all[i] = aStudent; 
            }
            //System.out.println("Student Name:");
            //String search= scan.nextLine();
            // conditional statement
            
            for(i=0; i< all.length; i++)
            {
                if (all[i] != null)
                {
                    System.out.println(all[i]);
                }
            }
    }
}