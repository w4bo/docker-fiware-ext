FROM gradle:8.14.5-jdk17
COPY . /usr/src/dataplatform-core
WORKDIR /usr/src/dataplatform-core/kafka2mongo
CMD ["gradle", ":kafka2mongo:runKafka2Mongo", "--stacktrace", "--scan"]

