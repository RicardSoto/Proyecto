/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.guambragol.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author LENOVO
 */
@Entity
@Table(name = "informearbitro")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Informearbitro.findAll", query = "SELECT i FROM Informearbitro i"),
    @NamedQuery(name = "Informearbitro.findByIdInformeArbitro", query = "SELECT i FROM Informearbitro i WHERE i.idInformeArbitro = :idInformeArbitro"),
    @NamedQuery(name = "Informearbitro.findByDescripcion", query = "SELECT i FROM Informearbitro i WHERE i.descripcion = :descripcion"),
    @NamedQuery(name = "Informearbitro.findByIdArbitro", query = "SELECT i FROM Informearbitro i WHERE i.idArbitro = :idArbitro"),
    @NamedQuery(name = "Informearbitro.findByIdInformeVocal", query = "SELECT i FROM Informearbitro i WHERE i.idInformeVocal = :idInformeVocal")})
public class Informearbitro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idInformeArbitro")
    private Integer idInformeArbitro;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "Descripcion")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idArbitro")
    private int idArbitro;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idInformeVocal")
    private int idInformeVocal;

    public Informearbitro() {
    }

    public Informearbitro(Integer idInformeArbitro) {
        this.idInformeArbitro = idInformeArbitro;
    }

    public Informearbitro(Integer idInformeArbitro, String descripcion, int idArbitro, int idInformeVocal) {
        this.idInformeArbitro = idInformeArbitro;
        this.descripcion = descripcion;
        this.idArbitro = idArbitro;
        this.idInformeVocal = idInformeVocal;
    }

    public Integer getIdInformeArbitro() {
        return idInformeArbitro;
    }

    public void setIdInformeArbitro(Integer idInformeArbitro) {
        this.idInformeArbitro = idInformeArbitro;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdArbitro() {
        return idArbitro;
    }

    public void setIdArbitro(int idArbitro) {
        this.idArbitro = idArbitro;
    }

    public int getIdInformeVocal() {
        return idInformeVocal;
    }

    public void setIdInformeVocal(int idInformeVocal) {
        this.idInformeVocal = idInformeVocal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idInformeArbitro != null ? idInformeArbitro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Informearbitro)) {
            return false;
        }
        Informearbitro other = (Informearbitro) object;
        if ((this.idInformeArbitro == null && other.idInformeArbitro != null) || (this.idInformeArbitro != null && !this.idInformeArbitro.equals(other.idInformeArbitro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.guambragol.modelo.Informearbitro[ idInformeArbitro=" + idInformeArbitro + " ]";
    }
    
}
