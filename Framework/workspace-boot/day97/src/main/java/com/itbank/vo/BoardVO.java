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
public class BoardVO {
	private int idx, v_count, user_idx;
	private String title, contents;
	private Date w_date;
}
