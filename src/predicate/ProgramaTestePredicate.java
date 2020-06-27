package predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ProgramaTestePredicate {
    public static void main(String[] args) {

        Predicate<Usuario> predicado = new Predicate<Usuario>() {
            public boolean test(Usuario u) {
                return u.getPontos() < 160;
            }
        };

        Usuario usuario1 = new Usuario("Paula", 250);
        Usuario usuario2 = new Usuario("Lucas", 100);
        Usuario usuario3 = new Usuario("Tiago", 150);
        Usuario usuario4 = new Usuario("Julia", 340);

        List<Usuario> usuarios = new ArrayList<Usuario>();
        usuarios.add(usuario1);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        usuarios.add(usuario4);

        List<Usuario> usuarios2 = new ArrayList<Usuario>();
        usuarios2.add(usuario1);
        usuarios2.add(usuario2);
        usuarios2.add(usuario3);
        usuarios2.add(usuario4);

        usuarios.removeIf(predicado);
        usuarios.forEach(u -> System.out.println(u.getNome()));

        System.out.println("------------------------------------------");

        usuarios2.removeIf(u -> u.getPontos() > 160);
        usuarios2.forEach(u -> System.out.println(u.getNome()));

    }
}
