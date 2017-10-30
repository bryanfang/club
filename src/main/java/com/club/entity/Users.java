

/**
 * Project Name:club 
 * File Name:Users.java
 * Description: 
 * Copyright: Copyright (c) 2017 
 * Company:SAP
 * 
 * @author SAP
 * @date Oct 16, 2017 3:29:08 PM
 * @version 
 * @see
 * @since 
 */
 
package com.club.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
  * ClassName: Users
  * Description: 
  * @author SAP
  * @version 
  * @see
  * @since 
  */
@Entity
@Table(name="users")
public class Users implements Serializable
{
    
     /**  
     * serialVersionUID:Serializable field for storing in database.  
     * @see
     */
     
    private static final long serialVersionUID = 6643427360596357619L;
    
    
    
    
    /**
      * create an instance: Users. 
      * Title: Users
      * Description: 
      */
    
    public Users()
    {
        super();
    }

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    
    @Column(unique=true)
    private String openId;
    
    private String firstName;
    
    private String lastName;
    
    @Column
    @Temporal(value=TemporalType.DATE)
    private Date birthday;
    
    private int sex;   // 1 - Male 2 - Female
    
    private String email;
    
    private String telephone;
    
    private int height;    //per cm
    
    private double weight;   //per kg
    
    private String identityNo;  
    
    private String emergencyPhone;
    
    private String bloodType;
    
    private String emergencyContact;
    
    //User-Role mapping
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="role_id")
    private Roles roles;
    
    @OneToOne
    @JoinColumn(name = "status_id")
    private Status status;
    
    @OneToMany(mappedBy = "user")
    private Set<ScoreHistory> scoreHistory = new HashSet<>();
   
    @Column(updatable = false)
    private Timestamp createdAt;
    
    @Column(insertable = false)
    private Timestamp changedAt;
    
    private Timestamp validFrom;
    
    private Timestamp validTo;
    
    
    @PrePersist
    public void onPrePersist() {
        setCreatedAt(now());
    }
    
    @PreUpdate
    public void onPreUpdate() {
        this.changedAt = now();
    }
    
    public Timestamp getCreatedAt() {
        if(createdAt != null) {
            return new Timestamp(createdAt.getTime());
        }
        return null;
    }
    
    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }
    
    public Timestamp getChangedAt() {
        if(changedAt != null) {
            return new Timestamp(changedAt.getTime());
        }
        return null;
    }
    
    public void setChangedAt(Timestamp changedAt) {
        this.changedAt = changedAt;
    }
    
    protected static Timestamp now() {
        return new Timestamp(new Date().getTime());
    }

    
    public long getId()
    {
    
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getOpenId()
    {
    
        return openId;
    }

    public void setOpenId(String openId)
    {
        this.openId = openId;
    }

    public String getFirstName()
    {
    
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public Date getBirthday()
    {
    
        return birthday;
    }

    public void setBirthday(Date birthday)
    {
        this.birthday = birthday;
    }

    public int getSex()
    {
    
        return sex;
    }

    public void setSex(int sex)
    {
        this.sex = sex;
    }

    public String getEmail()
    {
    
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getTelephone()
    {
    
        return telephone;
    }

    public void setTelephone(String telephone)
    {
        this.telephone = telephone;
    }

    public int getHeight()
    {
    
        return height;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    public double getWeight()
    {
    
        return weight;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    public String getIdentityNo()
    {
    
        return identityNo;
    }

    public void setIdentityNo(String identityNo)
    {
        this.identityNo = identityNo;
    }

    public String getEmergencyContact()
    {
    
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact)
    {
        this.emergencyContact = emergencyContact;
    }

    public String getEmergencyPhone()
    {
    
        return emergencyPhone;
    }

    public void setEmergencyPhone(String emergencyPhone)
    {
        this.emergencyPhone = emergencyPhone;
    }

    public Roles getRoles()
    {
    
        return roles;
    }

    public void setRoles(Roles roles)
    {
        this.roles = roles;
    }

    public Status getStatus()
    {
    
        return status;
    }

    public void setStatus(Status status)
    {
        this.status = status;
    }

    public Set<ScoreHistory> getScoreHistory()
    {
    
        return scoreHistory;
    }

    public void setScoreHistory(Set<ScoreHistory> scoreHistory)
    {
        this.scoreHistory = scoreHistory;
    }

    public Timestamp getValidFrom()
    {
    
        return validFrom;
    }

    public void setValidFrom(Timestamp validFrom)
    {
        this.validFrom = validFrom;
    }

    public Timestamp getValidTo()
    {
    
        return validTo;
    }

    public void setValidTo(Timestamp validTo)
    {
        this.validTo = validTo;
    }

    
    
    public String getLastName()
    {
    
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getBloodType()
    {
    
        return bloodType;
    }

    public void setBloodType(String bloodType)
    {
        this.bloodType = bloodType;
    }

    @Override
    public String toString()
    {
        return "Users [id=" + id + ", openId=" + openId + ", firstName=" + firstName + ", lastName=" + lastName + ", birthday=" + birthday + ", sex="
            + sex + ", email=" + email + ", telephone=" + telephone + ", height=" + height + ", weight=" + weight + ", identityNo=" + identityNo
            + ", emergencyPhone=" + emergencyPhone + ", bloodType=" + bloodType + ", emergencyContact=" + emergencyContact + ", roles=" + roles
            + ", status=" + status + ", scoreHistory=" + scoreHistory + ", createdAt=" + createdAt + ", changedAt=" + changedAt + ", validFrom="
            + validFrom + ", validTo=" + validTo + "]";
    }
    
}
 
