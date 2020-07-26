package switchCase;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class ProgramaSwitchCaseJava12 {
    enum DIAS_SEMANA{
        SEGUNDA, TERCA,QUARTA, QUINTA, SEXTA, SABADO, DOMINGO
    }
    public static void main(String[] args) {
        DIAS_SEMANA dia = DIAS_SEMANA.SEGUNDA;
        String resultado;
        switch (dia){
            case SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA -> resultado = "Meio da semana";
            case SABADO, DOMINGO -> resultado = "Final de Semana";
            default -> resultado = "Dia inválido";
        }
        System.out.println(resultado);

    }
}
