package client;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.time.LocalDate;
import java.time.Month;

import common.BookHolidays;
import common.Hotel;
import common.Person;



public class BookHolidaysClient {

		public static void main(String args[]) {
		
		String remoteHost = "stafflap-3457";
		String remoteService = "HolidaysServer";
		
		
		int n = 10;
		
		if (args.length > 0){
			remoteHost = args[0];
			n = Integer.parseInt(args[1]);
		}

		try {
		
			
			// obtain a proxy object for the implementation which is running on the server

			BookHolidays obj = (BookHolidays) Naming.lookup( "//" + remoteHost + "/"+remoteService); 
			
			Person p = new Person("John", LocalDate.of(2000, Month.JANUARY, 10) );
			Hotel hotel = obj.bookHolidays(p, 4);
			
			
			System.out.println("receiving confirmation - Hotel " + hotel.getName() + " location: " + hotel.getLocation()+ " num of days "+  hotel.getDays());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
