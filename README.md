# Getting Started

* In the Terminal, `cd` to your 'kafka_VERSION' folder
* Follow the [Kafka Quickstart](https://kafka.apache.org/quickstart) to start Zookeeper and Kafka broker
* Run this project in IntelliJ and watch the integrated terminal for the sample message
* You can also POST a message via the REST API at *http://localhost:8080/api/messages*

```json
{
    "message": "hello from Postman"
}
```

* Additionally, run the Kafka console consumer to listen to messages from topic 'kit'

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.0.0/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.0.0/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.0.0/reference/htmlsingle/#web)
* [Spring for Apache Kafka](https://docs.spring.io/spring-boot/docs/3.0.0/reference/htmlsingle/#messaging.kafka)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

