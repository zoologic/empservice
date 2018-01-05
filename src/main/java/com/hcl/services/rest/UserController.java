package com.hcl.services.rest;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.hcl.services.entities.*;
import com.hcl.services.service.*;

/**
* The class UserController
*/
@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class UserController {

	/** The userService. */
	@Autowired
	private IUserService userService;

	/**
	 *<b> Create new user</b>
	 *<p> 
	 *
     * @param user the user
	 * @return the User
	 */
	@RequestMapping(value = "/user", method=RequestMethod.POST , consumes={"application/json"} , produces={"application/json"})
	public User register(@RequestBody(required=true) User user) {
		return userService.register(user);
	}
	

}