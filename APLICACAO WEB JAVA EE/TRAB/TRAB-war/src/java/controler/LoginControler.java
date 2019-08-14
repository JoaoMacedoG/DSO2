/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import entities.Curriculo;
import entities.Usuario;
import entities.Vagas;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import model.UsuarioFacade;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import model.CurriculoFacade;
import model.VagasFacade;
import org.primefaces.context.RequestContext;

/**
 *
 * @author João
 */
@Named(value = "loginControler")
@RequestScoped
public class LoginControler implements Serializable {

    @EJB
    private CurriculoFacade curriculoFacade;
    @EJB
    private UsuarioFacade usuarioFacade;
    @EJB
    private VagasFacade vagasFacade;
    private String login;
    private String senha;
    @Inject
    private UsuLogado logado;
    @Inject
    private CurriculoControler controleCurriculo;
    private Vagas v = new Vagas();
    private Integer idCurriculo;

    public Integer getIdCurriculo() {
        return idCurriculo;
    }

    public void setIdCurriculo(Integer idCurriculo) {
        this.idCurriculo = idCurriculo;
    }

    public LoginControler() {
    }

    public Vagas getV() {
        return v;
    }

    public void setV(Vagas v) {
        this.v = v;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String autenticar() {
        if (usuarioFacade.autenticar(login, senha)) {
            v.setIdUsuario(usuarioFacade.getUsuarioAutenticado(login, senha));
            logado.setUsuarioLogado(usuarioFacade.getUsuarioAutenticado(login, senha));
            showMessageLoginFunc();
            return "postLogin";
        } else {
            showMessageLoginNaoFunc();
        }
        return "login";
    }

    public String inscreverSe(Integer codVaga) {
        vagasFacade.candidatarVaga(codVaga, curriculoFacade.findCodCurriculo(logado.getUsuarioLogado()));
        showMessageCandidatou();
        return "postLogin";
    }

    public String logout() {
        logado.setUsuarioLogado(null);
        return "index";
    }

    public List<Vagas> findVagaArea() {
        return this.vagasFacade.findWithName(logado.getUsuarioLogado().getArea());
    }

    public List<Usuario> findAll() {
        return this.usuarioFacade.findAll();
    }

    public List<Vagas> findVagasCadastradas() {
        return this.vagasFacade.findById(logado.getUsuarioLogado());

    }

    public List<Curriculo> findById() {
        return this.curriculoFacade.findById(logado.getUsuarioLogado());
    }

    public List<Curriculo> findCurriculosVaga() {
        return this.curriculoFacade.findCurriculoVaga(logado.getIdCurriculo());

    }

    public String goToAddCadastro() {
        return "addCadastro";
    }

    public void showMessageCadFunc() {
        RequestContext.getCurrentInstance().showMessageInDialog(new FacesMessage(FacesMessage.SEVERITY_INFO, "Avisao", "Usuario Cadastrado!"));
    }

    public void showMessageLoginFunc() {
        RequestContext.getCurrentInstance().showMessageInDialog(new FacesMessage(FacesMessage.SEVERITY_INFO, "Avisao", "Usuario Logado!"));
    }

    public void showMessageLoginNaoFunc() {
        RequestContext.getCurrentInstance().showMessageInDialog(new FacesMessage(FacesMessage.SEVERITY_INFO, "Avisao", "Falha no login!"));
    }

    public void showMessageCurriculoFunc() {
        RequestContext.getCurrentInstance().showMessageInDialog(new FacesMessage(FacesMessage.SEVERITY_INFO, "Avisao", "Curriculo Criado!"));
    }

    public void showMessageCandidatou() {
        RequestContext.getCurrentInstance().showMessageInDialog(new FacesMessage(FacesMessage.SEVERITY_INFO, "Avisao", "Inscricao feita!"));
    }

}
