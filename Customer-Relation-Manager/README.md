## Customer Relation Manager
***
### Environment Setup
---
#### Install Software
+ Install Eclipse
+ Install MySQL MySQL -> Downloads -> Community -> Mac Version
+ Install MySQL workbench
+ Install Tomcat in Eclipse

#### Setup Database MySQL
+ Setup new DB in MySQL
	- Run script(01-create-user.sql) to create a new user
	- Run script(02-customer-tracker.sql) to create new db and table in it
+ Create a new Dynamic Web Project

#### Setup Spring and Hibernate
+ Setup Hibernate in Eclipse (This step should be replaced by Maven POM)
	- hibernate.org -> Hibernate ORM -> Download
	- MySQL -> Download -> Community -> MySQL Connector -> Connector/J -> download
	- Copy jar files from both downloaded files to WebContent -> WEB-INF -> lib
+ Test Connection
	- Keep MySQL running
	- Write TestDbServlet.java or TestJdbc.java and run on Tomcat to see success
+ Copy jar files from spring to lib
+ Configuration file for Spring and hibernate, that's in the lib -> web.xml



### Development
---
#### List Customers
+ Create Customer.java (package Entity)
+ Create CustomerDAO.java
	- Define DAO interface
	- Define DAO implementation
	- @Transaction: Spring prvides @Transaction annotation to automatically begin and end an transaction for your hibernate code
	- @Repository is applied to DAO implementation, and with that, Spring will automatically register the DAO implementation
+ Create CustomerController.java
+ Create jsp page: list-customers.jsp
+ Place CSS in a resource directory
+ Configure Spring to serve up resource directory
+ Reference CSS in your JSP

#### Add a Customer Layer
+ Define Service Interface
+ Define Service Implementation: Inject the customerDAO

#### Add Customer
+ Update list-customer.jsp
+ Create HTML for new customer
+ Process form data: controller -> service -> dao

#### Update Customer
+ Update list-customer.jsp, new update link
+ Create customer-form.jsp, prepopulate the form
+ Process form data

#### Delete Customer
+ Add "delete" link on JSP
+ Add code for delete