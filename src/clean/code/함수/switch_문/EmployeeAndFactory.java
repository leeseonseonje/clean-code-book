package clean.code.함수.switch_문;

public class EmployeeAndFactory {

    public abstract class Employee {

        public abstract boolean isPayday();

        public abstract Money calculatePay();

        public abstract void deliveryPay(Money pay);
    }

    public interface EmployeeFactory {
        public Employee makeEmployee(EmployeeRecord record) throws Exception;
    }

    class EmployeeFactoryImpl implements EmployeeFactory {

        @Override
        public Employee makeEmployee(EmployeeRecord record) throws Exception {
            switch (record.type) {
                case COMMISSIONED:
                    return new CommissionedEmployee(r);
                case HOURLY:
                    return new HourlyEmployee(r);
                case SALARIED:
                    return new HourlEmployee(r);
                default:
                    throw new Exception("");
            }

        }
    }


}
