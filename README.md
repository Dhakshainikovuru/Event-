# Database

The application uses MySQL + JPA/Hibernate.

## Database

```sql
CREATE DATABASE decor_aggregator;
```

The Spring Boot application automatically creates/updates the tables using:

```properties
spring.jpa.hibernate.ddl-auto=update
```

Tables:
- `decorators`
- `bookings`

Sample decorator records are automatically inserted when the database is empty.

## If your MySQL password is different

Edit:

`backend/src/main/resources/application.properties`

Change:

```properties
spring.datasource.username=root
spring.datasource.password=root
```
