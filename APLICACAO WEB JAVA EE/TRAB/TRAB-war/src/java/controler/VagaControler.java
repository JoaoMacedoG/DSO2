/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.*;
import javax.ejb.EJB;
import entities.*;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import model.CurriculoFacade;
import model.VagasFacade;

/**
 *
 * @author João
 */

@SessionScoped
@ManagedBean(name = "VagaControler")
public class VagaControler implements Serializable {

     @EJB
    private CurriculoFacade curriculoFacade;
    @EJB
    private VagasFacade vagasFacade;
    private Vagas v = new Vagas();
    private String area;
    private Integer idUsuario;
    @Inject 
   private UsuLogado logado;
    

    
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    

    public Vagas getV() {
        return v;
    }

    public void setV(Vagas v) {
        this.v = v;
    }
   
    public VagaControler() {
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    
    
     public List<Vagas> search() {
        return this.vagasFacade.findWithName(this.area);
     }
     
        public String addVaga() {   
         setIdUsuario(logado.getUsuarioLogado().getIdUsuario());
         v.setIdUsuario(logado.getUsuarioLogado());
        this.vagasFacade.create(this.v);
         this.v = new Vagas();
        return goToPostLogin();
    }
        
        public String goToPostLogin() {
    
    return "postLogin?faces-redirect=true";
}
    
        public List<Vagas> findAll() {
        return this.vagasFacade.findAll();
    }
       
      public void delete(Vagas v) {
        this.vagasFacade.remove(v);
    }
     
       public String goToCurriculoVaga(Vagas v) {
           logado.setIdCurriculo(v.getCodCurriculo().getCodCurriculo());
        return "curriculosVaga";
    }
        
   
    
}
