package comparators;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProgramaTesteComparator {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Paula", 250);
        Usuario usuario2 = new Usuario("Lucas", 100);
        Usuario usuario3 = new Usuario("Tiago", 150);
        Usuario usuario4 = new Usuario("Julia", 340);

        List<Usuario> usuarios = new ArrayList<Usuario>();
        usuarios.add(usuario1);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        usuarios.add(usuario4);

        //primeira forma de comparator
        Comparator<Usuario> comparator = new Comparator<Usuario>() {
            public int compare(Usuario u1, Usuario u2) {
                return u1.getNome().compareTo(u2.getNome());
            }
        };

        Collections.sort(usuarios, comparator);

        System.out.println("usuarios:");
        usuarios.forEach(u -> System.out.println(u.getNome()));

        System.out.println("------------------------------------------");

        List<Usuario> usuarios2 = new ArrayList<Usuario>();
        usuarios2.add(usuario1);
        usuarios2.add(usuario2);
        usuarios2.add(usuario3);
        usuarios2.add(usuario4);

        Comparator<Usuario> comparator2 =
                (u1, u2) -> u1.getNome().compareTo(u2.getNome());

        Collections.sort(usuarios2, comparator);
        System.out.println("usuarios:");
        usuarios.forEach(u -> System.out.println(u.getNome()));

        System.out.println("------------------------------------------");

        List<Usuario> usuarios3 = new ArrayList<Usuario>();
        usuarios3.add(usuario1);
        usuarios3.add(usuario2);
        usuarios3.add(usuario3);
        usuarios3.add(usuario4);


        Collections.sort(usuarios3,
                (u1, u2) -> u1.getNome().compareTo(u2.getNome()));

        System.out.println("usuarios:");
        usuarios3.forEach(u -> System.out.println(u.getNome()));
    }
}
