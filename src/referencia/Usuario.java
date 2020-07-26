package referencia;

public class Usuario {

    private int codigo;
    private String nome;

    public Usuario(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void atualizaNome(String novoNome){
        this.nome = novoNome;
    }
}
