package co.argm.app;

import java.time.LocalDate;
import java.time.Period;

import static java.lang.System.out;

/**
 * Clase para trabajar con Periods (períodos) entre dos fechas utilizando LocalDate.
 */
public class Periods {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2011, 9, 23);
        LocalDate date2 = LocalDate.of(2020, 11, 25);
        LocalDate date3 = date2.withMonth(12).withDayOfMonth(28);

        Period period = Period.between(date1, date3);
        out.println("Period between dates: " + period);
        out.printf("Between %s and %s there are %d years, %d months and %d days%n",
                date1, date3, period.getYears(), period.getMonths(), period.getDays());
    }
}
