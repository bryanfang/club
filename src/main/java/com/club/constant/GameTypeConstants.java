

/**
 * Project Name:club 
 * File Name:GameTypeConstants.java
 * Description: 
 * Copyright: Copyright (c) 2017 
 * Company:SAP
 * 
 * @author SAP
 * @date Oct 24, 2017 10:33:52 AM
 * @version 
 * @see
 * @since 
 */
 
package com.club.constant;


/**
  * ClassName: GameTypeConstants
  * Description: Enum for game types.
  * @author SAP
  * @version 
  * @see
  * @since 
  */

public enum GameTypeConstants
{
    SEMI_STANDARD("半标"),
    STANDARD("标铁"),
    SEMI_TRIATHLON("半铁"),
    TRIATHLON("大铁");
    private String value;
    private GameTypeConstants(String value) {
        this.value = value;
    }
    
    @Override
    public String toString() {
        return value;
    }
}
 
