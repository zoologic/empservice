package com.hcl.services.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import javax.transaction.Transactional;
import com.hcl.services.entities.*;
import com.hcl.services.repository.*;

/**
 * The Class UserService.
 */
@Service
@Transactional
public class UserService implements IUserService {

	/** The userRepository. */
	@Autowired
	private UserRepository userRepository;
      
	/**
	 * register.
	 *
     * @param user the user
	 * @return the User
	 */
	@Override
	public User register(User user) {
		return userRepository.save(user);
	}
	
       
}