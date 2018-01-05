package com.hcl.services.repository;


import org.springframework.data.repository.CrudRepository;
import com.hcl.services.entities.User;

/**
 * The Interface UserRepository.
 */
public interface UserRepository extends CrudRepository<User, String>{


}