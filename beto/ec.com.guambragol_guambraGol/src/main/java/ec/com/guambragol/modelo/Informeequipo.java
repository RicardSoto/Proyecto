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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author LENOVO
 */
@Entity
@Table(name = "informeequipo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Informeequipo.findAll", query = "SELECT i FROM Informeequipo i"),
    @NamedQuery(name = "Informeequipo.findByIdinformeEquipo", query = "SELECT i FROM Informeequipo i WHERE i.idinformeEquipo = :idinformeEquipo"),
    @NamedQuery(name = "Informeequipo.findByBalon", query = "SELECT i FROM Informeequipo i WHERE i.balon = :balon"),
    @NamedQuery(name = "Informeequipo.findByCinta", query = "SELECT i FROM Informeequipo i WHERE i.cinta = :cinta"),
    @NamedQuery(name = "Informeequipo.findByIdInformeVocal", query = "SELECT i FROM Informeequipo i WHERE i.idInformeVocal = :idInformeVocal")})
public class Informeequipo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idinformeEquipo")
    private Integer idinformeEquipo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Balon")
    private short balon;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Cinta")
    private short cinta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idInformeVocal")
    private int idInformeVocal;

    public Informeequipo() {
    }

    public Informeequipo(Integer idinformeEquipo) {
        this.idinformeEquipo = idinformeEquipo;
    }

    public Informeequipo(Integer idinformeEquipo, short balon, short cinta, int idInformeVocal) {
        this.idinformeEquipo = idinformeEquipo;
        this.balon = balon;
        this.cinta = cinta;
        this.idInformeVocal = idInformeVocal;
    }

    public Integer getIdinformeEquipo() {
        return idinformeEquipo;
    }

    public void setIdinformeEquipo(Integer idinformeEquipo) {
        this.idinformeEquipo = idinformeEquipo;
    }

    public short getBalon() {
        return balon;
    }

    public void setBalon(short balon) {
        this.balon = balon;
    }

    public short getCinta() {
        return cinta;
    }

    public void setCinta(short cinta) {
        this.cinta = cinta;
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
        hash += (idinformeEquipo != null ? idinformeEquipo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Informeequipo)) {
            return false;
        }
        Informeequipo other = (Informeequipo) object;
        if ((this.idinformeEquipo == null && other.idinformeEquipo != null) || (this.idinformeEquipo != null && !this.idinformeEquipo.equals(other.idinformeEquipo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.guambragol.modelo.Informeequipo[ idinformeEquipo=" + idinformeEquipo + " ]";
    }
    
}
