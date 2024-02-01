package dgroomes.spockplayground.mocking;

import java.util.List;

/**
 * A toy class that produces trivia facts.
 */
public class TriviaTeller {

    private int index = 0;

    private final List<String> boringFacts = List.of(
            "The sky is blue",
            "The earth is round",
            "The sun is hot",
            "The moon is cold");


    String getTriviaFact() {
        if (index >= boringFacts.size()) index = 0;
        return boringFacts.get(index++);
    }
}
