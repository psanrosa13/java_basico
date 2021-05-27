package datatypes;

public class EstudandoLong {
    public static void main(String[] args) {

        //Long
        //Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 e ocupa 8 bites
        long variavelTipoLong = 1147483648;

        System.out.println(variavelTipoLong);

        variavelTipoLong = -1147483648;

        System.out.println(variavelTipoLong);

        //Quando ele tenta fazer o cast para um tipo que suporta menos informação ele altera os valores
        variavelTipoLong = (long) 314748364;

        System.out.println(variavelTipoLong);

        variavelTipoLong = (long) 314748364;

        System.out.println(variavelTipoLong);

    }

}
