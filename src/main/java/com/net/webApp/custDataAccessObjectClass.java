package com.net.webApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class custDataAccessObjectClass {
	
	@Autowired
	
	private JdbcTemplate JdbcTemplate ;	
		
	public custDataAccessObjectClass(JdbcTemplate jdbcTemplate) {
		
		this.JdbcTemplate = jdbcTemplate;
	}

	//Method to read the data from POJO class
	
	public List<saleDomainModelClass> list() {
		
		String sql = "SELECT * FROM SPRING_CUST";
		
		List<saleDomainModelClass> lstCust = JdbcTemplate.query(sql, 
				BeanPropertyRowMapper.newInstance(saleDomainModelClass.class));
		
		return lstCust;
	}
	
	//Insert a row into a Database
	
	public void insertRow (saleDomainModelClass saleDomainModelClass) {
		
		SimpleJdbcInsert insert = new  SimpleJdbcInsert(JdbcTemplate);
		
		insert.withTableName("SPRING_CUST").usingColumns("ID","NAME","AGE","ADDRESS","SALARY");
		
		BeanPropertySqlParameterSource sqlparam = new BeanPropertySqlParameterSource(saleDomainModelClass);
		
		insert.execute(sqlparam);
		
				
	}
	
	//Save the specific record to the database
	
	public saleDomainModelClass get(int ID)
	{
		return null;
	}
	
	//Update the customer information 
	
	public void updateCust (saleDomainModelClass saleDomainModelClass)
	{
		
	}
	
	public void deleteCust (int id)
	{
		
	}
}
