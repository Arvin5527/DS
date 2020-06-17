package server;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

import common.BookHolidays;
import common.Hotel;
import common.Person;



public class BookHolidaysImpl extends UnicastRemoteObject implements BookHolidays {

	
	
	public BookHolidaysImpl() throws RemoteException {
		System.out.println("HolidaysServer started ...");
	}
	
	

	public static void main(String args[]){
		String service = "HolidaysServer";
		int port = 1099;
		String host = "0.0.0.0"; //any location
		
		String bindLocation = "rmi://" + host + ":" + port + "/"+ service;
	       
		
		startRegistry(port);
		
		try {
			//creating service object
			BookHolidaysImpl obj = new BookHolidaysImpl();
			
			// Bind this object instance to rmi
			Naming.rebind(bindLocation, obj);
			
		} catch (Exception e){
			e.printStackTrace();
		}
	}



	private static void startRegistry(int port) {
		
		try {			
			
			LocateRegistry.createRegistry(port);
		
			System.out.println("RMI registry is ready ...");
			
		}catch (Exception e) {
			System.out.println("Exception starting RMI Registry " + e.getMessage());
			e.printStackTrace();
		}
		
	}
	

	@Override
	public Hotel bookHolidays(Person p, int days) throws RemoteException {
		
		System.out.println("Receiving request from " + p.getName() + " for "+days+" days ");
		System.out.println("  finding available room"); 
		
		Hotel hotel = new Hotel("HolidayIn", "Paris");
		
		hotel.setDays(days-1);
		
		return hotel;
	}
	
}