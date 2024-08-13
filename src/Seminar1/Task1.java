package Seminar1;


import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class Task1 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        Date now1 = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("E dd.MM.yyyy 'и время' HH:mm:ss");
        System.out.println("Текущая дата: " + formatForDateNow.format(now1));

        String formattedDate1 = now.format(df);
        String formattedDate2 = now.format(sdf);

        System.out.println("Дата и время в формате yyyy-MM-dd HH:mm:ss: " + formattedDate1);
        System.out.println("Дата и время в формате dd/MM/yyyy HH:mm:ss: " + formattedDate2);
        System.out.println("Текущее время: " + now);

    }
}
