import org.gradle.api.tasks.testing.logging.TestLogEvent

plugins {
    java
    groovy
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform(libs.groovy.bom))
    testImplementation(platform(libs.spock.bom))
    testImplementation(libs.groovy)
    testImplementation(libs.spock.core)
    testRuntimeOnly(libs.byte.buddy)
}

tasks {
    test {
        useJUnitPlatform()
    }
}
