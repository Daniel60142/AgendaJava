/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author DANIEL
 */
@Stateless
public class TblmedicoFacade extends AbstractFacade<Tblmedico> {

    @PersistenceContext(unitName = "AgendaJavaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TblmedicoFacade() {
        super(Tblmedico.class);
    }
    
}
