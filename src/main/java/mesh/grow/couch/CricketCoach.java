package mesh.grow.couch;

public class CricketCoach implements Coach {

  private FortuneService fortuneService;

  // add new fields for email address and team
  private String emailAddress;
  private String team;

  public CricketCoach() {
    System.out.println("CricketCoach: inside no arg.");
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public void setTeam(String team) { this.team = team; }

  // setter method
  public void setFortuneService(FortuneService fortuneService) {
    System.out.println("CricketCoach: inside setter method - setFortuneService");
    this.fortuneService = fortuneService;
  }

  public String getEmailAddress() { return emailAddress; }
  public String getTeam() { return team; }


  @Override
  public String getDailyWorkout() {
    return "Practice fast bowling for 15 minutes";
  }

  public String getDailyFortune() {
    return fortuneService.getFortune();
  }

}
