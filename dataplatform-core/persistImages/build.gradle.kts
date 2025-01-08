plugins {
    kotlin("jvm") version "2.0.21"
}

group = "it.unibo"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":common"))
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(11)
}