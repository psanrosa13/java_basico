package datatypes;

public class EstudandoInt {
    public static void main(String[] args) {

        //Int
        //Stores whole numbers from -2,147,483,648 to 2,147,483,647 , ocupa 4 bites
        int variavelTipoInt = 1147483648;

        System.out.println(variavelTipoInt);

        variavelTipoInt = -1147483648;

        System.out.println(variavelTipoInt);

        //Quando ele tenta fazer o cast para um tipo que suporta menos informação ele altera os valores
        variavelTipoInt = (int) 314748364;

        System.out.println(variavelTipoInt);

        variavelTipoInt = (int) 314748364;

        System.out.println(variavelTipoInt);

    }
}
