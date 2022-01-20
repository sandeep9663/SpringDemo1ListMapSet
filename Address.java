package springDemoCon;

public class Address {
	
			private	String city;
			private String country;
			private int pin;
			public Address(String city, String country, int pin) {
				super();
				this.city = city;
				this.country = country;
				this.pin = pin;
			}
			@Override
			public String toString() {
				return "Address [city=" + city + ", country=" + country + ", pin=" + pin + "]";
			}
			
			
}
