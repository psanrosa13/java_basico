package stream;

import objetosTeste.ListaUsuarios;
import objetosTeste.Usuario;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramaOrdenacaoStream {
    public static void main(String[] args) {
        List<Usuario> usuarios = ListaUsuarios.getListaUsuarios();
        //Ordenar por nome
        usuarios.sort(Comparator.comparing(Usuario::getNome));

        System.out.println("");

        List<Usuario> usuariosDois = ListaUsuarios.getListaUsuarios();
        //filtra quem tem mais de 1000 pontos e ordena
        usuariosDois.stream()
                .filter(u -> u.getPontos() > 1000)
                .sorted(Comparator.comparing(Usuario::getNome))
                .forEach(u -> System.out.println(u.getNome()));

        System.out.println("");

        List<Usuario> filtradosOrdenados = usuarios.stream()
                .filter(u -> u.getPontos() > 1000)
                .sorted(Comparator.comparing(Usuario::getNome))
                .collect(Collectors.toList());



    }
}
