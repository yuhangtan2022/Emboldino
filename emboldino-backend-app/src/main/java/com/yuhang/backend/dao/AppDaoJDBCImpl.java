package com.yuhang.backend.dao;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.yuhang.backend.domain.ArtWork;

@Repository
public class AppDaoJDBCImpl implements AppDao {
	
	@Autowired
    private JdbcTemplate jdbcTemplate;

	@Override
	public List<ArtWork> retrieveAllArtWorks() {
		return this.jdbcTemplate.query(
				"SELECT ID, SUBJECT, DESCRIPTION, STYLE, TYPE, PRICE FROM ART_WORK",
				(ResultSet rs, int rowNum) -> new ArtWork(
													rs.getLong("ID"),
													rs.getString("SUBJECT"),
													rs.getString("DESCRIPTION"),
													rs.getString("STYLE"),
													rs.getString("TYPE"),
													rs.getDouble("PRICE")) );
	
	}

}
