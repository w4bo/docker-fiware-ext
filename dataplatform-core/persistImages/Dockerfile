FROM gradle:9.7.1-jdk17
COPY . /usr/src/dataplatform-core
WORKDIR /usr/src/dataplatform-core/persistImages
CMD ["gradle", ":persistImages:runPersistImages", "--stacktrace", "--scan"]