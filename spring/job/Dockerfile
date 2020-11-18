FROM openjdk:15-jdk-alpine
COPY . .
RUN ./mvnw clean package -DskipTests
ARG JAR_FILE=target/*.jar
RUN cp ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]