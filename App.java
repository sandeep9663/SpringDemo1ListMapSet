package springDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {


	public static void main(String[] args) {
//		    System.out.println( "Hello World!" );
//	        ApplicationContext context=new ClassPathXmlApplicationContext("configuration.xml");
//	        Employee EmployeeInfo=(Employee)context.getBean("employee");
//	        System.out.println(EmployeeInfo.getROll());
//	        System.out.println(EmployeeInfo.getEmp_name());
//	        System.out.println(EmployeeInfo.getEmp_address());
//	        System.out.println(EmployeeInfo.);
	     
	     
		
		
		ApplicationContext context1 =new ClassPathXmlApplicationContext("configuration.xml");
		Student student1=(Student)context1.getBean("stu");
System.out.println(student1.getRoll());
System.out.println(student1.getName());
System.out.println(student1.getCity());
System.out.println(student1.getPin());
System.out.println(student1.getRoll());
		
	    }
	
}


