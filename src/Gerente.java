public class Gerente extends Funcionario implements Autenticavel {

	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do GERENTE");
		return super.getSalario();
	}

	private Autenticar autenticarAcesso;

	public Gerente() {

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
