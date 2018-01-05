package com.hcl.services.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import javax.transaction.Transactional;
import com.hcl.services.entities.*;
import com.hcl.services.repository.*;

/**
 * The Interface IUserService.
 */
public interface IUserService{

	/**
	 * register.
	 *
     * @param user the user
	  * @return the User
	 */
	User register(User user);
	

}
