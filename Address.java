package springDemoref1;

public class Address {
	
			private	String village;
			private String country;
			private int pin;
			
			public Address() {
				super();
				// TODO Auto-generated constructor stub
			}
			public Address(String village, String country, int pin) {
				super();
				this.village = village;
				this.country = country;
				this.pin = pin;
			
			}
			public String getVillage() {
				return village;
			}
			public void setVillage(String village) {
				this.village = village;
			}
			public String getCountry() {
				return country;
			}
			public void setCountry(String country) {
				this.country = country;
			}
			public int getPin() {
				return pin;
			}
			public void setPin(int pin) {
				this.pin = pin;
			}
			
			@Override
			public String toString() {
				return "Address [village=" + village + ", country=" + country + ", pin=" + pin 
						+ "]";
			}
	
}
