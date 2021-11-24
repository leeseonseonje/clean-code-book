package clean.code.함수.switch_문;

public class Payroll {

    class Money {}

    static class Employee {
        Type type;
        enum Type {
            COMMISSIONED, HOURLY, SALARIED
        }

    }

    /**
     * 문제점
     * 1. 함수가 길다 (새 직원 유형을 추가하면 더 길어진다.)
     * 2. '한 가지' 작업만 수행하지 않는다.
     * 3. SRP위반 (코드를 변경할 이유가 여럿이기 때문이다.)
     * 4. OCP위반 (새 직원 유형을 추가할 때마다 코드를 변경하기 때문이다.)
     * 5. 위 함수와 구조가 동일한 함수가 무한정 존재한다는 사실이다.
     */
    public Money calculatePay(Employee employee) throws Exception {

        switch (employee.type) {
            case COMMISSIONED:
                calculateCommissionedPay(employee);
            case HOURLY:
                calculateHourlyPay(employee);
            case SALARIED:
                calculateSalariedPay(employee);
            default:
                throw new Exception(String.valueOf(employee.type));
        }
    }

    public void calculateCommissionedPay(Employee employee) {}
    public void calculateHourlyPay(Employee employee) {}
    public void calculateSalariedPay(Employee employee) {}
}
