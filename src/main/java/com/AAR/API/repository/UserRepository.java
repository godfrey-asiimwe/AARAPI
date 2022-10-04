/**
 * 
 */
package com.AAR.API.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AAR.API.Model.User;

/**
 * @author godfrey
 *
 */
public interface UserRepository extends JpaRepository<User, Integer> {

}
