/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entities.Curriculo;
import entities.Usuario;
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
public class CurriculoFacade extends AbstractFacade<Curriculo> {
    
    @PersistenceContext(unitName = "TRAB-ejbPU")
    private EntityManager em;
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
    public CurriculoFacade() {
        super(Curriculo.class);
    }
    
    public List<Curriculo> findById(Usuario u) {
        Query query = em.createNamedQuery("Curriculo.findByID").setParameter("idusuarioc", u);
        return query.getResultList();
    }
    
    public Integer findCodCurriculo(Usuario u) {
        Query query = em.createNamedQuery("Curriculo.findCodCurriculo").setParameter("idusuarioc", u);
        return (Integer) query.getSingleResult();
    }
    
    public Curriculo findCurriculoById(Integer u) {
        Query query = em.createNamedQuery("Curriculo.findByCodCurriculo").setParameter("codCurriculo", u);
        return (Curriculo) query.getSingleResult();
    }
    
    public List<Curriculo> findCurriculoVaga(Integer v) {
        Query query = em.createNamedQuery("Curriculo.fincCurriculos").setParameter("codC", v);
        return query.getResultList();
    }
    
    public void editCurriculo(String nome, String empresa, String area, String experiencia, String formacao, Integer codC) {
        Query query = em.createNativeQuery("UPDATE  Curriculo set NOME = ?,  EMPRESA = ?,"
                + " AREA = ?,  EXPERIENCIA = ?,  FORMACAO = ? WHERE COD_CURRICULO = ?");
        query.setParameter(1, nome);
        query.setParameter(2, empresa);
        query.setParameter(3, area);
        query.setParameter(4, experiencia);
        query.setParameter(5, formacao);
        query.setParameter(6, codC);
        
        query.executeUpdate();
        
    }
    
}
