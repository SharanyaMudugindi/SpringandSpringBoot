package com.jpa.test;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entity.User;

@SpringBootApplication
public class SpringbootJpaExampleApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context=SpringApplication.run(SpringbootJpaExampleApplication.class, args);
		UserRepository userRepository=context.getBean(UserRepository.class);
		//INSERTION
		/*User user=new User();
		user.setName("Sharanya");
		user.setCity("Bengaluru");
		user.setStatus("I'm just a girl");
		//saving single user
		User user1=userRepository.save(user);
		System.out.println(user1);*/
		
		//saving many
		
		/*User user1=new User();
		user1.setName("Akanksha");
		user1.setCity("XYZ City");
		user1.setStatus("She is a very happy girl");
		
		User user2=new User();
		user2.setName("Akanksha1");
		user2.setCity("XYZ City1");
		user2.setStatus("She is a very happy girl1");
		
		List<User> users=List.of(user1,user2);
		Iterable<User> result=userRepository.saveAll(users);
		
		result.forEach(user->{
			System.out.println(user);
		});*/
		
		
		//UPDATING THE EXISTING
		/*Optional<User> optional=userRepository.findById(152);
		User user=optional.get();
		
		Optional<User> optional1=userRepository.findById(2);
		User user1=optional1.get();
		
		user.setName("Ankit Tiwari");
		
		user1.setName("Honey");
		user1.setStatus("He is a singer");
		
		List<User> users=List.of(user,user1);
		Iterable<User> result=userRepository.saveAll(users);
		*/
		
		//GETTING DATA
		//1.Optional<User> optional=userRepository.findById(id);
		//  User users=optional.get();
		
		
		//2.
		//Iterable<User>itr =userRepository.findAll();
		/*itr.forEach(new Consumer<User>()
				{

					@Override
					public void accept(User t) {
						System.out.println(t);
						
					}
				
				})*/
		
		//itr.forEach(user->{System.out.println(user);});
		
		//DELETING
		//1.
		//userRepository.deleteById(102);
		
		//2.
		/*Optional<User> optional=userRepository.findById(52);
		User user=optional.get();
		Optional<User> optional1=userRepository.findById(153);
		User user1=optional1.get();
		List<User> list=List.of(user,user1);
		userRepository.deleteAll(list);*/
		
		//JPSQL
		/*List<User> allUser = userRepository.getAllUser();

		allUser. forEach(e->{
		System.out.println(e);
		});
		System.out.println("----------------------------------------");
		List<User> userByName = userRepository.getUserByName("Sharanya");
		userByName. forEach(e->{
		System.out.println(e);

		});*/
		
		//NATIVE QUERY
		System.out.println("----------------------------------------");
		List<User> users = userRepository.getAllUsers();  // ✅ Call the query
        users.forEach(user -> System.out.println(user));
		
		
		
		
		

		

		
		
		
		
	}

}
