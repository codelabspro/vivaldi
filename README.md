# vivaldi

Project Management tool written using SpringBoot.

# SpringBoot 
Has the following characteristics :

- Opinionated

- Convention over configuration

- Standalone

- Production ready


## Environment Requirements

==> java -version
java version "1.8.0_131"
Java(TM) SE Runtime Environment (build 1.8.0_131-b11)
Java HotSpot(TM) 64-Bit Server VM (build 25.131-b11, mixed mode)
~/repos/ad/githubrepos/vivaldi (master) 

==> echo $JAVA_HOME
/Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home
~/repos/ad/githubrepos/vivaldi (master) 

==> mvn -v
Apache Maven 3.5.0 (ff8f5e7444045639af65f6095c62210b5713f426; 2017-04-03T15:39:06-04:00)
Maven home: /usr/local/Cellar/maven/3.5.0/libexec
Java version: 1.8.0_131, vendor: Oracle Corporation
Java home: /Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home/jre
Default locale: en_US, platform encoding: UTF-8
OS name: "mac os x", version: "10.12.6", arch: "x86_64", family: "mac"

## Steps
> Initialize mvn project 
```
==> mvn archetype:generate -DgroupId=com.codesdk \
   -DartifactId=vivaldi \
   -DarchetypeArtifactId=maven-archetype-quickstart \
   -DinteractiveMode=false
```

> Add the following to pom.xml before the closing </project> tag
```
   <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>1.4.2.RELEASE</version>
   </parent>

   <dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
   </dependencies>


  <properties>
    <java class="version">1.8</java>
  </properties>
```

// ------------------------------------------------------------------------

> Run mvn clean install
```
==> mvn clean install
```
> This should end with build success 

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 25.470 s
[INFO] Finished at: 2018-02-08T02:19:29-05:00
[INFO] Final Memory: 29M/271M


// ------------------------------------------------------------------------
 
- Add @SpringBootApplication annotation to App.java class

// ------------------------------------------------------------------------

- Add the following import to App class
import org.springframework.boot.SpringApplication;

// ------------------------------------------------------------------------

- Call the SpringApplication.run(App.class, args) method in main(String[] args) 


// ------------------------------------------------------------------------

- Tell SpringBoot to start the app, create a Servlet container and host the app in a Servlet container


- Run mvn clean install

==> mvn clean install

This should end with build success 

// ------------------------------------------------------------------------

- Run using mvn spring-boot:run

This should start running the app :

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v1.4.2.RELEASE)

// ------------------------------------------------------------------------


 Create the following WelcomeController class as follows

 package com.codesdk.welcome;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @RequestMapping("/welcome")
    public String sayHi() {
        return "hi";
    }

}


// ------------------------------------------------------------------------

Add CategoryController 


package com.codesdk.category;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {

    @RequestMapping("/categories")
    public String getAllCategories() {
        return "All Categories";
    }

}

// ------------------------------------------------------------------------

Create a Category class as follows :

