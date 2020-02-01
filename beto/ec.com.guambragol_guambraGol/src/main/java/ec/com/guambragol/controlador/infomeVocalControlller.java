/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.guambragol.controlador;

import ec.com.guambragol.modelo.Calificacionarbitro;
import ec.com.guambragol.modelo.Informevocal;
import ec.com.guambragol.servicio.CalificacionarbitroFacadeLocal;
import ec.com.guambragol.servicio.InformevocalFacadeLocal;
import ec.com.guambragol.servicio.PartidosFacadeLocal;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import ec.com.guambragol.modelo.Partidos;
/**
 *
 * @author LENOVO
 */
@Named("infomeVocalControlller")
@ViewScoped
public class infomeVocalControlller implements Serializable{
    @EJB
    private InformevocalFacadeLocal informeEJB;
    
    @EJB
    private CalificacionarbitroFacadeLocal calificacionalbitroEJB;
  
        @EJB
    private PartidosFacadeLocal partidoEJB;
    
    /*Valores*/
    List<Partidos> partidos;
    Informevocal informe;
    List<Informevocal> informes;
    List<Calificacionarbitro> calificacionarbitros;
    boolean editable=false;
    int idCaficacionArbitro;
    int idPartido;

    public int getIdCaficacionArbitro() {
        return idCaficacionArbitro;
    }

    public void setIdCaficacionArbitro(int idCaficacionArbitro) {
        this.idCaficacionArbitro = idCaficacionArbitro;
    }

    public int getIdPartido() {
        return idPartido;
    }

    public void setIdPartido(int idPartido) {
        this.idPartido = idPartido;
    }
    
    public Informevocal getInforme() {
        return informe;
    }

    public void setInforme(Informevocal informe) {
        this.informe = informe;
    }

    public List<Informevocal> getInformes() {
        return informes;
    }

    public void setInformes(List<Informevocal> informes) {
        this.informes = informes;
    }

    public boolean isEditable() {
        return editable;
    }

    public void setEditable(boolean editable) {
        this.editable = editable;
    }

    public List<Calificacionarbitro> getCalificacionarbitros() {
        return calificacionarbitros;
    }

    public void setCalificacionarbitros(List<Calificacionarbitro> calificacionarbitros) {
        this.calificacionarbitros = calificacionarbitros;
    }

    public List<Partidos> getPartidos() {
        return partidos;
    }

    public void setPartidos(List<Partidos> partidos) {
        this.partidos = partidos;
    }
    
    @PostConstruct
    public void init(){
        informe = new Informevocal();
        informes=informeEJB.findAll();
        calificacionarbitros=calificacionalbitroEJB.findAll();
        partidos =partidoEJB.findAll();
       
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
