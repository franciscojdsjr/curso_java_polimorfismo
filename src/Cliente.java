public class Cliente implements Autenticavel {

    private Autenticar autenticarAcesso;

    public Cliente() {

        this.autenticarAcesso = new Autenticar();

    }

    @Override
    public void setSenha(int senha) {

        this.autenticarAcesso.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {

        return this.autenticarAcesso.autentica(senha);

    }

}
