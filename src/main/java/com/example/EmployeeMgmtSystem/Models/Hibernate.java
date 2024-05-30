package com.example.EmployeeMgmtSystem.Models;

public class Hibernate {
	//In Spring Boot, the spring.jpa.hibernate.ddl-auto property in the application.properties
	//file is used to specify the behavior of Hibernate in managing the database schema.
	//It configures the data definition language (DDL) mode for Hibernate, which affects 
	//how Hibernate interacts with the database schema at startup.
//	The spring.jpa.hibernate.ddl-auto property can take several values, each with a different
//	impact on the database schema. These values are:
//
//	none:  No schema changes are made.
	
//	validate: Checks the schema against the entity definitions and throws an error if there 
//	are discrepancies.
//		This ensures that the schema matches the entities but does not alter the schema.
//		If the new entered schema does'nt match the existing schema, then it will create Exception
//		but it won't validate.	
//	spring.jpa.hibernate.ddl-auto=validate, Hibernate will check that the schema matches the 
//	entity definitions but will not make any changes to the schema. If there are discrepancies,
//	an exception is thrown.
	
//	update: Update the schema. Hibernate will attempt to alter the database schema to 
//		match the entities, without dropping data.
//	spring.jpa.hibernate.ddl-auto=update, Hibernate will update the existing schema to match
//	the current entity definitions. This is useful for preserving existing data while making 
//	schema adjustments.
	
//	create: Drops existing tables and creates new ones, resulting in data loss.
//	spring.jpa.hibernate.ddl-auto=create, Hibernate will drop all existing tables and create 
//	new ones each time the application starts. This is useful during development when you 
//	need a fresh schema but is not suitable for production due to data loss.
	
//	create-drop: Creates the schema at startup and drops it at shutdown, useful for testing.
//	When spring.jpa.hibernate.ddl-auto=create-drop, Hibernate will create the schema at startup
//	and drop it when the application shuts down. This is useful for testing purposes where you 
//	want a clean schema for each test run.
	
//	Sequence Tables
//	Sequence Table: A table used to generate unique identifiers.
//	employee_seq: Used to generate IDs for the Employee table.
//	manager_seq: Used to generate IDs for the Manager table.
//	How Sequence Tables Work
//	Initialization: When Hibernate initializes, it drops existing sequence tables and recreates them.
//	Generating IDs: Each time a new Employee or Manager is created, Hibernate queries the sequence table to get the next available ID.
//	Inserting Rows: Hibernate uses the retrieved ID for the new row in the respective table.
	
//	Sequence tables (employee_seq, manager_seq) are used by Hibernate to generate unique
//	primary key values for the Employee and Manager entities when using GenerationType.AUTO. 
//	-- For Employee
//	UPDATE employee_seq SET next_val = next_val + 1;
//	SELECT next_val FROM employee_seq;
}
