package br.com.barganha.controller;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.barganha.dao.UsuarioDao;
import br.com.barganha.modelo.Usuario;

@Named
@SessionScoped
public class UsuarioController implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	UsuarioDao dao;
	
	Usuario usuario = new Usuario();

	//Gets e Sets 
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	//Métodos Controller
	
	public void adicionaUsuario(Usuario usuario){
		dao.adiciona(usuario);
		System.out.println("Usuario adicionado" + usuario.getNome());
	}
	

}
