package edu.spring.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDao {
	@Autowired
	JdbcTemplate jdbcTemplate = null;
	
//	public MemberDao(JdbcTemplate jdbcTemplate) {
//		this.jdbcTemplate = jdbcTemplate;
//	}

	public int insertMember(MemberDto memberDto) {
		String sql = "INSERT INTO JDBC_MEMBER VALUES (?, ?, ?, SYSDATE())";
		return jdbcTemplate.update(
				sql, 
				memberDto.getId(), memberDto.getPw(), 
				memberDto.getName());
	}
}







