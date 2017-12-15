/*
Java grade average calculator
*/
//Imports All Packages
import java.util.*;

public class GradeAnalyzer {
  public void GradeAnalyzer() {
    
  }
  //getAverage Method Creation
  public int getAverage(ArrayList<Integer> grades) {
    //Checks if grade size is < 1
  	if (grades.size() < 1) {
      System.out.println("Error, array is empty!");
      return 0;
    }
    else {
      int sum = 0;
      for (Integer grade : grades) {
				sum = sum + grade;
      }
      int average = sum / grades.size();
      System.out.println(average);
      return average;
    }
  }
  public static void main(String[] args) {
    //Creates grade array
    ArrayList<Integer> myClassroom = new ArrayList<Integer>();
    //Adds to grade array
    myClassroom.add(98);
    myClassroom.add(92);
    myClassroom.add(88);
    myClassroom.add(75);
    myClassroom.add(61);
    myClassroom.add(89);
    myClassroom.add(95);
    //creates analyzer object
    GradeAnalyzer myAnalyzer = new GradeAnalyzer();
    //uses getAverage method on grade array
    myAnalyzer.getAverage(myClassroom);
  }
}
