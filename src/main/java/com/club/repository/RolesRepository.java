

/**
 * Project Name:club 
 * File Name:RolesRepository.java
 * Description: 
 * Copyright: Copyright (c) 2017 
 * Company:SAP
 * 
 * @author SAP
 * @date Oct 24, 2017 8:57:43 AM
 * @version 
 * @see
 * @since 
 */
 
package com.club.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.club.entity.Roles;

/**
  * ClassName: RolesRepository
  * Description: 
  * @author SAP
  * @version 
  * @see
  * @since 
  */

public interface RolesRepository extends JpaRepository<Roles, Long>
{

}
 
