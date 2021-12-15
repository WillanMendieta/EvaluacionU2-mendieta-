package ec.edu.ec.pw.business;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ec.pw.dao.DepartamentosDAO;
import ec.edu.ec.pw.modelo.Departamentos;

@Stateless
public class DepartamentosON implements DepartamentosONRemote {
	
	@Inject
	private DepartamentosDAO  daoDepartamento;

	public void insertar(Departamentos p) throws Exception {
		daoDepartamento.insert(p);
		
	}
	
	
	public void update(Departamentos p) throws Exception {
		daoDepartamento.update(p);
	

	}
}
