package clean.code.함수;

public class 명령과_조회를_분리하라 {
    /**
     * 이 함수는 이름이 attribute인 속성을 찾아 값을 value로 설정한 후 성공하면 true를 반환하고 실패하면 false를 반환한다.
     */
    public boolean set(String attribute, String value) { return true; }

    public 명령과_조회를_분리하라() {
        if (set("username", "unclebob")) {
            /**
             * username이 unclebob으로 설정되어 있는지? 인가,
             * username을 unclebob로 설정하는 코드인가?
             * 무슨뜻인지 코드만 봐서는 의미가 모호하다.
             */
        }

        /**
         * 진짜 해결책은 '명령'과 '조회'를 분리하는 방법이다.
         */
        if (attributeExists("username")) {
            setAttribute("username", "unclebob");
        }
    }



    /**
     * sample
     */
    public boolean attributeExists(String attribute) { return true; }

    public void setAttribute(String attribute, String value) {}
}
