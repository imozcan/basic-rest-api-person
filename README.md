# Basic REST API - Person Info

This is a simple Spring Boot RESTful API project. It includes two endpoints to return user information, with the current timestamp injected using a prototype-scoped `LocalDateTime` bean.

## Technologies Used
- Java 17+
- Spring Boot
- Spring Web
- Lombok
- Maven

## How It Works

This project demonstrates:
- `@GetMapping` usage with query parameters.
- Returning custom DTOs.
- Spring Bean injection with a `LocalDateTime` prototype bean to inject request-time timestamps.

## Endpoints

### 1. `/dev/api/person`

Returns full person info.

#### Example Request:

GET http://localhost:4545/dev/api/person?name=John&nickname=Johnny&email=john@example.com&phone=1234567890&age=30


#### Example Response:
``` json
{
  "name": "John",
  "nickname": "Johnny",
  "email": "john@example.com",
  "phone": "1234567890",
  "age": 30,
  "dateTime": "2025-06-22T21:30:15.367899"
}
``` 


### 2. /dev/api/basicPerson

Returns a simplified person object with only name, nickname, and age. Email and phone default to “Unknown”.

#### Example Request:

GET http://localhost:4545/dev/api/basicPerson?name=Jane&nickname=Janey&age=25

```json
{
  "name": "Jane",
  "nickname": "Janey",
  "email": "Unknown",
  "phone": "Unknown",
  "age": 25,
  "dateTime": "2025-06-22T21:30:15.367899"
}
``` 

### Project Structure:
```
src/
└── main/
    └── java/
        └── com/
            └── example/
                └── userInfo/
                    ├── controller/
                    │   └── PersonController.java
                    ├── configuration/
                    │   └── DateTimeConfig.java
                    └── dto/
                        └── Person.java
```

 ## Configuration

In application.properties:

```properties
spring.application.name=basic-rest-api-person
server.port=4545
```

📝 License

This project is licensed under the MIT License.

