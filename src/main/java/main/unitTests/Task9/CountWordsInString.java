package main.unitTests.Task9;

public class CountWordsInString {

    public int countWords(String sentence) {
        return sentence.trim().isEmpty() ? 0 : sentence.split("\\s+").length;
    }
}
