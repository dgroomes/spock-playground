package dgroomes.spockplayground.basic

import spock.lang.Specification

class BasicSpecification extends Specification {

    def "addition"() {
        expect:
        2 + 2 == 4
    }

    /**
     * This is overly simple but it shows the typical "given, when, then" structure of a Spock test.
     */
    def "add via Adder"() {
        given:
        def adder = new Adder(2)

        when:
        adder.add(3)

        then:
        adder.sum == 5
    }
}
