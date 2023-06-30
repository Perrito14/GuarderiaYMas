package dominio;

public class Sistema {
	private String nombre;
	private Usuario[] usuarios;
	
	public Sistema(String nombre, int cantidadDeUsuarios) {
		this.nombre = nombre;
		this.usuarios = new Usuario[cantidadDeUsuarios];
	}
	
	public boolean loguearUsuario(String nombre, String contraseña) {
		boolean login = false;
			for(int i = 0; i < usuarios.length; i++) {
				if(usuarios[i] != null && usuarios[i].getNombre().equals(nombre) && usuarios[i].getContraseña().equals(contraseña) ) {
					login = true;
				}
			}
		
		return login;
	}
	
	public boolean registrar(Usuario usuario) {
		boolean registrado = false;
		int i = 0;
		
		while(i < this.usuarios.length && !registrado) {
			if (this.usuarios[i] == null) {
				this.usuarios[i] = usuario;
				registrado = true;
			}
			i++;
		}
		return registrado;
	}
	
}
