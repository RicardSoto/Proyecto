/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.guambragol.servicio;

import ec.com.guambragol.modelo.Informearbitro;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author LENOVO
 */
@Local
public interface InformearbitroFacadeLocal {

    void create(Informearbitro informearbitro);

    void edit(Informearbitro informearbitro);

    void remove(Informearbitro informearbitro);

    Informearbitro find(Object id);

    List<Informearbitro> findAll();

    List<Informearbitro> findRange(int[] range);

    int count();
    
}
