# README #

Spring Boot + Togglz demo accompanying source code for blog post at http://tech.asimio.net/2018/05/31/Adding-Feature-Toggles-to-Spring-Boot-applications-using-Togglz.html

### Requirements ###

* Java 8
* Maven 3.2.x

### Building the artifact ###

```
mvn clean package
```

### Running the application from command line ###

```
mvn spring-boot:run
```

### Available URLs

```
curl -v "http://localhost:8080/api/demo-cms/0"
curl -v "http://localhost:8080/api/demo-es/0
curl -v "http://localhost:8080/api/demo-someservice/0"
```
should result in successful responses. 

### Who do I talk to? ###

* orlando.otero at asimio dot net
* https://www.linkedin.com/in/ootero
