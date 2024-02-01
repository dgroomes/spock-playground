# spock-playground

📚 Learning and exploring the Spock testing framework.

> Spock is a testing and specification framework for Java and Groovy applications.
> 
> -- <cite>https://spockframework.org/spock/docs/2.3/all_in_one.html</cite>


## Overview

I generally prefer writing my Java-project tests in Java and using JUnit 5 and AssertJ. But, Spock- and Groovy-based
tests are pervasive and quite expressive and powerful in their own right. This repository is me learning Spock by
example. I'm hoping to explore tricky bits like dynamic proxies and how to configure all the dependencies correctly
(ByteBuddy?).


## Standalone subprojects

This repository illustrates different concepts, patterns and examples via standalone subprojects. Each subproject is
completely independent of the others and do not depend on the root project. This _standalone subproject constraint_
forces the subprojects to be complete and maximizes the reader's chances of successfully running, understanding, and
re-using the code.

The subprojects include:

### `basic/`

This is a "Hello World"-style Spock test suite.

See the README in [basic/](basic/).


## Wish List

General clean-ups, TODOs and things I wish to implement for this project:

* [x] DONE Implement a basic Spock test suite showcasing assertions, maybe unrolling, and basic mocking.
* [ ] Show a mocking-focused test suite showing more circuitous mocking and stubbing, which requires a byte code rewriting
  tool like ByteBuddy.
