

/**
 * Project Name:club 
 * File Name:ScoreHistory.java
 * Description: 
 * Copyright: Copyright (c) 2017 
 * Company:SAP
 * 
 * @author SAP
 * @date Oct 23, 2017 9:52:55 AM
 * @version 
 * @see
 * @since 
 */
 
package com.club.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
  * ClassName: ScoreHistory
  * Description: History of score.
  * @author SAP
  * @version 
  * @see
  * @since 
  */
@Entity
@Table(name = "score_history")
public class ScoreHistory implements Serializable
{

    
     /**  
     * serialVersionUID:Serial object to store in database.  
     * @see
     */
     
    private static final long serialVersionUID = -8317637782485080432L;
    
    
    
    
    /**
      * create an instance: ScoreHistory. 
      * Title: ScoreHistory
      * Description: 
      */
    
    public ScoreHistory()
    {
        super();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "open_id")
    private Users user;
    
    private Timestamp competitionDate;
    
    private String competitionName;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="game_type_id")
    private GameType gameType;
    
    private double score;




    public long getId()
    {
    
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public Users getUser()
    {
    
        return user;
    }

    public void setUser(Users user)
    {
        this.user = user;
    }

    public Timestamp getCompetitionDate()
    {
    
        return competitionDate;
    }

    public void setCompetitionDate(Timestamp competitionDate)
    {
        this.competitionDate = competitionDate;
    }

    public String getCompetitionName()
    {
    
        return competitionName;
    }

    public void setCompetitionName(String competitionName)
    {
        this.competitionName = competitionName;
    }

    public GameType getGameType()
    {
    
        return gameType;
    }

    public void setGameType(GameType gameType)
    {
        this.gameType = gameType;
    }

    public double getScore()
    {
    
        return score;
    }

    public void setScore(double score)
    {
        this.score = score;
    }

    @Override
    public String toString()
    {
        return "ScoreHistory [id=" + id + ", user=" + user + ", competitionDate=" + competitionDate + ", competitionName=" + competitionName
            + ", gameType=" + gameType + ", score=" + score + "]";
    }
    
    
    
}
 
