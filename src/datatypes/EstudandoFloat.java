package datatypes;

public class EstudandoFloat {

    public static void main(String[] args) {
        //Float
        //-2,147,483,648 to 2,147,483,647 and
        // Stores fractional numbers. Sufficient for storing 6 to 8 decimal digits e ocupa 4 bytes
        float variavelTipoFloat = 2.78965325f;

        System.out.println(variavelTipoFloat);

        variavelTipoFloat = -1147483648.254f;

        System.out.println(variavelTipoFloat);

        //Quando ele tenta fazer o cast para um tipo que suporta menos informação ele altera os valores
        variavelTipoFloat = (float) 314748364.36562526565565f;

        System.out.println(variavelTipoFloat);
    }
}
