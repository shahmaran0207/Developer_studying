package com.itbank.vo;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

/*
	IDX      NOT NULL NUMBER        
	TITLE    NOT NULL VARCHAR2(150) 
	USER_IDX          NUMBER  
	CONTENTS NOT NULL CLOB          
	V_COUNT           NUMBER        
	W_DATE            DATE
	
	NICK     NOT NULL VARCHAR2(20)
*/

@Getter
@Setter
public class BoardVO {
	private int idx, user_idx, v_count;
	private String title, contents, nick;
	private Date w_date;
}
