

/**
 * Project Name:club 
 * File Name:InitializeData.java
 * Description: 
 * Copyright: Copyright (c) 2017 
 * Company:SAP
 * 
 * @author SAP
 * @date Oct 24, 2017 8:46:22 AM
 * @version 
 * @see
 * @since 
 */
 
package com.club.init;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.club.constant.GameTypeConstants;
import com.club.constant.RoleConstants;
import com.club.constant.StatusConstants;
import com.club.entity.GameType;
import com.club.entity.Roles;
import com.club.entity.Status;
import com.club.repository.GameTypeRepository;
import com.club.repository.RolesRepository;
import com.club.repository.StatusRepository;

/**
  * ClassName: InitializeData
  * Description: Initialize data to database.
  * @author SAP
  * @version 
  * @see
  * @since 
  */

@Component
public class InitializeData implements CommandLineRunner
{
    
    @Autowired
    private RolesRepository rolesRepository;
    
    @Autowired
    private StatusRepository statusRepository;
    
    @Autowired
    private GameTypeRepository gameTypeRepository;
    
    /**
     * Title: run
     * Description: Insert game type and status to database.
     * @param arg0
     * @throws Exception (describe the param)
     * @see org.springframework.boot.CommandLineRunner#run(java.lang.String[])
     */

    @Override
    public void run(String... arg0) throws Exception
    {
        
        //Initialize roles to database
        List<Roles> roles = new ArrayList<>();
        Roles role = new Roles();
        role.setId(1L);
        role.setRole(RoleConstants.ADMIN.toString());
        roles.add(role);
        role.setId(2L);
        role.setRole(RoleConstants.MEMEMBER.toString());
        roles.add(role);
        rolesRepository.save(roles);
        
        //Initialize status to database
        List<Status> statuses  = new ArrayList<>();
        Status status = new Status();
        status.setId(1L);
        status.setDescription(StatusConstants.INIT_DESC.toString());
        status.setStatus(StatusConstants.INIT.toString());
        statuses.add(status);
        status.setId(2L);
        status.setStatus(StatusConstants.NORMAL.toString());
        status.setDescription(StatusConstants.NORMAL_DESC.toString());
        statuses.add(status);
        status.setId(4L);
        status.setStatus(StatusConstants.ARREARAGE.toString());
        status.setDescription(StatusConstants.ARREARAGE_DESC.toString());
        statuses.add(status);
        status.setId(8L);
        status.setStatus(StatusConstants.LOCKED.toString());
        status.setDescription(StatusConstants.LOCKED_DESC.toString());
        statuses.add(status);
        statusRepository.save(statuses);
        
        //Initialize game type to database.
        List<GameType> gameTypes = new ArrayList<>();
        GameType gameType = new GameType();
        gameType.setId(1L);
        gameType.setType(GameTypeConstants.SEMI_STANDARD.toString());
        gameTypes.add(gameType);
        gameType.setId(2L);
        gameType.setType(GameTypeConstants.STANDARD.toString());
        gameTypes.add(gameType);
        gameType.setId(3L);
        gameType.setType(GameTypeConstants.SEMI_TRIATHLON.toString());
        gameTypes.add(gameType);
        gameType.setId(4L);
        gameType.setType(GameTypeConstants.TRIATHLON.toString());
        gameTypes.add(gameType);
        gameTypeRepository.save(gameTypes);
        
    }

}
 
