

/**
 * Project Name:club 
 * File Name:StatusConstants.java
 * Description: 
 * Copyright: Copyright (c) 2017 
 * Company:SAP
 * 
 * @author SAP
 * @date Oct 24, 2017 9:49:29 AM
 * @version 
 * @see
 * @since 
 */
 
package com.club.constant;


/**
  * ClassName: StatusConstants
  * Description: 
  * @author SAP
  * @version 
  * @see
  * @since 
  */

public enum StatusConstants
{
    
    INIT("初始"),
    INIT_DESC("才注册"),
    NORMAL("正常"),
    NORMAL_DESC("日常状态"),
    ARREARAGE("欠费"),
    ARREARAGE_DESC("会员没交钱"),
    LOCKED("锁定"),
    LOCKED_DESC("管理员认为锁定");
    
    private String value;
    
    private StatusConstants(String value) {
        this.value = value;
    }
    
    @Override
    public String toString() {
        return value;
    }
}
 
