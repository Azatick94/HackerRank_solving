package Introduction;
import java.time.LocalDate;

//
public class Solving_Calendar {
    public static void main(String[] args) {

        // creating integer month, day, year
        int month = 12;
        int day = 1;
        int year = 2019;

        // calling method get_day_of_week
        String day_of_week = get_day_of_week(month, day, year);
        System.out.println(day_of_week);
    }

    public static String get_day_of_week(int month, int day, int year) {
        LocalDate dt = LocalDate.of(year, month, day);
        String day_of_week = dt.getDayOfWeek().toString();
        return day_of_week; 
    }


}
