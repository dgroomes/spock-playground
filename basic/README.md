# basic

This is a "Hello World"-style Spock test suite.


## Overview

This is a minimal runnable example of a Spock test suite and the prerequisite environment configuration. There is quite
a bit to configure from dependency management, Groovy support, and optionally test logging configuration. Spock also has
official examples that you should check out in the [GitHub repository `spockframework/spock-example`](https://github.com/spockframework/spock-example).


## Instructions

Follow these instructions to build and run the test suite.

1. Pre-requisite: Java 21
2. Run the test suite
    * ```bash
      ./gradlew test
      ```
    * It should look like the following.
    * ```text
      $ ./gradlew test
      
      > Task :test
      
      BasicSpecification > addition PASSED
      
      BasicSpecification > add via Adder PASSED
      ```
     * Because Gradle has a task caching feature, it will actually consider your test task to be "up-to-date" if you run
       the `test` task again and the tests won't be run. To force Gradle to run the test suite again, use the `cleanTest`
       task.
