import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.10"
    id("org.sonarqube") version "3.0"
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test-junit5"))
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.7.0")
}

tasks.test {
    useJUnitPlatform()
    testLogging {
        events("passed", "skipped", "failed")
    }
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}

sonarqube {
    properties {
        property("sonar.projectKey", "adrianotelesc_bel-challenges")
        property("sonar.organization", "adrianotelesc")
        property("sonar.host.url", "https://sonarcloud.io")
    }
}