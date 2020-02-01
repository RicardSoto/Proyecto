/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.guambragol.servicio;

import ec.com.guambragol.modelo.Informevocal;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author LENOVO
 */
@Local
public interface InformevocalFacadeLocal {

    void create(Informevocal informevocal);

    void edit(Informevocal informevocal);

    void remove(Informevocal informevocal);

    Informevocal find(Object id);

    List<Informevocal> findAll();

    List<Informevocal> findRange(int[] range);

    int count();
    
}
