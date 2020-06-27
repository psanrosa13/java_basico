package defaultmethods;

import com.sun.source.tree.LiteralTree;

import java.util.List;

public class ProgramaPontos {
    public static void main(String[] args) {

        Usuario usuario1 = new Usuario("Aline", 20);
        Usuario usuario2 = new Usuario("Junior", 30);

        List<Usuario> usuarios = List.of(usuario1, usuario2);

        usuarios.stream().forEach(u -> u.acrescentaPonto(u));

        usuarios.stream().forEach(u -> System.out.println(u.getPontos()));
    }
}
