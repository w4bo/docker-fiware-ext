plugins {
    kotlin("jvm") version "2.0.21"
}

group = "it.unibo"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.github.cdimascio:dotenv-kotlin:6.5.0")
    implementation(project(":common"))
    testImplementation(kotlin("test"))
}

tasks.register<JavaExec>("persistImages") {
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