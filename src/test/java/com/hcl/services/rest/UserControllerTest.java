package com.hcl.services.rest;

import java.util.*;
import org.junit.*;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.autoconfigure.web.servlet.*;
import org.springframework.boot.test.mock.mockito.*;
import org.springframework.test.context.junit4.*;
import org.springframework.test.web.servlet.*;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.runner.RunWith;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.http.MediaType;
import org.skyscreamer.jsonassert.JSONAssert;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import org.springframework.test.web.servlet.*;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.http.MediaType;
import java.io.File;
import com.hcl.services.entities.*;
import com.hcl.services.service.*;
import com.hcl.services.rest.*;

@RunWith(SpringRunner.class)
@WebMvcTest(value = UserController.class, secure = false)
public class UserControllerTest {

	@MockBean 
	private UserService userService;
	
	@Autowired
	private MockMvc mockMvc;
	

	@Test
	public void registerTest() throws Exception {
   	    String expected = "{\"id\":5, \"email\":\"Fish\", \"firstName\":\"Fish\", \"lastName\":\"Fish\", \"middleName\":\"Fish\", \"password\":\"Fish\", \"userId\":\"Fish\"}";		
		User user = new User();
	    user.setId(5); 
	    user.setEmail("Fish"); 
	    user.setFirstName("Fish"); 
	    user.setLastName("Fish"); 
	    user.setMiddleName("Fish"); 
	    user.setPassword("Fish"); 
	    user.setUserId("Fish"); 
		Mockito.when(userService.register(user)).thenReturn(user); 
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("./src/test/resources/test.json"),user);
		String jsonInString = mapper.writeValueAsString(user);
		jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(user);
		RequestBuilder requestBuilder = MockMvcRequestBuilders.post("/user")
		.accept(MediaType.APPLICATION_JSON).content(jsonInString).contentType(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		JSONAssert.assertEquals(expected,jsonInString, false);
	}
	

}