package com.itbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.components.SHA512;
import com.itbank.model.AccountDAO;
import com.itbank.model.vo.AccountVO;

@Service
public class AccountService {
	
	@Autowired
	private AccountDAO dao;
	
	@Autowired	//바로 아래것에만 적용됨 -> 매번 적어야 함
	private SHA512 hash;

	public List<AccountVO> getAccounts() {
		return dao.selectAll();
	}

	public AccountVO login(AccountVO user) {
		String pw=user.getUserpw();
		user.setUserpw(hash.getHash(pw));
		
		return dao.selectOne(user);
	}
	
	public AccountVO logout(AccountVO user) {
		return dao.selectOne(user);
	}
	
	public int addAccount(AccountVO user) {
		String pw=user.getUserpw();
		user.setUserpw(hash.getHash(pw));
		
		return dao.insert(user);
	}
	
	//수정, findpw
}