package conceito;



public class Exemplo {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.nome = ("Marco carvalho");

        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setNome("Marco carvalho");
        pessoaFisica.setCpf("12312345697");


        System.out.println("Olá mundo");
        System.out.println(pessoa.getNome());

        ExemploFor.execute();
    }
}
