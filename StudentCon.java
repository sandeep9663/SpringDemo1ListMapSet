package springDemoCon;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class StudentCon {

		private	int roll;
		private	List<String> name;
		private Address addrs;
		public StudentCon(int roll, List<String> name, Address addrs) {
			super();
			this.roll = roll;
			this.name = name;
			this.addrs = addrs;
		}
		@Override
		public String toString() {
			return "StudentCon [roll=" + roll + ", name=" + name + ", addrs=" + addrs + "]";
		}
		
	
	
	
	
}
