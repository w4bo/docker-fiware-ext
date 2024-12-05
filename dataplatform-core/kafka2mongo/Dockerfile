FROM gradle:8.11.1-jdk17
COPY . /usr/src/myapp
WORKDIR /usr/src/myapp
CMD ["gradle", "runKafka2Mongo", "--stacktrace", "--scan"]
