package com.chandan.serviceImpl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.chandan.entities.User;
import com.chandan.repository.UserRepo;
import com.chandan.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private static Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

	@Autowired
	private UserRepo userRepo;

	@Override
	public User createUser(User user) {

		if (user.getMob().equals(" ")) {
			log.error("Mobile number is empty.\nEnter Mobile first.");

		}
		return userRepo.save(user);
	}

	@Override
	public List<User> getAllUser() {

		return userRepo.findAll();
	}

	@Override
	public User getById(int id) {

		return userRepo.findById(id).get();
	}

	@Override
	public String deleteUserById(int id) {

		long count = userRepo.count();
		if (count < 1) {
			log.info("We can't delete record with given id as no record is available in database table.");
			System.exit(0);
		}
		userRepo.deleteById(id);

		return "user deleted successfully";
	}

	@Override
	public String deleteAllUser() {

		long count = userRepo.count();
		if (count < 1) {
			log.info("We can't delete record with given id as no record is available in database table.");
			System.exit(0);
		}
		userRepo.deleteAll();
		return "deleted all users";
	}

	@Override
	public User updateUser(int id, User user) {

		User user2 = userRepo.findById(id).get();
		user2.setName(user.getName());
		user2.setCity(user.getCity());
		user2.setMob(user.getMob());

		log.info("Given user has been updated successfully.");
		return userRepo.save(user2);
	}

}
