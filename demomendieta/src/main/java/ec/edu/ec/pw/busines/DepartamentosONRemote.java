package ec.edu.ec.pw.busines;

import javax.ejb.Remote;

import ec.edu.ec.pw.modelo.Departamentos;
@Remote
public interface DepartamentosONRemote {

	public void insertar(Departamentos p) throws Exception;
	
	public void update(Departamentos op);
	
}
