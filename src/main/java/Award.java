public class Award{
  private String title;
  private String description;

  Award(String aTitle, String aDescription){
    title = aTitle;
    description = aDescription;
  }

  public String getTitle(){
    return title;
  }

  public void displayInfo(){
    System.out.println("Award: " + title);
    System.out.println("Description: " + description);
  }
}