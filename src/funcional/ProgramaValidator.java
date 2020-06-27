package funcional;

public class ProgramaValidator {
    public static void main(String[] args) {

        //primeira forma
        Validador<String> validadorCEP = new Validador<String>() {
            public boolean valida(String valor) {
                return valor.matches("[0-9]{5}-[0-9]{3}");
            }
        };

       //segunda forma usando recursos do java 8
        Validador<String> validadorCEP2 =
                valor -> {
                    return valor.matches("[0-9]{5}-[0-9]{3}");
                };

        String cepValido = "11720-330";
        String cepInvalido = "11455";

        System.out.println(validadorCEP.valida(cepValido));
        System.out.println(validadorCEP.valida(cepInvalido));
        System.out.println("");
        System.out.println(validadorCEP2.valida(cepValido));
        System.out.println(validadorCEP2.valida(cepInvalido));

    }
}
