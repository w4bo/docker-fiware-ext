FROM gradle:8.7.0-jdk17
COPY . /usr/src/myapp
WORKDIR /usr/src/myapp
CMD ["gradle", "runKafka2Mongo", "--stacktrace", "--scan"]
