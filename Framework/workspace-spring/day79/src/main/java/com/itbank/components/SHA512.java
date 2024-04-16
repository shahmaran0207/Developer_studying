package com.itbank.components;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.stereotype.Component;

@Component // Spring bean으로는 등록하고 싶은데 MVC 패턴과는 관련없을 때 사용함
public class SHA512 {
	public String getHash(String pw) {

		MessageDigest md;
		try {
			md = MessageDigest.getInstance("sha-512");

			md.reset();
			md.update(pw.getBytes());

			String hashPw = String.format("%0128x", new BigInteger(1, md.digest()));
			return hashPw;
			
		} catch (NoSuchAlgorithmException e) {}

		return null;

	}
}