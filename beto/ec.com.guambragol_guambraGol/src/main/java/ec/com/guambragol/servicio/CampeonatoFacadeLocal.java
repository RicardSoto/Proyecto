/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.guambragol.servicio;

import ec.com.guambragol.modelo.Campeonato;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author LENOVO
 */
@Local
public interface CampeonatoFacadeLocal {

    void create(Campeonato campeonato);

    void edit(Campeonato campeonato);

    void remove(Campeonato campeonato);

    Campeonato find(Object id);

    List<Campeonato> findAll();

    List<Campeonato> findRange(int[] range);

    int count();
    
}
