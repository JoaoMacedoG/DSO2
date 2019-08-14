package modelo;

public class Usuario {
	private String idUsuario;
	private String senha;
	
	public Usuario(String idUsuario, String senha) {
		this.idUsuario = idUsuario;
		this.senha = senha;
	}
	
	
	public String getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}


	

}
