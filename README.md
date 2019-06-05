# Spring API Quickstart <img src="https://cdn.auth0.com/blog/logos/spring-boot.png" width="40" height="40">

#### This boilerplate is intended to quickly spin up a simple API with a single endpoint that writes to a mysql database.


### The following dependencies are included
* springframework.boot' version 2.1.5.RELEASE
* flywaydb.flyway" version 5.2.4
* spring-boot-starter-web
* spring-boot-starter-data-jpa
* spring-boot-starter-actuator
* mysql-connector-java
* lombok:1.16.16

### Database setup
* Create mysql database named spring_starter or alter database urls in both the application.yml and config.groovy 
* You should not need to manual create any tables
* One flyway migration file is included (V1__initial_migration.sql)
* migrations can be run using ```./gradlew fC fM -Penv=local```

### Running the Application
* You may need to turn on annotation processing and install the Lombok plugin in your IDE
* ```./gradlew bootRun``` will start the application

### Controller endpoint 
* http://localhost:8080/api/v1/gettingStarted
* request payload
```
{
	"request": "LOL"
} 
```

