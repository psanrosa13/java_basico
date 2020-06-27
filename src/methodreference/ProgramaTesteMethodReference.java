package methodreference;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProgramaTesteMethodReference {
    public static void main(String[] args) {

        Usuario usuario1 = new Usuario("Kaike",162);
        Usuario usuario2 = new Usuario("Fabricio",789);
        Usuario usuario3 = new Usuario("Leticia",542);

        List<Usuario> usuarios = new ArrayList<Usuario>();
        usuarios.add(usuario1);
        usuarios.add(usuario2);
        usuarios.add(usuario3);

        usuarios.forEach(Usuario::tornaModerador);

        usuarios.sort(Comparator.comparing(Usuario::getNome));

        System.out.println("_____________________________________________");
        System.out.println("          Nome                 Pontos        ");
        usuarios.forEach(u -> System.out.println("          "+u.getNome()+"                    "+u.getPontos()+"        "));
        System.out.println("_____________________________________________");
        System.out.println("");

        usuarios.sort(Comparator.comparingInt(Usuario::getPontos));

        System.out.println("_____________________________________________");
        System.out.println("          Nome                 Pontos        ");
        usuarios.forEach(u -> System.out.println("          "+u.getNome()+"             "+u.getPontos()+"        "));
        System.out.println("_____________________________________________");

        System.out.println("");

        usuarios.sort(Comparator.comparingInt(Usuario::getPontos)
                .thenComparing(Usuario::getNome));

        System.out.println("_____________________________________________");
        System.out.println("          Nome                 Pontos        ");
        usuarios.forEach(u -> System.out.println("          "+u.getNome()+"             "+u.getPontos()+"        "));
        System.out.println("_____________________________________________");

        System.out.println("");

        usuarios.sort(Comparator.nullsLast(
                Comparator.comparing(Usuario::getNome)));

        System.out.println("_____________________________________________");
        System.out.println("          Nome                 Pontos        ");
        usuarios.forEach(u -> System.out.println("          "+u.getNome()+"             "+u.getPontos()+"        "));
        System.out.println("_____________________________________________");

        System.out.println("");

        usuarios.sort(Comparator.comparing(Usuario::getNome).reversed());
        System.out.println("_____________________________________________");
        System.out.println("          Nome                 Pontos        ");
        usuarios.forEach(u -> System.out.println("          "+u.getNome()+"             "+u.getPontos()+"        "));
        System.out.println("_____________________________________________");


    }
}
