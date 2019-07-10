package edu.spring.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
	@Autowired
	MemberDao memberDao;

	public int addMember(MemberDto memberDto) {
		return memberDao.insertMember(memberDto);
	}
}