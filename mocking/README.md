# mocking

A runnable example of mocking in Spock.


## Overview

Spock's main spiel is its story around mocking the behavior of method calls at runtime. Spock actually calls this *stubbing*,
and I recommend you familiarize yourself with concepts and language in the [*Interaction Based Testing* section of the
official documentation](https://spockframework.org/spock/docs/2.3/all_in_one.html#interaction-based-testing). The documentation
is quite good.

It's important to note the Spock needs ByteBuddy (recommended) or Cglib (deprecated) to [mock classes](https://spockframework.org/spock/docs/2.3/all_in_one.html#_mocking_classes).


## Instructions

Follow these instructions to build and run the test suite.

1. Pre-requisite: Java 21
2. Run the test suite
    * ```bash
      ./gradlew test
      ```
    * The output is not interesting. Instead, study the code, change it, and experiment.
