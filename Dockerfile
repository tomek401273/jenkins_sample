FROM adoptopenjdk/maven-openjdk11:latest
WORKDIR /home/tomek
COPY . .
CMD ["mvn", "spring-boot:run"]