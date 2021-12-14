package Task3BithdayData;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Birthday {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTimeBirth =LocalDateTime.of(1987,12,28,04,53,25);

        int year = localDateTime.getYear() - localDateTimeBirth.getYear();
        int month = localDateTime.getMonthValue()- localDateTimeBirth.getMonthValue();
        int day = localDateTime.getDayOfMonth() - localDateTimeBirth.getDayOfMonth();
        int hour = localDateTime.getHour() - localDateTimeBirth.getHour();
        int min = localDateTime.getMinute()-localDateTimeBirth.getMinute();
        int sec = localDateTime.getSecond() - localDateTimeBirth.getSecond();
        if (sec<0) {
            sec=sec+60;
            min = min - 1;
        }
        if (min <0) {
            min = min +60;
            hour = hour-1;
        }
        if (hour<0){
            hour = hour+24;
            day = day-1;
        }
        if (day<0) {
            if (localDateTime.getMonthValue() ==2||localDateTime.getMonthValue() ==4||localDateTime.getMonthValue() ==6||
            localDateTime.getMonthValue() ==9||localDateTime.getMonthValue() ==11||localDateTime.getMonthValue() ==12){
                day = day+31;
                month = month-1;
            } else if (localDateTime.getMonthValue() ==1) {
                day = day+28;
                month = month-1;
            } else {
                day = day + 30;
                month = month - 1;
            }
        }
        if (month <0) {
            month = month+12;
            year = year -1;
        }

        System.out.printf("Вітаємо. Ви живете на цій дивовижній планеті %d років, %d місяців, %d днів, " +
                "%d годин, %d хвилин, %d секунд", year, month, day, hour, min, sec);
    }
}
