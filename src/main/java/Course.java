public class Course{
  private String courseCode;
  private String name;
  private String teacher;
  private double average;

  Course(String aCode, String aName, String aTeacher){
    courseCode = aCode;
    name = aName;
    teacher = aTeacher;
  }

  public double getAvg(){
    return average;
  }

  public String getCode(){
    return courseCode;
  }

  public void setAvg(double avg){
    average = avg;
  }

  public void displayInfo(){
    System.out.println("Course code: " + courseCode);
    System.out.println("Course name: " + name);
    System.out.println("Teacher: " + teacher);
    if(average > 0){System.out.println("Average: " + average);}
  }
}