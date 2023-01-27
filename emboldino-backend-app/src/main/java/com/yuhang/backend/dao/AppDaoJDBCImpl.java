package com.yuhang.backend.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.yuhang.backend.domain.ArtWork;

@Repository
public class AppDaoJDBCImpl implements AppDao {
	
	@Autowired
    private JdbcTemplate jdbcTemplate;

	@Override
	public List<ArtWork> retrieveAllArtWorks() {
		return this.jdbcTemplate.query(
				"SELECT ID, SUBJECT, DESCRIPTION, URL, STYLE, TYPE, PRICE FROM ART_WORK",
				(ResultSet rs, int rowNum) -> new ArtWork(
													rs.getLong("ID"),
													rs.getString("SUBJECT"),
													rs.getString("DESCRIPTION"),
													rs.getString("URL"),
													rs.getString("STYLE"),
													rs.getString("TYPE"),
													rs.getDouble("PRICE")) );
	
	}

	@Override
	public long createArtWork(ArtWork artWork) {
		KeyHolder keyHolder = new GeneratedKeyHolder();
		this.jdbcTemplate.update(
				new PreparedStatementCreator() {
					@Override
					public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
						PreparedStatement ps = con.prepareStatement("INSERT INTO ART_WORK (SUBJECT, DESCRIPTION, URL, STYLE, TYPE, PRICE) VALUES(?, ?, ?, ?, ?, ?)", new String[] {"ID"});
						ps.setString(1, artWork.getSubject());
						ps.setString(2, artWork.getDescription());
						ps.setString(3, artWork.getUrl());
						ps.setString(4, artWork.getStyle());
						ps.setString(5, artWork.getType());
						ps.setDouble(6, artWork.getPrice());
						return ps;
					}
				},
				keyHolder);
		return keyHolder.getKey().longValue();
	}

}
