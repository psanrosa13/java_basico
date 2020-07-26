package featuresQuartoze;

public class ProgramaTextBlocks {
    public static void main(String[] args) {
        String mensagemGrandeAntes = "Antes ao criar uma" +
                " mensagem grande, ficava muito cheio de " +
                " regras para concatenação do texto," +
                "e isso era chato...";
/*
        String mensagemGrandeDepoisJava14 = """Agora com o Java 14
                                            Ficou muito fácil criar uma
                                            String maior concatenada
                                         """;
*/
        System.out.println(mensagemGrandeAntes);

        System.out.println("------------------------------------------------");

        //System.out.println(mensagemGrandeDepoisJava14);
    }
}
