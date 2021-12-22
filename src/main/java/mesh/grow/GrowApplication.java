package mesh.grow;

import mesh.grow.couch.BaseballCoach;
import mesh.grow.couch.Coach;
import mesh.grow.couch.TrackCouch;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GrowApplication {
  public static void main(String[] args) {

    BaseballCoach coach = new BaseballCoach();
    coach.getDailyWorkout();

    TrackCouch trackCoach = new TrackCouch();
    trackCoach.getDailyWorkout();

    Coach commonCoach = new BaseballCoach();
    commonCoach.getDailyWorkout();

    SpringApplication.run(GrowApplication.class, args);
  }
}
