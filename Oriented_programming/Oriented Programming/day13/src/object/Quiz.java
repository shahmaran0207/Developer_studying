package object;

import java.util.Scanner;

/*
	Account 클래스를 작성
	- 필드는 id, pw, nick를 가짐
	- 미리 Account 인스턴스를 하나 생성
	- 사용자에게 id, pw를 입력받아서 account 인스턴스를 하나 생성
	- 사용자에게 입력 받아서 만든 인스턴스와 미리 생성해둔 인스턴스의 id, pw가 같으면 로그인 성공을 출력
	- id나 pw가 다르면 로그인 실패 출력
 */


class Account {
	private String name;
	private String pw;
	private String nick;


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((pw == null) ? 0 : pw.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pw == null) {
			if (other.pw != null)
				return false;
		} else if (!pw.equals(other.pw))
			return false;
		return true;
	}
	
	public String getNick() {
		return this.nick;
	}

	Account(String name, String pw) {
		this.name=name;
		this.pw=pw;
	}
	Account(String name, String pw, String nick){
		this(name,  pw);
		this.nick=nick;
	}
}

public class Quiz {
	public static void main(String[] args) {
		String id, pw;
		Account store=new Account("itbank", "it12", "아뱅");	

		Scanner sc=new Scanner(System.in);
		System.out.print("아이디를 입력하세요: ");
		id=sc.next();
		System.out.print("비밀번호를 입력하세요: ");
		pw=sc.next();
		Account user=new Account(id, pw);

		if(store.equals(user)) System.out.println(store.getNick()+"님 로그인 성공");
		else System.out.println("id혹은 pw가 일치하지 않습니다.");
		sc.close();
	}
}
