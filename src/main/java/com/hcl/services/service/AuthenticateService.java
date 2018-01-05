package com.hcl.services.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import javax.transaction.Transactional;
import com.hcl.services.entities.*;
import com.hcl.services.repository.*;

/**
 * The Class AuthenticateService.
 */
@Service
@Transactional
public class AuthenticateService implements IAuthenticateService {

      
	/**
	 * authenticate.
	 *
     * @param userid the userid
     * @param password the password
	 
	 */
	@Override
	public void authenticate(String userid, String password) {
		
	}
	
       
}