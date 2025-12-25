FROM eclipse-temurin:17-jdk-jammy AS build

WORKDIR /app

COPY src ./src

RUN find /app/src -name "*.java" > /app/sources.txt

RUN mkdir -p /app/build/classes

RUN javac -d /app/build/classes @/app/sources.txt

RUN echo "Main-Class: SimpleAdminServer" > /app/MANIFEST.MF
RUN cd /app/build/classes && jar cmf /app/MANIFEST.MF /app/app.jar .

FROM eclipse-temurin:17-jre-alpine

WORKDIR /app

COPY --from=build /app/app.jar .

#COPY --from=build /app/lib ./lib

EXPOSE 3000

ENTRYPOINT ["java", "-jar", "app.jar"]