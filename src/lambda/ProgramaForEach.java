package lambda;

import java.util.List;
import java.util.function.Consumer;

public class ProgramaForEach {
    public static void main(String[] args) {

        Usuario usuario1 = new Usuario("Paula", 20);
        Usuario usuario2 = new Usuario("Aline",15);
        Usuario usuario3 = new Usuario("Lucas",35);
        Usuario usuario4 = new Usuario("Roberta",78);
        Usuario usuario5 = new Usuario("Bruno",24);
        Usuario usuario6 = new Usuario("João",5);

        List<Usuario> usuarios = List.of(usuario1, usuario2, usuario3, usuario4, usuario5, usuario6);

        //O foreach utiliza um consumer
        Mostrador mostrador= new Mostrador();

        //primeira forma
        usuarios.forEach(mostrador);

        //segunda forma
        usuarios.forEach(new Consumer<Usuario>() {
            public void accept(Usuario u) {
                System.out.println(u.getNome());
            }
        });

        //terceira forma
        Consumer<Usuario> mostrador2 =(Usuario u) -> System.out.println(u.getNome());
        usuarios.forEach(mostrador2);

        //quarta forma
        usuarios.forEach(u -> System.out.println(u.getNome()));

    }
}
