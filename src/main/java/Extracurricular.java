public class Extracurricular{
  protected String name;
  protected String supervisor;

  Extracurricular(String aName, String aSupervisor){
    name = aName;
    supervisor = aSupervisor;
  }

  public String getName(){
    return name;
  }
  
  public void displayInfo(){
    System.out.println("Activity: " + name);
    System.out.println("Supervisor: " + supervisor);
  }
}