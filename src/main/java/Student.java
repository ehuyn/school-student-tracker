import java.util.ArrayList;

public class Student{
  public ArrayList<Course> courseList = new ArrayList<Course>();
  private ArrayList<Award> awardsList = new ArrayList<Award>();
  private ArrayList<Extracurricular> extracurricularList = new ArrayList<Extracurricular>();
  
  private int studentID;
  private String name;
  private int grade;

  Student(int id, String aName, int aGrade){
    studentID = id;
    name = aName;
    grade = aGrade;  
  }
  
  // Add student data
  public void addCourse(Course course){
    courseList.add(course);
  }
  
  public void addAward(Award award){
    awardsList.add(award);
  }

  public void addExracurricular(Extracurricular activity){
      extracurricularList.add(activity);
  }

  // Set course marks
  public void setCourseMark(String courseCode, double mark){
    for(Course course : courseList){
      if(course.getCode().equals(courseCode)){
        course.setAvg(mark);
        return;
      }
    }
  }

  // Output information
  public void outputStudentInfo(){
    System.out.println("---STUDENT INFO---");
    System.out.println("Student: " + name);
    System.out.println("ID: " + studentID);
    System.out.println("Grade: " + grade);
    System.out.println("Overall Average: " + calculateOverallAvg() + "\n\n");
  }

  public void outputCourses(){
    System.out.println("-----COURSES-----");
    for(Course course : courseList){
      course.displayInfo();
      System.out.println();
    }
    System.out.println();
  }

  public void outputAwards(){
    System.out.println("-----AWARDS-----");
    for(Award award : awardsList){
      award.displayInfo();
      System.out.println();
    }
    System.out.println();
  }

  public void outputExtracurriculars(){
    System.out.println("---EXTRACURRICULARS---");
    for(Extracurricular activity : extracurricularList){
      activity.displayInfo();
      System.out.println();
    }
    System.out.println();
  }

  // Calculations
  private int calculateOverallAvg(){
    double sum = 0;
    for(Course course : courseList){
      sum += (int)(course.getAvg()+0.5);
    }
    return (int)(sum/courseList.size()+0.5);
  }
}