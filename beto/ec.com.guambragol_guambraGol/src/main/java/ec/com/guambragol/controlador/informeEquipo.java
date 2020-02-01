/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.guambragol.controlador;

import ec.com.guambragol.modelo.Informeequipo;
import ec.com.guambragol.modelo.Informevocal;
import ec.com.guambragol.servicio.InformeequipoFacadeLocal;
import ec.com.guambragol.servicio.InformevocalFacadeLocal;
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
@Named("informeEquipo")
@ViewScoped

public class informeEquipo implements Serializable {
    @EJB
    private InformeequipoFacadeLocal informeEJB;
    @EJB
    private InformevocalFacadeLocal informevocalEJB;
    
    private Informeequipo informe;
    List<Informeequipo> informes;
    List<Informevocal> informesvocal;
    boolean editable=false;
    public Informeequipo getInforme() {
        return informe;
    }

    public void setInforme(Informeequipo informe) {
        this.informe = informe;
    }

    public List<Informeequipo> getInformes() {
        return informes;
    }

    public void setInformes(List<Informeequipo> informes) {
        this.informes = informes;
    }

    public List<Informevocal> getInformesvocal() {
        return informesvocal;
    }

    public void setInformesvocal(List<Informevocal> informesvocal) {
        this.informesvocal = informesvocal;
    }

    public boolean isEditable() {
        return editable;
    }

    public void setEditable(boolean editable) {
        this.editable = editable;
    }
    
    

        @PostConstruct
       public void init(){
       informe= new Informeequipo();
       informes= informeEJB.findAll();
       informesvocal=informevocalEJB.findAll();
       }
   
         public void edit(){
            informeEJB.edit(informe);
              cancel();
            }
    public void crear(){
      
    informeEJB.create(informe);
       cancel();
    }
    
    
    public void eliminar(){
    informeEJB.remove(informe);
    cancel();
   
    }
    
    public void editable(){
    this.editable=true;
    }
    
    public void cancel(){
    this.editable=false;
    init();
    }
}
