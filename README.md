# Springbootbasiccrud
I have done this project using Intell ij IDE

1.Firstly intialize all the dependencies required for the springboot project

#1. In spring intiazer include dependies which include
         1.Springdata jpa
         2.Spring web
         3.LOMBOK
         4.MYSQL driver
         
 #2.Later download that zip file and extract it in intel ij
 
 3.So as for requirement start coding Where i have used entity.java
 here in entity.java i have written the code for product entities and used getter and setter method and few annotations
 
 #4.I have used repository here i have selected interface and extended jpa repository
 For connecting the database i have used application.properties:
 spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
 
         ** spring.datasource.url = jdbc:mysql://127.0.0.1:3306/harika
          
          spring.datasource.username = root
          
          spring.datasource.password = tiger
          
          spring.jpa.show-sql = true
          
          spring.jpa.hibernate.ddl-auto = update
          
          spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL8Dialect
          
          server.port=9191**
I have used **workbenh MYSQL** for database part
I have given port number as 9191 
So for testing i have used **postman**
          
 
