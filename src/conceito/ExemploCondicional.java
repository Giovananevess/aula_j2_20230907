package conceito;

public class ExemploCondicional {
    public static void execute() {
        boolean flag = true;
        if(flag) {
            System.out.println("Executa IF");
        }
        else {
            System.out.println("Executa ELSE");
        }

        String periodo = "Manhã";
        switch (periodo) {
            case "Manhã" :
                System.out.println("Bom dia");
                break;
            case "Tarde" :
                System.out.println("Boa tarde");
                break;
            default:
                System.out.println("Valor invalido");
        }
    }

}