package com.example.accessingdatamysql;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Log {
    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private Integer loginUserID;

    private String content;

    private String dateIn;

    public Integer getLoginUserID() {
        return loginUserID;
    }

    public String getDateIn() {
        return dateIn;
    }

    public void setDateIn(String dateIn) {
        this.dateIn = dateIn;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setLoginUserID(Integer loginUserID) {
        this.loginUserID = loginUserID;
    }
}
