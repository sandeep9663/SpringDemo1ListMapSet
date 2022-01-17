package springDemo;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {

	private int roll;
	private List<String> name;
	private Set<String> city;
	private Map<String,Integer>pin;
	private String con;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int roll, List<String> name, Set<String> city, Map<String, Integer> pin, String con) {
		super();
		this.roll = roll;
		this.name = name;
		this.city = city;
		this.pin = pin;
		this.con = con;
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
	public Set<String> getCity() {
		return city;
	}
	public void setCity(Set<String> city) {
		this.city = city;
	}
	public Map<String, Integer> getPin() {
		return pin;
	}
	public void setPin(Map<String, Integer> pin) {
		this.pin = pin;
	}
	public String getCon() {
		return con;
	}
	public void setCon(String con) {
		this.con = con;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", city=" + city + ", pin=" + pin + ", con=" + con + "]";
	}
	
	
	
	
}
