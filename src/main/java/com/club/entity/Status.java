

/**
 * Project Name:club 
 * File Name:Status.java
 * Description: 
 * Copyright: Copyright (c) 2017 
 * Company:SAP
 * 
 * @author SAP
 * @date Oct 17, 2017 10:00:27 AM
 * @version 
 * @see
 * @since 
 */
 
package com.club.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
  * ClassName: Status
  * Description: Status for member
  * <br/>
  * 1. 初始， 才注册
  * <br/>
  * 2. 正常， 日常状态
  * <br/>
  * 3. 欠费， 会员没有交钱
  * <br/>
  * 4. 锁定， 管理员认为锁定
  * <br/>
  * @author SAP
  * @version 
  * @see
  * @since 
  */
@Entity
@Table(name="status")
public class Status implements Serializable
{
    
     /**  
     * serialVersionUID:Seriable object in database.  
     * @see
     */
     
    private static final long serialVersionUID = -3999019061959346056L;

    
    
    
    /**
      * create an instance: Status. 
      * Title: Status
      * Description: 
      */
    
    public Status()
    {
        super();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    private String status;
    
    private String description;
    
    @OneToOne(mappedBy="status")
    private Users users;




    public long getId()
    {
    
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getStatus()
    {
    
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getDescription()
    {
    
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public Users getUsers()
    {
    
        return users;
    }

    public void setUsers(Users users)
    {
        this.users = users;
    }

    @Override
    public String toString()
    {
        return "Status [id=" + id + ", status=" + status + ", description=" + description + ", users=" + users + "]";
    }
    
    
}
 
