package stream;

import objetosTeste.ListaUsuarios;
import objetosTeste.Usuario;

import java.util.List;
import java.util.stream.Collectors;

public class ProgramaUmStream {
    public static void main(String[] args) {

        List<Usuario> usuarios = ListaUsuarios.getListaUsuarios();

        usuarios.stream().
                filter(u -> u.getPontos() > 1700)
                .forEach(usuario -> System.out.println(usuario.getNome()));

        List<Usuario> lista = usuarios.stream()
                .filter(u -> u.getPontos() > 1000)
                .collect(Collectors.toList());

       
    }
}
