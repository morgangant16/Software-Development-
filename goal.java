import java.text.NumberFormat;
import java.util.Comparator;
/**
 *
 * 
 */
public class goal 
{
  String Name;
  String Goals;
  // contructor 
  public goal(String name,String Goal)
  {
      Name= name;
      Goals= Goal; 
      
  }
  // methods 
  public String getName()
  {
      return Name;
  }
  public String getGoal()
  {
      return Goals; 
  }
  public String toString()
  {
     return Name + "-goals for the semester: " + Goals; 
 
  }
}
