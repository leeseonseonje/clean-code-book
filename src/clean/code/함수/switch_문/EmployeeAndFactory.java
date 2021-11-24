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
                    return new CommissionedEmployee(record);
                case HOURLY:
                    return new HourlyEmployee(record);
                case SALARIED:
                    return new HourlEmployee(record);
                default:
                    throw new Exception("Error");
            }

        }
    }

    /**
     * sample
     */
    class Money {}
    static class EmployeeRecord {
        Type type;
        enum Type { COMMISSIONED, HOURLY, SALARIED }
    }
    class CommissionedEmployee extends Employee {
        EmployeeRecord record;
        public CommissionedEmployee(EmployeeRecord record) { this.record = record; }
        @Override
        public boolean isPayday() { return false; }
        @Override
        public Money calculatePay() { return null; }
        @Override
        public void deliveryPay(Money pay) {}
    }
    class HourlyEmployee extends Employee {
        EmployeeRecord record;
        public HourlyEmployee(EmployeeRecord record) {
            this.record = record;
        }
        @Override
        public boolean isPayday() { return false; }
        @Override
        public Money calculatePay() { return null; }
        @Override
        public void deliveryPay(Money pay) {}
    }
    class HourlEmployee extends Employee {
        EmployeeRecord record;
        public HourlEmployee(EmployeeRecord record) { this.record = record; }
        @Override
        public boolean isPayday() { return false; }
        @Override
        public Money calculatePay() { return null; }
        @Override
        public void deliveryPay(Money pay) {}
    }


}
