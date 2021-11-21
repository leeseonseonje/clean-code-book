package clean.code.의미있는이름;

public class 검색하기_쉬운_이름을_사용하라 {

    /**
     * 이름이 단순하지만 그만큼 찾기가 어려워진다.
     * 그냥 5를 사용한다면 5가 들어가는 이름을 모두 찾은 후 의미를 분석해 원하는 상수를 가려내야 한다.
     */
    public void hardToSearchName(int[] t) {

        int s = 0;

        for (int j = 0; j < 34; j++) {
            s += (t[j] * 4) / 5;
        }
    }

    /**
     * 이름을 의미있게 지으면 함수가 길어진다.
     * 하지만 그만큼 찾기가 쉬워진다. (WORK_DAYS_PER_WEEK)
     */
    public void easyToSearchName(int[] taskEstimate) {

        final int WORK_DAYS_PER_WEEK = 5;
        final int NUMBER_OF_TASKS = 34;
        int realDaysPerIdealDay = 4;
        int sum = 0;

        for (int j = 0; j < NUMBER_OF_TASKS; j++) {
            int realTaskDays = taskEstimate[j] * realDaysPerIdealDay;
            int realTaskWeeks = (realTaskDays / WORK_DAYS_PER_WEEK);
            sum += realTaskWeeks;
        }
    }

}
