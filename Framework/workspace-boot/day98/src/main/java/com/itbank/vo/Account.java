package com.itbank.vo;

import java.sql.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString
public class Account {
	private int idx; 
	private String userid, userpw, nick, email;
	private Date j_date;

}
