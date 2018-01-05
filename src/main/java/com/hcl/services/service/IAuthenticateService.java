package com.hcl.services.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import javax.transaction.Transactional;
import com.hcl.services.entities.*;
import com.hcl.services.repository.*;

/**
 * The Interface IAuthenticateService.
 */
public interface IAuthenticateService{

	/**
	 * authenticate.
	 *
     * @param userid the userid
     * @param password the password
	  
	 */
	void authenticate(String userid, String password);
	

}
