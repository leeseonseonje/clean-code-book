package clean.code.주석;

public class 코드로_의도를_표현하라 {

    public 코드로_의도를_표현하라() {

        /**
         * 주석으로 의미를 표현 (X)
         */
        // 직원에게 복지 혜택을 받을 자격이 있는지 검사한다.
        if ((employee.flags & HOURLY_FLAG) &&
            (employy.age > 65));


        /**
         * 코드로 의미를 표현 (O)
         */
        if (employee.isEligibleForFullBenefits()) {}
    }
}
