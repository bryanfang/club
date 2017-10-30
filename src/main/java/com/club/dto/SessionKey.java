

/**
 * Project Name:club 
 * File Name:SessionKey.java
 * Description: 
 * Copyright: Copyright (c) 2017 
 * Company:SAP
 * 
 * @author SAP
 * @date Oct 30, 2017 9:54:52 AM
 * @version 
 * @see
 * @since 
 */
 
package com.club.dto;


/**
  * ClassName: SessionKey
  * Description: Session Key to hold the value from wechat.
  * @author SAP
  * @version 
  * @see
  * @since 
  */

public class SessionKey
{
    private String openid;
    private String session_key;
    private String unionid;
    
    /**
      * create an instance: SessionKey. 
      * Title: SessionKey
      * Description: 
      */
    
    public SessionKey()
    {
        super();
    }

    public String getOpenid()
    {
    
        return openid;
    }

    public void setOpenid(String openid)
    {
        this.openid = openid;
    }

    public String getSession_key()
    {
    
        return session_key;
    }

    public void setSession_key(String session_key)
    {
        this.session_key = session_key;
    }

    public String getUnionid()
    {
    
        return unionid;
    }

    public void setUnionid(String unionid)
    {
        this.unionid = unionid;
    }

    @Override
    public String toString()
    {
        return "SessionKey [openid=" + openid + ", session_key=" + session_key + ", unionid=" + unionid + "]";
    }
    
    
}
 
