package common;
import java.rmi.*;

public interface BookHolidays extends java.rmi.Remote {
	
	/**
	* returns the nth fibonacci number where n is the input
	**/
	public Hotel bookHolidays(Person p, int days) throws RemoteException;

}