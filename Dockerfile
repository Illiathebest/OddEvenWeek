FROM openjdk:8-jre-alpine3.9

COPY target/OddEvenWeek-1.0-SNAPSHOT.jar /OddEvenWeek.jar

CMD ["java", "-jar", "/OddEvenWeek.jar"]