package defaultmethods;

public interface Pontuavel {

    default void acrescentaPonto(Usuario u){
        u.adicionaPonto();
    }
}
