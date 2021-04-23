package co.interleap.courses.tdd;

public class VowelCounter {
    public int count(String inputString) {
        int count = 0;

        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == 'a' ||
                inputString.charAt(i) == 'e' ||
                inputString.charAt(i) == 'i' ||
                inputString.charAt(i) == 'o' ||
                inputString.charAt(i) == 'u'
            ) {
                count++;
            }
        }

        return count;
    }
}
