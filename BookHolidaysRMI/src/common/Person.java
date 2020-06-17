package common;
import java.io.Serializable;
import java.time.LocalDate;

public class Person implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;	
	private LocalDate dob;
	
	
	public Person(String name, LocalDate dob) {
		super();
		this.name = name;		
		this.dob = dob;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public LocalDate getDob() {
		return dob;
	}
	
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	
	
	

}
