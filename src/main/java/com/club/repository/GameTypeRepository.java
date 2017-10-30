

/**
 * Project Name:club 
 * File Name:GameTypeRepository.java
 * Description: 
 * Copyright: Copyright (c) 2017 
 * Company:SAP
 * 
 * @author SAP
 * @date Oct 24, 2017 8:55:26 AM
 * @version 
 * @see
 * @since 
 */
 
package com.club.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.club.entity.GameType;

/**
  * ClassName: GameTypeRepository
  * Description: CRUD repository for Game Type.
  * @author SAP
  * @version 
  * @see
  * @since 
  */

public interface GameTypeRepository extends JpaRepository<GameType, Long>
{

}
 
