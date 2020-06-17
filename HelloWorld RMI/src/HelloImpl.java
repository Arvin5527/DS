import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class HelloImpl extends UnicastRemoteObject implements Hello {

	public HelloImpl() throws RemoteException {
		
	}
	
	public String sayHello(){
		
		
		return "Hello world!"; 
	}

	public static void main(String args[]){
		
		startRegistry();
		
		try {
		
			HelloImpl obj = new HelloImpl();
			
			// Bind this object instance to the name "HelloServer"
			Naming.rebind("HelloServer", obj);
			
		} catch (Exception e){
			e.printStackTrace();
		}
	}
	
	
	private static void startRegistry() {
		
		try {			
			
			LocateRegistry.createRegistry(1099);
		
			System.out.println("RMI registry is ready ...");
			
		}catch (Exception e) {
			System.out.println("Exception starting RMI Registry " + e.getMessage());
			e.printStackTrace();
		}
		
	}
	
}