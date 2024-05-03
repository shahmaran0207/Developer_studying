package com.itbank.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itbank.components.SHA512;
import com.itbank.model.AccountDAO;
import com.itbank.vo.AccountVO;

@Service
public class AccountService {
	
	@Autowired
	private SHA512 sha;
	
	@Autowired
	private AccountDAO dao;
	
	public List<AccountVO> getAccounts() {
		return dao.selectAll();
	}

	@Transactional(readOnly = true)
	public AccountVO login(AccountVO user) {
		
		return dao.selectOne(user);
	}

	@Transactional(rollbackFor = Exception.class)
	public int signUp(AccountVO input) {
		return dao.insert(input);
	}
	
	public int update(AccountVO input) {
		return dao.update(input);
	}

	public int delete(int idx) {
		return dao.delete(idx);
	}
}