package stream;

import objetosTeste.ListaUsuarios;
import objetosTeste.Usuario;

import java.util.List;
import java.util.function.IntBinaryOperator;

public class ProgramaReduceStream {
    public static void main(String[] args) {
        List<Usuario> usuarios = ListaUsuarios.getListaUsuarios();

        int valorInicial = 0;
        IntBinaryOperator operacao = (a, b) -> a + b;

        int total = usuarios.stream()
                .mapToInt(Usuario::getPontos)
                .reduce(valorInicial, operacao);


        int total2 = usuarios.stream()
                .mapToInt(Usuario::getPontos)
                .reduce(0, (a, b) -> a + b);
    }
}
