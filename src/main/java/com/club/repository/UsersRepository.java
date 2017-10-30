

/**
 * Project Name:club 
 * File Name:UsersRepository.java
 * Description: 
 * Copyright: Copyright (c) 2017 
 * Company:SAP
 * 
 * @author SAP
 * @date Oct 24, 2017 8:52:11 AM
 * @version 
 * @see
 * @since 
 */
 
package com.club.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.club.entity.Users;

/**
  * ClassName: UsersRepository
  * Description: Repository for users.
  * @author SAP
  * @version 
  * @see
  * @since 
  */

public interface UsersRepository extends JpaRepository<Users, String>
{
    Users findByOpenId(String openId);
}
 
