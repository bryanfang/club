

/**
 * Project Name:club 
 * File Name:RoleConstants.java
 * Description: 
 * Copyright: Copyright (c) 2017 
 * Company:SAP
 * 
 * @author SAP
 * @date Oct 24, 2017 10:25:53 AM
 * @version 
 * @see
 * @since 
 */
 
package com.club.constant;


/**
  * ClassName: RoleConstants
  * Description: 
  * @author SAP
  * @version 
  * @see
  * @since 
  */

public enum RoleConstants
{
    ADMIN("ADMIN"),
    MEMEMBER("MEMEMBER");
    private String role;
    private RoleConstants(String role) {
        this.role = role;
    }
    
    @Override
    public String toString() {
        return role;
    }
}
 
