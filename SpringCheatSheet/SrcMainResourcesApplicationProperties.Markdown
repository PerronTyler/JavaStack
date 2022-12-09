<!-- src/main/resources -->

<!-- WEB-INF -->
create a folder 
src -> main -> webapp -> WEB-INF
create your JSP files here

after creating WEB-INF folder go to src/main/resources

add
```java
spring.mvc.view.prefix=/WEB-INF/
```

<!-- MySql DB/Schema -->
```java
spring.datasource.url=jdbc:mysql://localhost:3306/<<YOUR_SCHEMA>>
spring.datasource.username=<<dbuser>>
spring.datasource.password=<<dbpassword>>
spring.jpa.hibernate.ddl-auto=update
```
<!-- hiddenmethos -->

```java
spring.mvc.hiddenmethod.filter.enabled=true
```
<!-- DOING A PUT METHOD In FORM -->
<input type="hidden" name="_method" value="put"> 