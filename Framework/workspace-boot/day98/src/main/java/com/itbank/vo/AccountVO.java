package com.itbank.vo;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

/*
	IDX    NOT NULL NUMBER        
	USERID NOT NULL VARCHAR2(20)  
	USERPW NOT NULL VARCHAR2(128) 
	NICK   NOT NULL VARCHAR2(20)  
	EMAIL           VARCHAR2(80)  
	J_DATE          DATE
*/

@Getter
@Setter
public class AccountVO {
	public AccountVO(String userid, String hashpw) {
		this.userid=userid;
		this.userpw=hashpw;
	}
	private int idx;
	private String userid, userpw;
	private String nick, email;
	private Date j_date;
}
