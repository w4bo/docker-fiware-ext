plugins {
    kotlin("jvm") version "2.1.10"
}

group = "it.unibo"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.github.cdimascio:dotenv-kotlin:6.5.0")
    implementation("org.json:json:20250107")
    implementation(project(":common"))
    testImplementation(kotlin("test"))
}

tasks.register<JavaExec>("runPersistImages") {
    description = "Run the persistImages service"
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("it.unibo.persistImages.PersistImages")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(11)
}