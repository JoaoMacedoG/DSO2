/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entities.Usuario;
import entities.Vagas;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Win10
 */
@Stateless
public class UsuarioFacade extends AbstractFacade<Usuario> {

    @PersistenceContext(unitName = "TRAB-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuarioFacade() {
        super(Usuario.class);
    }

    public boolean autenticar(String login, String senha) {
        Query query = em.createNamedQuery("Usuario.findAll");
        List<Usuario> usuList = query.getResultList();
        for (int i = 0; i < usuList.size(); i++) {
            if (usuList.get(i).getLogin().equals(login) && usuList.get(i).getSenha().equals(senha)) {
                return true;
            }
        }

        return false;
    }

    public Usuario getUsuarioAutenticado(String login, String senha) {
        Query query = em.createNamedQuery("Usuario.findAll");
        List<Usuario> usuList = query.getResultList();
        Usuario logado;
        for (int i = 0; i < usuList.size(); i++) {
            if (usuList.get(i).getLogin().equals(login) && usuList.get(i).getSenha().equals(senha)) {
                logado = usuList.get(i);
                return logado;
            }
        }
        return null;
    }

    public List<Vagas> findVagaArea(String area) {
        Query query = em.createNamedQuery("Usuario.findByArea").setParameter("area", area);

        return query.getResultList();
    }

    public Usuario findByIdUsuario(Integer id) {
        Query query = em.createNamedQuery("Usuario.findByIdUsuario").setParameter("id", id);

        return (Usuario) query.getSingleResult();
    }

}
