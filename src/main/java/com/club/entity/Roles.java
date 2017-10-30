

/**
 * Project Name:club 
 * File Name:Roles.java
 * Description: 
 * Copyright: Copyright (c) 2017 
 * Company:SAP
 * 
 * @author SAP
 * @date Oct 19, 2017 9:22:17 AM
 * @version 
 * @see
 * @since 
 */
 
package com.club.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
  * ClassName: Roles
  * Description: Roles for member.
  * @author SAP
  * @version 
  * @see
  * @since 
  */

@Entity
@Table(name="roles")
public class Roles implements Serializable
{

    
     /**  
     * serialVersionUID:Serial object to database.  
     * @see
     */
     
    private static final long serialVersionUID = -5090489521988309627L;

    public Roles() {
        
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    /**
     * 1. Admin
     * 2. Member
     * 
     */
    private String role;
    
    //User-Role bidirectional mapping
    @OneToMany(mappedBy= "roles", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Users> users = new HashSet<>();

    public long getId()
    {
    
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getRole()
    {
    
        return role;
    }

    public void setRole(String role)
    {
        this.role = role;
    }

    public Set<Users> getUsers()
    {
    
        return users;
    }

    public void setUsers(Set<Users> users)
    {
        this.users = users;
    }

    @Override
    public String toString()
    {
        return "Roles [id=" + id + ", role=" + role + ", users=" + users + "]";
    }
    
    
}
 
