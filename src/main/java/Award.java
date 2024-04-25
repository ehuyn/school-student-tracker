public class Award{
  private String title;
  private String description;

  Award(String aTitle, String aDescription){
    title = aTitle;
    description = aDescription;
  }

  public void displayInfo(){
    System.out.println("Award: " + title);
    System.out.println("Description: " + description);
  }
}