package com.net.webApp;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


class custDataAccessObjectClassTest {
	
	private custDataAccessObjectClass custDAO;

	@BeforeEach
	void setUp() throws Exception {
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
		dataSource.setUsername("hr");
		dataSource.setPassword("password");
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
		
		custDAO = new custDataAccessObjectClass(new JdbcTemplate(dataSource));
	}

	@Test
	void testList() {
		List<saleDomainModelClass> lstCust  = custDAO.list();
		assertTrue(lstCust.isEmpty());
	}

	@Test
	void testInsertRow() {
		
		saleDomainModelClass insertObj = new saleDomainModelClass("Robert",25,"1055 N Warson Road",120000);
		custDAO.insertRow(insertObj);
		
	}

	@Test
	void testGet() {
		
		int id = 1;
		saleDomainModelClass getemployeeId = custDAO.get(id);
		assertNotNull(getemployeeId);
	}

	@Test
	void testUpdateCust() {
		fail("Not yet implemented");
	}

	@Test
	void testDeleteCust() {
		fail("Not yet implemented");
	}

}
