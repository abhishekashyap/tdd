package co.interleap.courses.tdd;

import java.util.Locale;

public class VowelCounter {
    public int count(String inputString) {
        String inputStringLowerCase = inputString.toLowerCase();
        int count = 0;

        for (int i = 0; i < inputStringLowerCase.length(); i++) {
            if (inputStringLowerCase.charAt(i) == 'a' ||
                inputStringLowerCase.charAt(i) == 'e' ||
                inputStringLowerCase.charAt(i) == 'i' ||
                inputStringLowerCase.charAt(i) == 'o' ||
                inputStringLowerCase.charAt(i) == 'u'
            ) {
                count++;
            }
        }

        return count;
    }
}
