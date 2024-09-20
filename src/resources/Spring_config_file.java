package resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import bean.Address;
import bean.Student;
import bean.Subjects;

@Configuration
public class Spring_config_file {
	
	@Bean
	public Address createAddrObj() {
		Address addr=new Address();
		addr.setHouseno(234);
		addr.setCity("Jamsedhpur");
		addr.setPincode(201010);
		return addr;
	}
	@Bean
	public Address createAddrObj2() {
		Address addr=new Address();
		addr.setHouseno(149);
		addr.setCity("Udhampur");
		addr.setPincode(201012);
		return addr;
	}
	
	@Bean
	public Student createStdObj() {
		
		Student std =new Student();
		std.setName("Mansi");
		std.setRollno(512);
		//std.setAddress(createAddrObj());  // manually depenency Injection
		//std.setSubjects(createSubObj());	// manually depenency Injection
		return std;
	}
	
	@Bean
	public Subjects createSubObj() {
		Subjects subj=new Subjects();
		List <String> subject_list= new ArrayList<String>();
		subject_list.add("Java");
		subject_list.add("python");
		subject_list.add("C++");
		subj.setSubjects(subject_list);
		return  subj;
				
	}
	

}
