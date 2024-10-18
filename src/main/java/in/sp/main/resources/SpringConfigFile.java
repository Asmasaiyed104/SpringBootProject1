package in.sp.main.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.main.beans.Address;
import in.sp.main.beans.Student;

@Configuration
public class SpringConfigFile
{
	@Bean
	Address createAddrObj()
	{
		Address addr = new Address();
		
		addr.setHouseno(111);
		addr.setCity("Toronto");
		addr.setPincode("L7A4T9");
		
		return addr;
	}
	
    @Bean("stdObj")
    Student createStdObj()
	{
		Student std = new Student();
		
		std.setName("Asma");
		std.setRollno(102);
		std.setAddress(createAddrObj());
		
		return std;
	}
}