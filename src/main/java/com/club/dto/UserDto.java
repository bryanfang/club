

/**
 * Project Name:club 
 * File Name:UserDto.java
 * Description: 
 * Copyright: Copyright (c) 2017 
 * Company:SAP
 * 
 * @author SAP
 * @date Oct 30, 2017 9:21:59 AM
 * @version 
 * @see
 * @since 
 */
 
package com.club.dto;

import java.sql.Timestamp;
import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

/**
  * ClassName: UserDto
  * Description: Data transform object.
  * @author SAP
  * @version 
  * @see
  * @since 
  */

public class UserDto
{
    @NotNull
    private long id;
    
    @NotBlank
    private String openId;
    
    @NotBlank
    private String firstName;
    
    @NotBlank
    private String lastName;
    
    @NotBlank
    private Date birthday;
    
    @NotNull
    private int sex;   // 1 - Male 2 - Female
    
    @NotBlank
    private String email;
    
    @NotBlank
    private String telephone;
    
    private int height;    //per cm
    
    private double weight;   //per kg
    
    private String identityNo;  
    
    private String emergencyPhone;
    
    private String bloodType;
    
    private String emergencyContact;
    
    private String roles;
    
    private String status;
    
    private Timestamp createdAt;
    
    private Timestamp changedAt;
    
    private Timestamp validFrom;
    
    private Timestamp validTo;
    
    
    /**
      * create an instance: UserDto. 
      * Title: UserDto
      * Description: 
      */
    
    public UserDto()
    {
        super();
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

    public String getLastName()
    {
    
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
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

    public String getEmergencyPhone()
    {
    
        return emergencyPhone;
    }

    public void setEmergencyPhone(String emergencyPhone)
    {
        this.emergencyPhone = emergencyPhone;
    }

    public String getBloodType()
    {
    
        return bloodType;
    }

    public void setBloodType(String bloodType)
    {
        this.bloodType = bloodType;
    }

    public String getEmergencyContact()
    {
    
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact)
    {
        this.emergencyContact = emergencyContact;
    }

    public String getRoles()
    {
    
        return roles;
    }

    public void setRoles(String roles)
    {
        this.roles = roles;
    }

    public String getStatus()
    {
    
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public Timestamp getCreatedAt()
    {
    
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt)
    {
        this.createdAt = createdAt;
    }

    public Timestamp getChangedAt()
    {
    
        return changedAt;
    }

    public void setChangedAt(Timestamp changedAt)
    {
        this.changedAt = changedAt;
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

    @Override
    public String toString()
    {
        return "UserDto [id=" + id + ", openId=" + openId + ", firstName=" + firstName + ", lastName=" + lastName + ", birthday=" + birthday
            + ", sex=" + sex + ", email=" + email + ", telephone=" + telephone + ", height=" + height + ", weight=" + weight + ", identityNo="
            + identityNo + ", emergencyPhone=" + emergencyPhone + ", bloodType=" + bloodType + ", emergencyContact=" + emergencyContact + ", roles="
            + roles + ", status=" + status + ", createdAt=" + createdAt + ", changedAt=" + changedAt + ", validFrom=" + validFrom + ", validTo="
            + validTo + "]";
    }
    
    
    
}
 
