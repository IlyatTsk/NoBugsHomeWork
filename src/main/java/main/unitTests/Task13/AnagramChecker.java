package main.unitTests.Task13;

import java.util.Arrays;

public class AnagramChecker {

    public static boolean isAnagram(String firstString, String secondString) {
        if (firstString == null || secondString == null) return false;

        char[] firstArr = firstString.toLowerCase().replaceAll("\\s", "").toCharArray();
        char[] secondArr = secondString.toLowerCase().replaceAll("\\s", "").toCharArray();

        Arrays.sort(firstArr);
        Arrays.sort(secondArr);

        return Arrays.equals(firstArr, secondArr);
    }
}
