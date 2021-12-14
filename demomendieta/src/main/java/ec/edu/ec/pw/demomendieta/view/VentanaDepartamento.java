package ec.edu.ec.pw.demomendieta.view;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;

import ec.edu.ec.pw.busines.DepartamentosONRemote;
import ec.edu.ec.pw.modelo.Departamentos;





public class VentanaDepartamento {

	private DepartamentosONRemote deparRemote;
	
	
	public void conectar() throws Exception {
		try {  
            final Hashtable<String, Comparable> jndiProperties =  
                    new Hashtable<String, Comparable>();  
            jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY,  
                    "org.wildfly.naming.client.WildFlyInitialContextFactory");  
            jndiProperties.put("jboss.naming.client.ejb.context", true);  
              
            jndiProperties.put(Context.PROVIDER_URL, "http-remoting://localhost:8080");  
            jndiProperties.put(Context.SECURITY_PRINCIPAL, "willan");  
            jndiProperties.put(Context.SECURITY_CREDENTIALS, "willan");  
              
            final Context context = new InitialContext(jndiProperties);  
              
            final String lookupName = "ejb:/mendieta/DepartamentosON!ec.edu.ec.pw.business.DepartamentosONRemote";  
              
            this.deparRemote = (DepartamentosONRemote) context.lookup(lookupName);
            
      
        } catch (Exception ex) {  
            ex.printStackTrace();  
            throw ex;  
        }  
	}
	
	public void crearDepartamento() {
		
		Departamentos p = new Departamentos();
			p.setIdDepartamento(2);
			p.setNumBanos(2);
			p.setNumCarros(2);
			p.setNumHabitaciones(4);
			p.setNumPisos(1);
			
			
			try {
				deparRemote.insertar(p);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VentanaDepartamento vtnCalc = new VentanaDepartamento();
		try {
			vtnCalc.conectar();

			
			//vtnCalc.crearDepartamento();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
