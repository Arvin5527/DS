package common;
import java.io.Serializable;
import java.time.LocalDate;

public class Hotel implements Serializable{

	private String name;
	private String location;
	
	private int days;
	
		



	public Hotel(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}


	public int getDays() {
		return days;
	}


	public void setDays(int days) {
		this.days = days;
	}
	
	
	
}
