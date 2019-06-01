# Library-api

Simple CRUD using a RESTfull application with Spring Boot REST Java 8 + JPA + DAO + Hibernate + MySQL.

The other part, frontend has not yet been implemented, but soon I hope to start it and make it available. 

In short, the backend is responsible for providing a web service that can be called through a URL and responding to what was requested in JSON.
 
# Technologies and Prerequisites
 * Java 1.8
 * Maven 3.3.9
 * Spring Tool Suite – Version 4-4.1.1 RELEASE
 * Spring Boot Start: 2.1.3.RELEASE
 * MVC
 * DAO
 * JPA

# Installing and Step to do

* **Create the Spring Boot project & add Dependencies**
    - There are two correct ways to create a Spring Boot project. You can use the STS Wizard, or by accessing the [Spring Initializr](https://start.spring.io/) website.
    

* **Model:**
    - Create DataModel Book
 
* **DAO:**
   - Create InterfaceBookDao
   - Create BookDaoImpl
 
* **Controller:**
   - Create Web Controller “BookController”
 
* **Service:**
   - Create Interface “InterfaceBookService”
   - Create class BookService implements InterfaceBookService

* **MySQL**
   - Create MySQL table 

* Run Spring Boot Application & Enjoy Result.

# Class and methods

* **Book** class corresponds to entity and table employee.

* **EmployeeRepository** is an interface extends CrudRepository, will be autowired in CustomerController for implementing repository methods and custom finder methods.

* **BookController** is a REST Controller which has request mapping methods for RESTful requests such as:
  - getBookById; 
  - getAllBooks;
  - addBook; 
  - updateBook;
  - deleteBook.
  
* Configuration for Spring Datasource properties in **application.properties**

* Dependencies for Spring Boot and MySQL in **pom.xml**

# application.properties

Configuration for Spring Datasource & JPA properties

```
spring.datasource.url=jdbc:mysql://localhost:3306/bookdb?useSSL=false
spring.datasource.username=root
spring.datasource.password=12xyz
spring.jpa.generate-ddl=true
```

# Our Spring Boot Server can work with MySQL Database and provides APIs:
```  
GET /api/books: get all books
GET /api/book/{id}: get a book by id
POST /api/book: save a book
PUT /api/book: update a book
DELETE /api//book/{id}: delete a book by id
```  

# Preparing the environment
  Spring Boot requires the following items:
* The [JDK](https://www.oracle.com/technetwork/pt/java/javase/downloads/jdk8-downloads-2133151.html) is the development kit for Java applications.

* The [Maven](https://maven.apache.org/download.cgi) which is the Java package manager. Maven comes down to reading the "pom.xml" file and synchronizing the dependencies your project uses. For example, if you need to use the Oracle adapter to connect to the database, it will be in pom.xml that we will add this dependency and the IDE will download all packages automatically. To install Maven, simply download, unzip somewhere in the system and add your path in the PATH environment variables,

* The [IDE](https://spring.io/tools) that has several facilities for the development of Spring Boot applications. We will use the STS (Spring Tool Suite), which is a modified Eclipse for Spring Boot. The download is right here. Just download and run ".exe"

# Database

* In this application uses MySql. You can only install MySql Server on the system, being accessible through the command line (shell). To install MySql, go to this [link](https://dev.mysql.com/downloads/installer/).
