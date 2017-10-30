

/**
 * Project Name:club 
 * File Name:GameType.java
 * Description: 
 * Copyright: Copyright (c) 2017 
 * Company:SAP
 * 
 * @author SAP
 * @date Oct 23, 2017 9:50:05 AM
 * @version 
 * @see
 * @since 
 */
 
package com.club.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
  * ClassName: GameType
  * Description: Type of games.
  * <br/>
  * 1. 半标
  * <br/>
  * 2. 标铁
  * <br/>
  * 3. 半大铁
  * <br/>
  * 4. 大铁
  * @author SAP
  * @version 
  * @see
  * @since 
  */

@Entity
@Table(name = "game_type")
public class GameType implements Serializable
{

    
     /**  
     * serialVersionUID:Serial object for store in database.  
     * @see
     */
     
    private static final long serialVersionUID = -4812958949654449141L;
    
    public GameType() {
        //for jpa
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    private String type;
    
    @OneToMany(mappedBy = "gameType")
    private Set<ScoreHistory> scores;

    public long getId()
    {
    
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getType()
    {
    
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public Set<ScoreHistory> getScores()
    {
    
        return scores;
    }

    public void setScores(Set<ScoreHistory> scores)
    {
        this.scores = scores;
    }

    @Override
    public String toString()
    {
        return "GameType [id=" + id + ", type=" + type + ", scores=" + scores + "]";
    }
    
    
}
 
