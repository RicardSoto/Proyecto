/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.guambragol.servicio;

import ec.com.guambragol.modelo.Calificacionarbitro;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author LENOVO
 */
@Local
public interface CalificacionarbitroFacadeLocal {

    void create(Calificacionarbitro calificacionarbitro);

    void edit(Calificacionarbitro calificacionarbitro);

    void remove(Calificacionarbitro calificacionarbitro);

    Calificacionarbitro find(Object id);

    List<Calificacionarbitro> findAll();

    List<Calificacionarbitro> findRange(int[] range);

    int count();
    
}
