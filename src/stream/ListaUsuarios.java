package stream;

import java.util.ArrayList;
import java.util.List;

public class ListaUsuarios {

    public static List<Usuario> getListaUsuarios(){
        List<Usuario> lista = new ArrayList<Usuario>();

        Usuario usuario1 = new Usuario("Ana Paula Siqueira", 1562);
        Usuario usuario2 = new Usuario("João Silva", 2564);
        Usuario usuario3 = new Usuario("Bruna Souza", 1542);
        Usuario usuario4 = new Usuario("Karla Tobias", 775);
        Usuario usuario5 = new Usuario("Luis Trancoso", 1230);
        Usuario usuario6 = new Usuario("Juliano Dias", 2350);

        lista.add(usuario1);
        lista.add(usuario2);
        lista.add(usuario3);
        lista.add(usuario4);
        lista.add(usuario5);
        lista.add(usuario6);

        return lista;
    }
}
