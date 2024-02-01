package dgroomes.spockplayground.mocking

import spock.lang.Specification

class MockingSpecification extends Specification {

    def "a story from boring trivia facts"() {
        given:
        def triviaTeller = new TriviaTeller()
        def storyTeller = new StoryTeller(triviaTeller)

        when:
        def story = storyTeller.tellStory()

        then:
        story.contains("Once upon a time")
        story.contains("The sky is blue")
        story.contains("The earth is round")
    }

    def "a story from interesting (mocked) trivia facts"() {
        given:
        def triviaTeller = Mock(TriviaTeller)
        def storyTeller = new StoryTeller(triviaTeller)

        when:
        def story = storyTeller.tellStory()

        then:
        // Let's mock the TriviaTeller to return some more interesting trivia facts.
        triviaTeller.getTriviaFact() >> [
                "The speed of light can round the Earth 7.5 times in one second",
                "The Eiffel Tower can be 15 cm taller during the summer"]

        story.contains("Once upon a time")
        story.contains("speed of light")
        story.contains("Eiffel Tower")
    }
}
