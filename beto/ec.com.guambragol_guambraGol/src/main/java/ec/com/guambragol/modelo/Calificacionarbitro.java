/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.guambragol.modelo;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author LENOVO
 */
@Entity
@Table(name = "calificacionarbitro")

@NamedQueries({
    @NamedQuery(name = "Calificacionarbitro.findAll", query = "SELECT c FROM Calificacionarbitro c"),
    @NamedQuery(name = "Calificacionarbitro.findByIdCalificacionArbitro", query = "SELECT c FROM Calificacionarbitro c WHERE c.idCalificacionArbitro = :idCalificacionArbitro"),
    @NamedQuery(name = "Calificacionarbitro.findByPersonalidad", query = "SELECT c FROM Calificacionarbitro c WHERE c.personalidad = :personalidad"),
    @NamedQuery(name = "Calificacionarbitro.findByEstadoFisico", query = "SELECT c FROM Calificacionarbitro c WHERE c.estadoFisico = :estadoFisico"),
    @NamedQuery(name = "Calificacionarbitro.findByConocimiento", query = "SELECT c FROM Calificacionarbitro c WHERE c.conocimiento = :conocimiento"),
    @NamedQuery(name = "Calificacionarbitro.findByImparcialidad", query = "SELECT c FROM Calificacionarbitro c WHERE c.imparcialidad = :imparcialidad"),
    @NamedQuery(name = "Calificacionarbitro.findByIdentificacion", query = "SELECT c FROM Calificacionarbitro c WHERE c.identificacion = :identificacion"),
    @NamedQuery(name = "Calificacionarbitro.findByTotal", query = "SELECT c FROM Calificacionarbitro c WHERE c.total = :total")})
public class Calificacionarbitro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idCalificacionArbitro")
    private Integer idCalificacionArbitro;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Personalidad")
    private short personalidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EstadoFisico")
    private short estadoFisico;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Conocimiento")
    private short conocimiento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Imparcialidad")
    private short imparcialidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Identificacion")
    private short identificacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Total")
    private int total;

    public Calificacionarbitro() {
    }

    public Calificacionarbitro(Integer idCalificacionArbitro) {
        this.idCalificacionArbitro = idCalificacionArbitro;
    }

    public Calificacionarbitro(Integer idCalificacionArbitro, short personalidad, short estadoFisico, short conocimiento, short imparcialidad, short identificacion, int total) {
        this.idCalificacionArbitro = idCalificacionArbitro;
        this.personalidad = personalidad;
        this.estadoFisico = estadoFisico;
        this.conocimiento = conocimiento;
        this.imparcialidad = imparcialidad;
        this.identificacion = identificacion;
        this.total = total;
    }

    public Integer getIdCalificacionArbitro() {
        return idCalificacionArbitro;
    }

    public void setIdCalificacionArbitro(Integer idCalificacionArbitro) {
        this.idCalificacionArbitro = idCalificacionArbitro;
    }

    public short getPersonalidad() {
        return personalidad;
    }

    public void setPersonalidad(short personalidad) {
        this.personalidad = personalidad;
    }

    public short getEstadoFisico() {
        return estadoFisico;
    }

    public void setEstadoFisico(short estadoFisico) {
        this.estadoFisico = estadoFisico;
    }

    public short getConocimiento() {
        return conocimiento;
    }

    public void setConocimiento(short conocimiento) {
        this.conocimiento = conocimiento;
    }

    public short getImparcialidad() {
        return imparcialidad;
    }

    public void setImparcialidad(short imparcialidad) {
        this.imparcialidad = imparcialidad;
    }

    public short getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(short identificacion) {
        this.identificacion = identificacion;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCalificacionArbitro != null ? idCalificacionArbitro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Calificacionarbitro)) {
            return false;
        }
        Calificacionarbitro other = (Calificacionarbitro) object;
        if ((this.idCalificacionArbitro == null && other.idCalificacionArbitro != null) || (this.idCalificacionArbitro != null && !this.idCalificacionArbitro.equals(other.idCalificacionArbitro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.guambragol.modelo.Calificacionarbitro[ idCalificacionArbitro=" + idCalificacionArbitro + " ]";
    }

   
    
}
