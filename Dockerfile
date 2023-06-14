FROM openjdk:8
MAINTAINER NGUYEN_HOANG_ANH <anhh34711@gmail.com>
ADD ./target/demo-0.0.1-SNAPSHOT.jar /app/

ENTRYPOINT ["java", "-Xmx200m", "-jar", "/app/demo-0.0.1-SNAPSHOT.jar"]
EXPOSE 8088