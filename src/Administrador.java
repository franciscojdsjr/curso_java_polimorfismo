public class Administrador extends Funcionario implements Autenticavel {

    @Override
    public double getBonificacao() {

        return 50;
    }

    public Administrador() {

        this.autenticarAcesso = new Autenticar();

    }

    private Autenticar autenticarAcesso;

    @Override
    public void setSenha(int senha) {

        this.autenticarAcesso.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {

        return this.autenticarAcesso.autentica(senha);

    }
}
