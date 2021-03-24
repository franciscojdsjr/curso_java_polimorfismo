//Gerente herda da classe funcionario
public class gerente extends funcionario {

    private int senha;

    public boolean autentica(int senha) {

        if (this.senha == senha) {

            return true;
        } else {
            return false;
        }
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getSenha() {
        return senha;
    }

    public double getBonificacao() {

        return super.getSalario() + super.getBonificacao();
    }

}
