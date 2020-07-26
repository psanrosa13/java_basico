package String;

public class ImutabilidadeString {
  public static void main(String[] args) {
    String nome = "Paula Santana";

    nome.replace("Santana", "Macedo");

    System.out.println(nome);

    String novoNome = nome.replace("Santana", "Macedo");

    System.out.println(novoNome);
  }

}
