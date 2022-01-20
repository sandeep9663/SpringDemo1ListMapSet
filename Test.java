
package springDemoref1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springDemoref1.Student;

public class Test {


		public static void main(String[] args) {
			
			  ApplicationContext context = new 
					  ClassPathXmlApplicationContext("ref1.xml");
							//Address add=(Address)context.getBean("addr2");
			Student std=(Student)context.getBean("student2");
							//System.out.println(std);
							System.out.println(std.getAdr());
							
			    }
			
	
	}

