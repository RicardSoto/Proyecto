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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlTransient;


/**
 *
 * @author LENOVO
 */
@Entity
@Table(name = "informevocal")

@NamedQueries({
    @NamedQuery(name = "Informevocal.findAll", query = "SELECT i FROM Informevocal i"),
    @NamedQuery(name = "Informevocal.findByIdInformeVocal", query = "SELECT i FROM Informevocal i WHERE i.idInformeVocal = :idInformeVocal"),
    @NamedQuery(name = "Informevocal.findByDescripcion", query = "SELECT i FROM Informevocal i WHERE i.descripcion = :descripcion"),
    @NamedQuery(name = "Informevocal.findByHora", query = "SELECT i FROM Informevocal i WHERE i.hora = :hora"),
    @NamedQuery(name = "Informevocal.findByNombreVocal", query = "SELECT i FROM Informevocal i WHERE i.nombreVocal = :nombreVocal"),
    @NamedQuery(name = "Informevocal.findByIdcalificacionArbitro", query = "SELECT i FROM Informevocal i WHERE i.idcalificacionArbitro = :idcalificacionArbitro"),
    @NamedQuery(name = "Informevocal.findByIdPartidos", query = "SELECT i FROM Informevocal i WHERE i.idPartidos = :idPartidos")})
public class Informevocal implements Serializable {

    

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idInformeVocal")
    private Integer idInformeVocal;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Descripcion")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Hora")
    private int hora;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "NombreVocal")
    private String nombreVocal;
    @Basic(optional = false)
   
    @Column(name = "IdcalificacionArbitro")
    private int idcalificacionArbitro;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idPartidos")
    private int idPartidos;

    public Informevocal() {
    }

    public Informevocal(Integer idInformeVocal) {
        this.idInformeVocal = idInformeVocal;
    }

    public Informevocal(Integer idInformeVocal, String descripcion, int hora, String nombreVocal, int idcalificacionArbitro, int idPartidos) {
        this.idInformeVocal = idInformeVocal;
        this.descripcion = descripcion;
        this.hora = hora;
        this.nombreVocal = nombreVocal;
        this.idcalificacionArbitro = idcalificacionArbitro;
        this.idPartidos = idPartidos;
    }

    public Integer getIdInformeVocal() {
        return idInformeVocal;
    }

    public void setIdInformeVocal(Integer idInformeVocal) {
        this.idInformeVocal = idInformeVocal;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public String getNombreVocal() {
        return nombreVocal;
    }

    public void setNombreVocal(String nombreVocal) {
        this.nombreVocal = nombreVocal;
    }

    public int getIdcalificacionArbitro() {
        return idcalificacionArbitro;
    }

    public void setIdcalificacionArbitro(int idcalificacionArbitro) {
        this.idcalificacionArbitro = idcalificacionArbitro;
    }

    public int getIdPartidos() {
        return idPartidos;
    }

    public void setIdPartidos(int idPartidos) {
        this.idPartidos = idPartidos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idInformeVocal != null ? idInformeVocal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Informevocal)) {
            return false;
        }
        Informevocal other = (Informevocal) object;
        if ((this.idInformeVocal == null && other.idInformeVocal != null) || (this.idInformeVocal != null && !this.idInformeVocal.equals(other.idInformeVocal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.guambragol.modelo.Informevocal[ idInformeVocal=" + idInformeVocal + " ]";
    }



  
}
