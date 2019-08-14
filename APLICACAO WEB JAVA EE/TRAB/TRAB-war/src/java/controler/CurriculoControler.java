/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import entities.Curriculo;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.inject.Inject;
import model.CurriculoFacade;
import model.UsuarioFacade;
import org.primefaces.context.RequestContext;

/**
 *
 * @author João
 */
@Named(value = "curriculoControler")
@RequestScoped
public class CurriculoControler implements Serializable {

    @EJB
    private CurriculoFacade curriculoFacade;
    private Curriculo c = new Curriculo();
    @EJB
    private UsuarioFacade usuarioFacade;
    @Inject
    private UsuLogado logado;
    private String nome;
    private String empresa;
    private String area;
    private String exp;
    private String formacao;
    @Inject
    LoginControler loginControler;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
    
   

    public Curriculo getC() {
        return c;
    }

    public void setC(Curriculo c) {
        this.c = c;
    }

    public String addCurriculo() {
     
        c.setIdusuarioc(logado.getUsuarioLogado());
        this.curriculoFacade.create(this.c);
        this.c = new Curriculo();
        this.loginControler.showMessageCurriculoFunc();
        return "postLogin";
    }

    public void delete(Curriculo c) {
        this.curriculoFacade.remove(c);
    }


    public CurriculoControler() {
    }
        public void showMessageCurriculoExistente() {
        RequestContext.getCurrentInstance().showMessageInDialog(new FacesMessage(FacesMessage.SEVERITY_INFO, "Avisao", "Usuario ja tem Curriculo!"));
    }
    

}
