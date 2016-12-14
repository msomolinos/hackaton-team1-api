FROM docker.pibenchmark.com/pi-java:8
MAINTAINER Ian Polding <ian@p-i.net>
EXPOSE 8080
EXPOSE 8001

ADD target/team1-api-*.jar app.jar

# You can use a RUN command to "touch" the jar file so that it has a file modification time (Docker creates all container files in an "unmodified" state by default).
# This actually isn’t important for the simple app that we wrote, but any static content (e.g. "index.html") would require the file to have a modification time.
RUN bash -c 'touch /app.jar'

# To reduce Tomcat startup time we added a system property pointing to "/dev/urandom" as a source of entropy.
ENTRYPOINT ["java",  \
            "-Xms256m", \
            "-Djava.security.egd=file:/dev/./urandom", \
            "-jar", "/app.jar"]
