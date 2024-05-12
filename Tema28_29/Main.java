package Tema28_29;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//-Using Java's built-in date/time libraries, generate a list of all Mondays in the upcoming year.
// Print out each Monday's date.
public class Main {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        List<LocalDate> mondays = new ArrayList<>();

        LocalDate date = LocalDate.of(currentDate.getYear() + 1, 1, 1);
        System.out.println(date);

        while(date.getYear() == currentDate.getYear() + 1){
            if (date.getDayOfWeek() == DayOfWeek.MONDAY) {
                mondays.add(date);
            }

            date = date.plusDays(1);

        }

        for (LocalDate monday : mondays) {
            System.out.println(monday);
        }
    }
}
