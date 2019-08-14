/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import entities.Curriculo;
import entities.Usuario;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.inject.Inject;
import model.CurriculoFacade;
import model.UsuarioFacade;

/**
 *
 * @author joao.v.macedo.giombelli
 */
@Named(value = "usuLogado")
@SessionScoped
public class UsuLogado implements Serializable {

    private Usuario usuarioLogado;
    private Usuario cadastro = new Usuario();
    @EJB
    private UsuarioFacade usuarioFacade;
    @EJB
    private CurriculoFacade curriculoFacade;
    @Inject
    private LoginControler loginControler;
    private Integer idCurriculo;
    private Curriculo c = new Curriculo();

    public Curriculo getC() {
        return c;
    }

    public void setC(Curriculo c) {
        this.c = c;
    }

    public Integer getIdCurriculo() {
        return idCurriculo;
    }

    public void setIdCurriculo(Integer idCurriculo) {
        this.idCurriculo = idCurriculo;
    }

    public Usuario getUsuarioLogado() {
        return usuarioLogado;
    }

    public Usuario getCadastro() {
        return cadastro;
    }

    public void setCadastro(Usuario cadastro) {
        this.cadastro = cadastro;
    }

    public void setUsuarioLogado(Usuario usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }

    public UsuLogado() {
    }

    public String addCad() {
        this.usuarioFacade.create(this.cadastro);
        this.cadastro = new Usuario();
        this.loginControler.showMessageCadFunc();
        return "login";
    }

    
    
    
   public String editC(Integer codCurriculo) {
       this.curriculoFacade.editCurriculo(c.getNome(),c.getEmpresa(),c.getArea(), c.getExperiencia(),c.getFormacao(),codCurriculo);
        return "postLogin";
   
   }

    public String editCurriculo(Curriculo c) {
        this.c = c;
        return "editCurriculo";
    }
}
