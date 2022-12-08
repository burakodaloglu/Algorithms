import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        LocalDate baslangic = LocalDate.of(2020, 1, 1);
        LocalDate bitis = LocalDate.of(2022, 06, 10);

        long months = ChronoUnit.MONTHS.between(baslangic, bitis) + 1;

        Month[] allMonths = Month.values();

        for (int i = 0; i < months; i++) {
            int aylar = (baslangic.getMonthValue() + i - 1) % 12;
            Month currentMonth = allMonths[aylar];
            System.out.println(currentMonth);
        }


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println("Başlangıç tarihi: " + baslangic.format(formatter));
        System.out.println("Bitiş tarihi: " + bitis.format(formatter));

    }
}