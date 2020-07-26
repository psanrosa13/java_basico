package referencia;

public class Exemplo {
    public static void main(String[] args) {
        Usuario usuarioPaula = new Usuario(1, "Paula");

        Usuario usuarioPaulaCopia = new Usuario(1, "Paula");
        usuarioPaulaCopia.atualizaNome("Novo Nome");

        Usuario usuarioPaulaReferencia = usuarioPaula;
        usuarioPaulaReferencia.atualizaNome("Ana Paula Souza");

        System.out.println();
    }
}
