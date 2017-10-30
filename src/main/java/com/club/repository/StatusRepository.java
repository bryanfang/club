

/**
 * Project Name:club 
 * File Name:StatusRepository.java
 * Description: 
 * Copyright: Copyright (c) 2017 
 * Company:SAP
 * 
 * @author SAP
 * @date Oct 24, 2017 8:54:19 AM
 * @version 
 * @see
 * @since 
 */
 
package com.club.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.club.entity.Status;

/**
  * ClassName: StatusRepository
  * Description: Repository CRUD for status.
  * @author SAP
  * @version 
  * @see
  * @since 
  */

public interface StatusRepository extends JpaRepository<Status, Long>
{

}
 
