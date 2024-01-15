FROM openjdk:11-alpine
ENTRYPOINT ["/usr/bin/user-service.sh"]

COPY user-service.sh /usr/bin/user-service.sh
COPY target/user-service.jar /usr/share/user-service/user-service.jar
