package defaultmethods;

class Usuario implements Pontuavel {

    private String nome;
    private int pontos;
    private boolean moderador;

    public Usuario(String nome, int pontos) {
        this.nome = nome;
        this.pontos = pontos;
        this.moderador = false;
    }

    public String getNome() {
        return nome;
    }
    public int getPontos() {
        return pontos;
    }
    public void tornaModerador() {
        this.moderador = true;
    }
    public boolean isModerador() {
        return moderador;
    }

    public void adicionaPonto(){
        this.pontos++;
    }

    public void removePonto(){
        this.pontos++;
    }
}
