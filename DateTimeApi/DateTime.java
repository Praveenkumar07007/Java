// import java.util.Date;
import java.time.*;
public class DateTime {
  public static void main(String args[]){
      // Date dt = new Date();
      // System.out.println(dt); // javap java.util.Date this command will give all types of metods associated with that particular Class
      // joda api
      LocalDate date = LocalDate.now();
      System.out.println(date);
      LocalDate time = LocalTime.now();
      System.out.println(time);
      
  }
}
