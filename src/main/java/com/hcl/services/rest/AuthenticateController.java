package com.hcl.services.rest;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.hcl.services.entities.*;
import com.hcl.services.service.*;

/**
* The class AuthenticateController
*/
@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class AuthenticateController {

	/** The authenticateService. */
	@Autowired
	private IAuthenticateService authenticateService;

	/**
	 *<b> Authenticate a new user</b>
	 *<p> 
	 *
     * @param userid the userid
     * @param password the password
	 
	 */
	@RequestMapping(value = "/authenticate", method=RequestMethod.POST , consumes={"application/json"} , produces={"application/json"})
	public void authenticate(@RequestParam(value="userid", required=true) String userid, @RequestParam(value="password", required=true) String password) {
		authenticateService.authenticate(userid, password);
	}
	

}