import java.time.LocalDate;
import java.util.Random;

public class Lottery {
    LocalDate date;
    int number;
    int number1, number2, number3, number4, number5;

    Random rd = new Random();

    public Lottery() {
        this.date = LocalDate.now();
        this.number = rd.nextInt(100);
        this.number1 = rd.nextInt(100);
        this.number2 = rd.nextInt(100);
        this.number3 = rd.nextInt(100);
        this.number4 = rd.nextInt(100);
    }




    @Override
    public String toString() {
        return date + " : " + number;
    }
}
