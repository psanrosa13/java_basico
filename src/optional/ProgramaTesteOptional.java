package optional;

import objetosTeste.ListaUsuarios;
import objetosTeste.Usuario;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.IntBinaryOperator;

public class ProgramaTesteOptional {
    public static void main(String[] args) {
        List<Usuario> usuarios = ListaUsuarios.getListaUsuarios();

        //primeira forma
        OptionalDouble media = usuarios.stream()
                .mapToInt(Usuario::getPontos)
                .average();

        double pontuacaoMedia = media.orElse(0.0);


        //segunda forma
        double pontuacaoMedia2 = usuarios.stream()
                .mapToInt(Usuario::getPontos)
                .average()
                .orElse(0.0);



        usuarios.stream()
                .mapToInt(Usuario::getPontos)
                .average()
                .ifPresent(valor -> System.out.println("Imprime media "+ valor));


        Optional<Usuario> max = usuarios
                .stream()
                .max(Comparator.comparingInt(Usuario::getPontos));


        Optional<String> maxNome = usuarios
                .stream()
                .max(Comparator.comparingInt(Usuario::getPontos))
                .map(u -> u.getNome());

        Optional<Usuario> usuarioOptional = usuarios.stream()
                .filter(u -> u.getPontos() > 100)
                .findAny();



    }
}
