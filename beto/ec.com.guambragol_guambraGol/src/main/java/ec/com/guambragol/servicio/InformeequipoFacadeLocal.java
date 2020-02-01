/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.guambragol.servicio;

import ec.com.guambragol.modelo.Informeequipo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author LENOVO
 */
@Local
public interface InformeequipoFacadeLocal {

    void create(Informeequipo informeequipo);

    void edit(Informeequipo informeequipo);

    void remove(Informeequipo informeequipo);

    Informeequipo find(Object id);

    List<Informeequipo> findAll();

    List<Informeequipo> findRange(int[] range);

    int count();
    
}
