/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.guambragol.controlador;

import ec.com.guambragol.modelo.Sanciones;
import ec.com.guambragol.servicio.SancionesFacadeLocal;
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
@Named("SancionController")
@ViewScoped
public class SancionController implements Serializable  {
      @EJB
      private SancionesFacadeLocal  sancionesEJB;
      private Sanciones sancion;
      boolean editable= false;
      private Sanciones  sancionnew;

    public Sanciones getSancionnew() {
        return sancionnew;
    }

    public void setSancionnew(Sanciones sancionnew) {
        this.sancionnew = sancionnew;
    }
      List<Sanciones> sanciones;

    public Sanciones getSancion() {
        return sancion;
    }

    public void setSancion(Sanciones sancion) {
        this.sancion = sancion;
    }

    public boolean isEditable() {
        return editable;
    }

    public void setEditable(boolean editable) {
        this.editable = editable;
    }

    public List<Sanciones> getSanciones() {
        return sanciones;
    }

    public void setSanciones(List<Sanciones> sanciones) {
        this.sanciones = sanciones;
    }
      
       @PostConstruct
       public void init(){
           try{
               sancionnew=new Sanciones();
                sancion= new Sanciones();
           sanciones=sancionesEJB.findAll();
           }catch(Exception e){
           }
          
       }
        public void eliminar(){
        sancionesEJB.remove(sancion);
        cancel();
    
    }
    public void edit(){
        sancionesEJB.edit(sancion);
        cancel();
    
    }
    
    public void crear(){
        this.sancionesEJB.create(sancion);
        cancel();
      
    }
     public void editable(){
         this.editable=true;
    }
      public void cancel(){
         this.editable=false;
         
    }
}
