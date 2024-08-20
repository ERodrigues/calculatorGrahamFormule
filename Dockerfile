FROM maven
FROM eclipse-temurin

LABEL maintener="Eder Rodrigues <ederpr@gmail.com>"
LABEL version="1.0.0"
LABEL description="Imagem com aplicacao para calculo da formula da Graham"

WORKDIR /app
COPY . .
RUN mvn package

EXPOSE 8080

CMD [java -jar target/grahamFormule-0.0.1-SNAPSHOT.jar --spring.profiles.active=prod]