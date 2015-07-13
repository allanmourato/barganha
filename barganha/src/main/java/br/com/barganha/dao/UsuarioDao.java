package br.com.barganha.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.barganha.modelo.Usuario;

@Stateless
public class UsuarioDao {
	
	@PersistenceContext
	EntityManager manager;
	
	public void adiciona(Usuario usuario){
		this.manager.persist(usuario);
	}

}
