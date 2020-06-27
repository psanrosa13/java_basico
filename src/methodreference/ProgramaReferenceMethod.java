package methodreference;

import java.util.function.Consumer;

public class ProgramaReferenceMethod {
    public static void main(String[] args) {

        Usuario paula = new Usuario("Paula", 50);
        Runnable bloco = paula::tornaModerador;
        bloco.run();

        Consumer<Usuario> consumer = Usuario::tornaModerador;
        consumer.accept(paula);


    }
}
