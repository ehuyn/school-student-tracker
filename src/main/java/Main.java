
public class Main {
  public static void main(String[] args) {
    Student student = new Student(338656309, "Emily Huynh", 12);

    Course courseA = new Course("SPH4U", "Physics", "Ms. Blackwell");
    Course courseB = new Course("ICS4U", "Computer Science", "Ms. Luce");
    Course courseC = new Course("MCV4U", "Calculus and Vectors", "Mr. Brown");
  
    Award award1 = new Award("Honour Roll", "Achieved overall average of 80% or higher.");
    Award award2 = new Award("Silver Medal", "Achieved overall average of 90% or higher.");

    Sport sport1 = new Sport("Senior Girls Volleyball", "Ms. Spear");
    Sport sport2 = new Sport("Senior Girls Soccer", "Mr. Secours");
    Sport sport3 = new Sport("Varsity Co-ed Ultimate Frisbee", "Ms. Olson, Ms. Atkinson, Mr. MacLeod");

    Club club1 = new Club("Mathletes", "Ms. Lim");
    Club club2 = new Club("Science Club", "Ms. Wilkinson");
    Club club3 = new Club("Peer Tutoring", "Ms. Kilfoil");

    student.addCourse(courseA);
    student.addCourse(courseB);
    student.addCourse(courseC);
    
    student.setCourseMark("SPH4U", 94);
    student.setCourseMark("ICS4U", 98.42);
    student.setCourseMark("MCV4U", 98);

    student.addAward(award1);
    student.addAward(award2);

    student.addSport(sport1);
    student.addSport(sport2);
    student.addSport(sport3);

    student.addClub(club1);
    student.addClub(club2);
    student.addClub(club3);

    student.outputStudentInfo();
    student.outputCourses();
    student.outputAwards();
    student.outputExtracurriculars();
  }  
}