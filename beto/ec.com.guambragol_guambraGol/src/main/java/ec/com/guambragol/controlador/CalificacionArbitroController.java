/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.guambragol.controlador;

import ec.com.guambragol.modelo.Calificacionarbitro;
import ec.com.guambragol.servicio.CalificacionarbitroFacadeLocal;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author LENOVO
 */
@Named("CalificacionArbitroController")
@ViewScoped
public class CalificacionArbitroController implements Serializable {
    @EJB
    private CalificacionarbitroFacadeLocal calificacionArbitroEJB;
    private Calificacionarbitro calificacion;
    List<Calificacionarbitro> calificaciones;
    boolean editable=false;

    public Calificacionarbitro getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Calificacionarbitro calificacion) {
        this.calificacion = calificacion;
    }

    public List<Calificacionarbitro> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(List<Calificacionarbitro> calificaciones) {
        this.calificaciones = calificaciones;
    }

    public boolean isEditable() {
        return editable;
    }

    public void setEditable(boolean editable) {
        this.editable = editable;
    }
    
    @PostConstruct
    public void init(){
        calificacion= new Calificacionarbitro();
        calificaciones=calificacionArbitroEJB.findAll();
         this.editable=false;
    }
    public void edit(){
    calificacionArbitroEJB.edit(calificacion);
    init();
    }
    
    
    public void eliminar(){
    calificacionArbitroEJB.remove(calificacion);
    init();
    }
    
    public void crear(){
    calificacionArbitroEJB.create(calificacion);
    init();
    }
    public void editable(){
            this.editable=true;
       
    }
    public void cancel(){
          
             init();
    }
    
}
