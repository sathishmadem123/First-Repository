package com.springwebapp;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class BusDatabaseAccessor {
	
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void createTableInDb() {
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS buses (busName Varchar(100), location Varchar(100), ticketPrice INT)");
	}
	
	public int addBusDetails(Bus bus) {
		return jdbcTemplate.update("INSERT INTO buses (busName, location, ticketPrice) VALUES(?, ?, ?)", bus.getBusName(), bus.getLocation(), bus.getTicketPrice());
	}
	
	public List<Bus> getAllBusDetails() {
		return jdbcTemplate.query("SELECT * FROM buses", new BeanPropertyRowMapper<>(Bus.class));
	}
	
	public List<Bus> getBusDetailsWithLocation(String location) {
		return jdbcTemplate.query("SELECT * FROM buses WHERE location = ?", new BeanPropertyRowMapper<>(Bus.class), location);
	}
	
}
