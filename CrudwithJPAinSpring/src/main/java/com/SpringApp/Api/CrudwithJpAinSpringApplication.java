package com.SpringApp.Api;

import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CrudwithJpAinSpringApplication {

	private static User uus;

	public static void main(String[] args) {
		ApplicationContext Context = SpringApplication.run(CrudwithJpAinSpringApplication.class, args);

		UserRepository uR = Context.getBean(UserRepository.class);
		User us = new User();

		// 1 save single user using save method
		/*
		 * us.setName("Puneet"); us.setStatus("Offline"); us.setCty("Nagpur"); User
		 * user1 = uR.save(us); System.out.println(user1);
		 */

		// 2 saving multiple object using save all method
		/*
		 * User us = new User(); us.setName("Puneet"); us.setStatus("Offline");
		 * us.setCty("Nagpur");
		 * 
		 * 
		 * User us1 = new User(); us1.setCty("Nashik"); us1.setStatus("Priyanka");
		 * us1.setStatus("Online");
		 * 
		 * 
		 * 
		 * List<User> list = List.of(us,us1); Iterable<User> saveAll = uR.saveAll(list);
		 * saveAll.forEach(user->{ System.out.println(user); });
		 * 
		 */

		// 3 findId the user id
		// Optional<User> OptionalObj = uR.findById(1010);
		// User user = OptionalObj.get();
		// System.out.println(user);

		// 4 update user data
		// user.setName("rararararararar");
		// uus = uR.save(user);

		// 5 find all (old trick)

		// Iterable<User> all = uR.findAll();
		// Iterator<User> itera = all.iterator();
		// while (itera.hasNext()) {
		// User uuu = itera.next();
		// System.out.println(uuu);
		// }

		// 5 find all with new
		// Iterable<User> all = uR.findAll();
//		all.forEach(new Consumer<User>(){
//
//			@Override
//			public void accept(User t) {
//				// TODO Auto-generated method stub
//				System.out.println(t);
//			}
//		
//		});

		// 5 find all (best trick )
			Iterable<User> all = uR.findAll();
			all.forEach(user -> {System.out.println(user);});
			
			
		//6 delete one user element
			
			//uR.deleteById(null);
			//System.out.println();
	
			
		//7 delete all user			
			Iterable<User> deleteallUser = uR.findAll();
			all.forEach(user -> {System.out.println(user);});
			uR.deleteAll(deleteallUser);

	}

}
