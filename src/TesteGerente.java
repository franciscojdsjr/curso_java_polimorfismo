public class TesteGerente {

    public static void main(String[] args) {

        gerente g1 = new gerente();

        g1.setNome("Francisco");
        g1.setCpf("01327740460");
        g1.setSalario(5500);
        g1.setSenha(2222);

        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());

        boolean autenticou = g1.autentica(2222);

        System.out.println(autenticou);
        System.out.println(g1.getBonificacao());

    }

}
