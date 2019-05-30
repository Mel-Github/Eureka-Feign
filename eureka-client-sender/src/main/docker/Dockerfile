FROM openjdk:8-alpine
RUN groupadd -g 999 appuser && useradd -r -u 999 -g appuser appuser
USER appuser
EXPOSE 8080
COPY maven /maven/
ADD https://get.aquasec.com/microscanner .
RUN chmod +x microscanner
RUN ./microscanner YjU3Yzk3OTBiMzk4
CMD java -jar /maven/eureka-client-0.0.1-SNAPSHOT.jar
