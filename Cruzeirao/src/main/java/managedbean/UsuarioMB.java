package managedbean;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import modelo.Usuario;

/*teste*/

@ManagedBean
@SessionScoped
public class UsuarioMB {

	private ArrayList<Usuario> lista = new ArrayList<>();
	
	private Usuario usuario = new Usuario();
	
	public void salvar() {
		lista.add(usuario);
		usuario = new Usuario();
	}
	
	public ArrayList<Usuario> getLista(){
		return lista;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public void setLista(ArrayList<Usuario> lista) {
		this.lista = lista;
	}
	
	
	
}
