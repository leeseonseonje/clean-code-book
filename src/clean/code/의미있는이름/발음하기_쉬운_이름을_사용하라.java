package clean.code.의미있는이름;

import java.util.Date;

public class 발음하기_쉬운_이름을_사용하라 {

    /**
     * 클래스, 변수명들이 한눈에 들어오지 않는다. 뭐가 뭔지 알 수 없음.
     */
    class DtaRcrd102 {
        private Date genymdhms;
        private Date modymdhms;
        private final String pszqint = "102";
        /* ... */
    }

    /**
     * 클래스, 변수명만봐도 무슨 뜻인지 정확히 알 수 있다.
     */
    class Customer {
        private Date generationTimestamp;
        private Date modificationTimestamp;
        private final String recordId = "120";
        /* ... */
    }
}