# SpringBootMVCCRUDFramework
Spring Boot MVC Junit CRUD Operation Framework
Step_01

Create a Table - Sequence for ID and add a Trigger

Step_02

Maven Depedency to POM.XML

spring-boot-starter-jdbc
spring-boot-starter-web
spring-boot-starter-thymeleaf
ojdbc8

plugin - Maven plugin - To make executable jar

spring-boot-maven-plugin

Application.properties file for Oracle properties

spring.datasource.url=jdbc:oracle:thin:@localhost:1521:orcl
spring.datasource.username=hr
spring.datasource.password=password
logging.level.root=INFO
spring.datasource.driver-class-name=oracle.jdbc.OracleDriver
spring.jpa.database-platform=org.hibernate.dialect.Oracle10gDialect

Class Diagram

Domain Model Class - Create a class, that we will have columns from the table
and create getter setter methods

Data Access Object Class - Create a class for CRUD operations using JDBC Template

Create methods for each operation

Create list method, bean row mapper, class instance and pass the class as object
using JdbcTemplate.SQL , map the values returened from the sql to the list variable and return the
list variable

Create a Model View Class - Model / View pages / Controller



Java main class to run Spring boot application 

DAO Juint Test Class

Right click on the DAO class and create the Junit test
& Configure the jdbc connection
& create a new instance
& pass the POJO class
& execute


