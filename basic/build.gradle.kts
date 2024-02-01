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
}

tasks {
    test {
        // Since Spock 2.0, Spock is built on top of the JUnit 5 platform. We have to tell Gradle to use JUnit 5 to find
        // and run the tests. "useJUnitPlatform" means "use JUnit 5".
        useJUnitPlatform()

        testLogging {
            // By default, Gradle logs only failed tests but for the demo we want visual confirmation that all the tests
            // ran.
            events(TestLogEvent.PASSED, TestLogEvent.FAILED, TestLogEvent.SKIPPED)
        }
    }
}
