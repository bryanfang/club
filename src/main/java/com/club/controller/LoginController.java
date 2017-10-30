

/**
 * Project Name:club 
 * File Name:LoginController.java
 * Description: 
 * Copyright: Copyright (c) 2017 
 * Company:SAP
 * 
 * @author SAP
 * @date Oct 30, 2017 9:37:09 AM
 * @version 
 * @see
 * @since 
 */
 
package com.club.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.club.constant.StatusConstants;
import com.club.dto.SessionKey;
import com.club.dto.UserDto;
import com.club.entity.Users;
import com.club.exeception.UserException;
import com.club.repository.UsersRepository;

/**
  * ClassName: LoginController
  * Description: 
  * @author SAP
  * @version 
  * @see
  * @since 
  */

@RestController
@RequestMapping("/login")
public class LoginController
{
    private Logger log = LoggerFactory.getLogger(getClass());
    
    @Value("${wechat.appId}")
    private String appId;
    
    @Value("${wechat.appSecret}")
    private String appSecret;
    
    private static final String wechatAPISessionUrl = "https://api.weixin.qq.com/sns/jscode2session?appid={appId}&secret={appSecret}&js_code={jsCode}&grant_type=authorization_code";
    
    @Autowired
    private RestTemplate restTemplate;
    
    @Autowired
    private UsersRepository usersRepository;
    
    @PostMapping
    public UserDto getUser(@RequestBody String code) {
        UserDto dto = new UserDto();
        Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("appId", appId);
        uriVariables.put("appSecret", appSecret);
        ResponseEntity<SessionKey> sessionInfor = restTemplate.getForEntity(wechatAPISessionUrl, SessionKey.class, uriVariables);
        SessionKey sk = sessionInfor.getBody();
        String openId = sk.getOpenid();
        Users user = usersRepository.findByOpenId(openId);
        if(user == null) {
            return null;
        }
        else if(user.getStatus().getStatus().equals(StatusConstants.LOCKED.toString())){
            if(log.isErrorEnabled()) {
                log.error(StatusConstants.LOCKED_DESC.toString());
            }
            
            throw new UserException(StatusConstants.LOCKED.toString());
        }
        
        dto.setBirthday(user.getBirthday());
        dto.setFirstName(user.getFirstName());
        dto.setLastName(user.getLastName());
        dto.setSex(user.getSex());
        dto.setEmail(user.getEmail());
        dto.setTelephone(user.getTelephone());
        dto.setStatus(user.getStatus().getStatus());
        dto.setValidTo(user.getValidTo());
        return dto;
    }
    
    @GetMapping
    public String login() {
        return "Test";
    }
    
}
 
