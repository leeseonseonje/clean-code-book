package clean.code.의미있는이름;

public class 의미_있는_맥락을_추가하라 {

    /**
     * 맥락이 불분명한 변수
     */
    private void printGuessStatistics(char candidate, int count) {

        String number;
        String verb;
        String pluralModifier;

        if (count == 0) {
            number = "no";
            verb = "are";
            pluralModifier = "s";
        } else if (count == 1) {
            number = "1";
            verb = "is";
            pluralModifier = "";
        } else {
            number = Integer.toString(count);
            verb = "are";
            pluralModifier = "s";
        }

        String guessMessage = String.format(
                "There %s %s %s%s", verb, number, candidate, pluralModifier
        );
        System.out.println("guessMessage = " + guessMessage);
    }

    /**
     * 맥락이 분명한 변수
     */
    class GuessStatisticsMessage {

        private String number;
        private String verb;
        private String pluralModifier;

        public String make(char candidate, int count) {
            createPluralDependentMessageParts(count);
            return String.format(
                    "There %s %s %s%s",
                    verb, number, candidate, pluralModifier
            );
        }

        private void createPluralDependentMessageParts(int count) {
            if (count == 0) {
                thereAreNoLetters();
            } else if (count == 1) {
                thereIIsOneLetters();
            } else {
                thereAreManyLetters(count);
            }
        }

        private void thereAreManyLetters(int count) {
            number = Integer.toString(count);
            verb = "are";
            pluralModifier = "s";
        }

        private void thereIIsOneLetters() {
            number = "1";
            verb = "is";
            pluralModifier = "";
        }

        private void thereAreNoLetters() {
            number = "no";
            verb = "are";
            pluralModifier = "s";
        }
    }
}
