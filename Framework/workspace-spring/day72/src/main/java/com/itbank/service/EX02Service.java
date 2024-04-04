package com.itbank.service;

import org.springframework.stereotype.Service;

import com.itbank.model.vo.AccountVO;

@Service
public class EX02Service {
	
	AccountVO acc=new AccountVO("itbank", "it", "아뱅");
	
	public String login(AccountVO input) {
		String msg="로그인 실팽";
		
		if(acc.equals(input)) {
			msg=acc.getNick()+"님 로그인 성공";
		}
		
		return msg;
	}

}
