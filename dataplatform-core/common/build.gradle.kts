plugins {
    kotlin("jvm") version "2.0.21"
}

group = "it.unibo"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.github.microutils:kotlin-logging-jvm:3.0.5")
    implementation("org.slf4j:slf4j-api:2.0.16")
    implementation("org.json:json:20240303")
    implementation("org.apache.kafka:kafka-clients:3.9.0")
    implementation("org.jetbrains.kotlinx:kotlinx-cli:0.3.6")
}

kotlin {
    jvmToolchain(11)
}