FROM gradle:8.14.5-jdk17
COPY . /usr/src/dataplatform-core
WORKDIR /usr/src/dataplatform-core/persistImages
CMD ["gradle", ":persistImages:runPersistImages", "--stacktrace", "--scan"]