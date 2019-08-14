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
public class VagasFacade extends AbstractFacade<Vagas> {

    @PersistenceContext(unitName = "TRAB-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VagasFacade() {
        super(Vagas.class);
    }

    public List<Vagas> findWithName(String area) {
        Query query = em.createNamedQuery("Vagas.findByArea").setParameter("area", area);

        return query.getResultList();
    }

    public List<Vagas> findById(Usuario u) {
        Query query = em.createNamedQuery("Vagas.findByID").setParameter("idUsuario", u);
        return query.getResultList();
    }

    public void candidatarVaga(Integer codVaga, Integer codCurriculo) {
        Query query = em.createNativeQuery("UPDATE  Vagas set COD_CURRICULO = ? WHERE COD_VAGAS = ?");
        query.setParameter(1, codCurriculo);
        query.setParameter(2, codVaga);

        query.executeUpdate();
    }

}
