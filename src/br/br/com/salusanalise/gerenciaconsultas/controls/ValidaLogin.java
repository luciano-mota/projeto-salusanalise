package br.com.salusanalise.gerenciaconsultas.controls;

public class ValidaLogin {

	protected String usuario;
	private String senha;

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean validaUsuario(String usuario) {
		this.usuario = senha;
		if (this.usuario == usuario) {
			System.out.println("correto");
		}
		return true;
	}

	public boolean validaSenha(String senha) {
		this.senha = senha;
		if (this.senha == senha) {
			System.out.println("correto");
		}
		return true;
	}
}
