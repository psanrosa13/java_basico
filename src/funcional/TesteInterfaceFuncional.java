package funcional;


import java.util.List;

public class TesteInterfaceFuncional {
    public static void main(String[] args) {

        Usuario usuario1 = new Usuario("Paula", 20);
        Usuario usuario2 = new Usuario("Aline",15);
        Usuario usuario3 = new Usuario("Lucas",35);
        Usuario usuario4 = new Usuario("Roberta",78);
        Usuario usuario5 = new Usuario("Bruno",24);
        Usuario usuario6 = new Usuario("João",5);

        List<Usuario> usuarios = List.of(usuario1, usuario2, usuario3, usuario4, usuario5, usuario6);

        List<Usuario> usuarios2 = List.of(usuario1, usuario2, usuario3, usuario4, usuario5, usuario6);

        // A interface Runnable tem apenas um único método abstrato. Uma interface
        //que se enquadre nesse requisito é agora conhecida como uma interface funcional

        //Primeira Forma de Criar a Função
        TornaModerador tornaModerador = new TornaModerador() {
            @Override
            public void tornaModerador(Usuario u) {
                if(u.getPontos() > 40){
                    u.tornaModerador();
                }
            }
        };

        //segunda forma de criar a função
        TornaModerador tornaModerador2 = (u) -> {
            if(u.getPontos() > 40){
                u.tornaModerador();
            }
        };

    }
}
