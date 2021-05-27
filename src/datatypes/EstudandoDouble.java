package datatypes;

public class EstudandoDouble {
    public static void main(String[] args) {

        //Double
        //Stores fractional numbers. Sufficient for storing 15 decimal digits
        double variavelTipoDouble = 111125555.56565;

        System.out.println(variavelTipoDouble);

        variavelTipoDouble = -1147483648;

        System.out.println(variavelTipoDouble);

        //Quando ele tenta fazer o cast para um tipo que suporta menos informação ele altera os valores
        variavelTipoDouble = (double) 314748364;

        System.out.println(variavelTipoDouble);

        variavelTipoDouble = (double) 314748364;

        System.out.println(variavelTipoDouble);

    }

}
