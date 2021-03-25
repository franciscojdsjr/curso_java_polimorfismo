public class TesteReferencias {

    public static void main(String[] args) {

        gerente g1 = new gerente();
        g1.setNome("Francisco");
        g1.setSalario(5000);

        funcionario f = new funcionario();
        f.setSalario(2000);

        EditorVideo ev = new EditorVideo();
        ev.setSalario(2500);

        ControleBonificacao controle = new ControleBonificacao();

        controle.registra(g1);
        controle.registra(f);
        controle.registra(ev);

        System.out.println(controle.getSoma());

    }

}
