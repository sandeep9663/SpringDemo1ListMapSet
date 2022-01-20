package springDemoref1;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {

		private	int roll;
		private	List<String> name;
		
	
		private String con;
		private Address adr;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int roll, List<String> name,   String con,Address adr) {
		super();
		this.roll = roll;
		this.name = name;
		
		this.con = con;
		this.adr=adr;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public List<String> getName() {
		return name;
	}
	public void setName(List<String> name) {
		this.name = name;
	}
	
	public String getCon() {
		return con;
	}
	public void setCon(String con) {
		this.con = con;
	}
	
	public Address getAdr() {
		return adr;
	}
	public void setAdr(Address adr) {
		this.adr = adr;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name +  ", con=" + con
				+ ", adr=" + adr + "]";
	}
	
	
	
	
	
}
