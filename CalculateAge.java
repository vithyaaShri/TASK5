import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CalculateAge {
    public static void main(String[] args) {
    System.out.println("Please enter your date of birth in yyyy-mm-dd");
    LocalDate today=LocalDate.now();
    try (Scanner scan = new Scanner(System.in)) {
        String date=scan.next();
        String[] str=date.split("-");
        int year=Integer.parseInt(String.valueOf(str[0]));
        int month=Integer.parseInt(String.valueOf(str[1]));
        int day=Integer.parseInt(String.valueOf(str[2]));
        LocalDate birthdate=LocalDate.of(year, month, day);
        Period p = Period.between (birthdate, today);
        System.out.println (p.getYears ()+" "+p.getMonths()+" "+p.getDays());
    } catch (NumberFormatException e) {
        e.printStackTrace();
    }
    }
    
    
}
