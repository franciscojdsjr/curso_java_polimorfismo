public class testeFuncionario {

    public static void main(String[] args) {

        funcionario nico = new funcionario();
        nico.setNome("francisco junior");
        nico.setCpf("01327740460");
        nico.setSalario(1696);

        System.out.println(nico.getNome());
        System.out.println(nico.getCpf());

    }
}
