/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.guambragol.controlador;

import ec.com.guambragol.modelo.Arbitro;
import ec.com.guambragol.modelo.Informearbitro;
import ec.com.guambragol.modelo.Informevocal;
import ec.com.guambragol.servicio.ArbitroFacadeLocal;
import ec.com.guambragol.servicio.InformearbitroFacadeLocal;
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
@Named("informeArbitro")
@ViewScoped
public class informeArbitro implements Serializable{
    @EJB
    private InformearbitroFacadeLocal informeEJB;
    @EJB
    private InformevocalFacadeLocal informevocalEJB;
    @EJB
    private ArbitroFacadeLocal arbitroEJB;
    
    private Informearbitro informe; 
    List<Informearbitro> informes;
    List<Informevocal> informesvocal;
    List<Arbitro> arbitros;
    boolean editable=false;

    public Informearbitro getInforme() {
        return informe;
    }

    public void setInforme(Informearbitro informe) {
        this.informe = informe;
    }

    public List<Informearbitro> getInformes() {
        return informes;
    }

    public List<Arbitro> getArbitros() {
        return arbitros;
    }

    public void setArbitros(List<Arbitro> arbitros) {
        this.arbitros = arbitros;
    }

    public boolean isEditable() {
        return editable;
    }

    public void setEditable(boolean editable) {
        this.editable = editable;
    }

    public void setInformes(List<Informearbitro> informes) {
        this.informes = informes;
    }

    public List<Informevocal> getInformesvocal() {
        return informesvocal;
    }

    public void setInformesvocal(List<Informevocal> informesvocal) {
        this.informesvocal = informesvocal;
    }
    
     @PostConstruct
     public void init(){
         informe = new Informearbitro();
         informes= informeEJB.findAll();
         informesvocal=informevocalEJB.findAll();
         arbitros=  arbitroEJB.findAll();
     }
    public void edit(){
            informeEJB.edit(informe);
            init();
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
