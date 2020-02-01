/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.guambragol.servicio;

import ec.com.guambragol.modelo.Calificacionarbitro;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author LENOVO
 */
@Stateless
public class CalificacionarbitroFacade extends AbstractFacade<Calificacionarbitro> implements CalificacionarbitroFacadeLocal {

    @PersistenceContext(unitName = "guambrmaGolPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CalificacionarbitroFacade() {
        super(Calificacionarbitro.class);
    }
    
}
