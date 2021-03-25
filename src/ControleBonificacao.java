public class ControleBonificacao {

    private double soma;

    public void registra(funcionario f) {

        double bonificacao = f.getBonificacao();
        this.soma = this.soma + bonificacao;
    }

    public double getSoma() {
        return soma;
    }

}
