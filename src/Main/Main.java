package Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import bean.Student;
import resources.Spring_config_file;

// dependency injection example using java file 

public class Main {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(Spring_config_file.class);
		Student std=context.getBean(Student.class);
		std.display();
	}

}
