package ec.edu.ec.pw.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ec.pw.modelo.Departamentos;

@Stateless
public class DepartamentosDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	
public void insert(Departamentos op) {
		
		em.persist(op);
			
	}
	
	public void update(Departamentos op) {

		em.merge(op);

	}

}
