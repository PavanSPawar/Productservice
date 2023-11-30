FROM openJDK:11- JRE-slim
ADD target/custap.jar custap.jar
ENTRYPOINT["JAVA","-JAR","custap.jar"]
EXPOSE 8086
