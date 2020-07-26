package switchCase;

public class ProgramaSwitchCasePadrao {
    public static void main(String[] args) {

        var numero = 10;

        switch (numero){
            case 1:
                System.out.println("Número 1");
                break;
            case 2:
                System.out.println("Número 2");
                break;
            case 3:
                System.out.println("Número 3");
                break;
            default:
                System.out.println("Outro numero ");
        }

    }
}
