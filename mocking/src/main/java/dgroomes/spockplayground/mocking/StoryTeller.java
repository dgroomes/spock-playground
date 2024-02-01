package dgroomes.spockplayground.mocking;

/**
 * A toy class that tells a story based on some random trivia.
 */
public class StoryTeller {

    private final TriviaTeller triviaTeller;

    public StoryTeller(TriviaTeller triviaTeller) {
        this.triviaTeller = triviaTeller;
    }

    public String tellStory() {
        String triviaFact = triviaTeller.getTriviaFact();
        String triviaFact2 = triviaTeller.getTriviaFact();
        return "Once upon a time, " + triviaFact + ". Then it became known that " + triviaFact2 + "! There's no more room for facts because that one was so interesting. Then end.";
    }
}
