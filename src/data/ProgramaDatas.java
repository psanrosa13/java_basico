package data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ProgramaDatas {
    public static void main(String[] args) {

        LocalDate data = LocalDate.now();
        System.out.println("Como é o localDate - "+data);

        LocalDateTime dataCompleta = LocalDateTime.now();
        System.out.println("Como é o LocalDateTime - "+dataCompleta);

        LocalTime  tempo = LocalTime.now();
        System.out.println("Como é o LocalTime - "+tempo);


        System.out.println("Formatando Datas");

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(data.format(formatador));

        DateTimeFormatter formatador2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(data.format(formatador2));

        DateTimeFormatter formatador3 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        System.out.println(data.format(formatador3));

        DateTimeFormatter formatador4 = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
        System.out.println(data.format(formatador4));


    }
}
