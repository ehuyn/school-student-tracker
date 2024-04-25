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

  public String getCourseCode(){
    return courseCode;
  }

  public String getName(){
    return name;
  }
  
  public String getTeacher(){
    return teacher;
  }
  
  public double getAverage(){
    return average;
  }

  public void setAverage(double avg){
    average = avg;
  }

  public void displayInfo(){
    System.out.println("Course code: " + getCourseCode());
    System.out.println("Course name: " + getName());
    System.out.println("Teacher: " + getTeacher());
    if(average > 0){System.out.println("Average: " + (int)(getAverage()+0.5));}
  }
}