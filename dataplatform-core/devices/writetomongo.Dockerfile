#FROM openjdk:13
FROM gradle:7.6.4-jdk17
COPY . /usr/src/myapp
WORKDIR /usr/src/myapp
CMD ["gradle", "runWriteToMongo", "--stacktrace", "--scan"]
