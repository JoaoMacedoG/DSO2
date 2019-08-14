/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
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
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Win10
 */
@Entity
@Table(name = "VAGAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vagas.findAll", query = "SELECT v FROM Vagas v")
    , @NamedQuery(name = "Vagas.findByCodVagas", query = "SELECT v FROM Vagas v WHERE v.codVagas = :codVagas")
    , @NamedQuery(name = "Vagas.findByEmpresa", query = "SELECT v FROM Vagas v WHERE v.empresa = :empresa")
    , @NamedQuery(name = "Vagas.findByRequisitos", query = "SELECT v FROM Vagas v WHERE v.requisitos = :requisitos")
    , @NamedQuery(name = "Vagas.findBySalario", query = "SELECT v FROM Vagas v WHERE v.salario = :salario")
    , @NamedQuery(name = "Vagas.findByLocalTrab", query = "SELECT v FROM Vagas v WHERE v.localTrab = :localTrab")
    , @NamedQuery(name = "Vagas.findByHorario", query = "SELECT v FROM Vagas v WHERE v.horario = :horario")
    , @NamedQuery(name = "Vagas.findByID", query = "SELECT v FROM Vagas v WHERE v.idUsuario = :idUsuario")
    , @NamedQuery(name = "Vagas.findByArea", query = "SELECT v FROM Vagas v WHERE v.area = :area")})
public class Vagas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "COD_VAGAS")
    private Integer codVagas;
    @Size(max = 50)
    @Column(name = "EMPRESA")
    private String empresa;
    @Size(max = 350)
    @Column(name = "REQUISITOS")
    private String requisitos;
    @Column(name = "SALARIO")
    private Integer salario;
    @Size(max = 50)
    @Column(name = "LOCAL_TRAB")
    private String localTrab;
    @Size(max = 50)
    @Column(name = "HORARIO")
    private String horario;
    @Size(max = 50)
    @Column(name = "AREA")
    private String area;
    @JoinColumn(name = "COD_CURRICULO", referencedColumnName = "COD_CURRICULO")
    @ManyToOne
    private Curriculo codCurriculo;
    @JoinColumn(name = "ID_USUARIO", referencedColumnName = "ID_USUARIO")
    @ManyToOne
    private Usuario idUsuario;

    public Vagas() {
    }

    public Vagas(Integer codVagas) {
        this.codVagas = codVagas;
    }

    public Integer getCodVagas() {
        return codVagas;
    }

    public void setCodVagas(Integer codVagas) {
        this.codVagas = codVagas;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    public String getLocalTrab() {
        return localTrab;
    }

    public void setLocalTrab(String localTrab) {
        this.localTrab = localTrab;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Curriculo getCodCurriculo() {
        return codCurriculo;
    }

    public void setCodCurriculo(Curriculo codCurriculo) {
        this.codCurriculo = codCurriculo;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codVagas != null ? codVagas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vagas)) {
            return false;
        }
        Vagas other = (Vagas) object;
        if ((this.codVagas == null && other.codVagas != null) || (this.codVagas != null && !this.codVagas.equals(other.codVagas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Vagas[ codVagas=" + codVagas + " ]";
    }
    
}
