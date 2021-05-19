FROM openjdk:8-alpine

COPY target/uberjar/crux-luminus.jar /crux-luminus/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/crux-luminus/app.jar"]
