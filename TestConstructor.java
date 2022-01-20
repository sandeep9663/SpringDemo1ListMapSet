package springDemoCon;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springDemoref1.Student;

public class TestConstructor {


		public static void main(String[] args) {
			
			  ApplicationContext context = new 
					  ClassPathXmlApplicationContext("Constrc.xml");
							//Address add=(Address)context.getBean("addr2");
			StudentCon stc=(StudentCon)context.getBean("consrt");
							//System.out.println(std);
							System.out.println(stc);
							
			    }
			
	
	}

