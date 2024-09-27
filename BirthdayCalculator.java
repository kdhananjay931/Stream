import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class BirthdayCalculator {

    public static void main(String[] args) {

        LocalDate Birthday=LocalDate.of(1995,12,15);
        LocalDate Today=LocalDate.now();

        System.out.println(ChronoUnit.YEARS.between(Birthday,Today));

    }
}
