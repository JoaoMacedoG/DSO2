/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Win10
 */
@Entity
@Table(name = "CURRICULO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Curriculo.findAll", query = "SELECT c FROM Curriculo c")
    , @NamedQuery(name = "Curriculo.findByCodCurriculo", query = "SELECT c FROM Curriculo c WHERE c.codCurriculo = :codCurriculo")
    , @NamedQuery(name = "Curriculo.findByNome", query = "SELECT c FROM Curriculo c WHERE c.nome = :nome")
    , @NamedQuery(name = "Curriculo.findByEmpresa", query = "SELECT c FROM Curriculo c WHERE c.empresa = :empresa")
    , @NamedQuery(name = "Curriculo.findByArea", query = "SELECT c FROM Curriculo c WHERE c.area = :area")
    ,@NamedQuery(name = "Curriculo.findByID", query = "SELECT c FROM Curriculo c WHERE c.idusuarioc = :idusuarioc")
            , @NamedQuery(name = "Curriculo.fincCurriculos", query = "SELECT c FROM Curriculo c WHERE c.codCurriculo = :codC")
        ,@NamedQuery(name = "Curriculo.findCodCurriculo", query = "SELECT c.codCurriculo FROM Curriculo c WHERE c.idusuarioc = :idusuarioc")
    , @NamedQuery(name = "Curriculo.findByExperiencia", query = "SELECT c FROM Curriculo c WHERE c.experiencia = :experiencia")
    , @NamedQuery(name = "Curriculo.findByFormacao", query = "SELECT c FROM Curriculo c WHERE c.formacao = :formacao")})
public class Curriculo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "COD_CURRICULO")
    private Integer codCurriculo;
    @Size(max = 50)
    @Column(name = "NOME")
    private String nome;
    @Size(max = 50)
    @Column(name = "EMPRESA")
    private String empresa;
    @Size(max = 40)
    @Column(name = "AREA")
    private String area;
    @Size(max = 70)
    @Column(name = "EXPERIENCIA")
    private String experiencia;
    @Size(max = 90)
    @Column(name = "FORMACAO")
    private String formacao;
    @JoinColumn(name = "IDUSUARIOC", referencedColumnName = "ID_USUARIO")
    @ManyToOne
    private Usuario idusuarioc;
    @OneToMany(mappedBy = "codCurriculo")
    private List<Vagas> vagasList;

    public Curriculo() {
    }

    public Curriculo(Integer codCurriculo) {
        this.codCurriculo = codCurriculo;
    }

    public Integer getCodCurriculo() {
        return codCurriculo;
    }

    public void setCodCurriculo(Integer codCurriculo) {
        this.codCurriculo = codCurriculo;
    }

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

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public Usuario getIdusuarioc() {
        return idusuarioc;
    }

    public void setIdusuarioc(Usuario idusuarioc) {
        this.idusuarioc = idusuarioc;
    }

    @XmlTransient
    public List<Vagas> getVagasList() {
        return vagasList;
    }

    public void setVagasList(List<Vagas> vagasList) {
        this.vagasList = vagasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codCurriculo != null ? codCurriculo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Curriculo)) {
            return false;
        }
        Curriculo other = (Curriculo) object;
        if ((this.codCurriculo == null && other.codCurriculo != null) || (this.codCurriculo != null && !this.codCurriculo.equals(other.codCurriculo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Curriculo[ codCurriculo=" + codCurriculo + " ]";
    }
    
}
