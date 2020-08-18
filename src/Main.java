public class Main {
    public static void main(String[] args) {
        Employee[] emp = new Employee[6];
        emp[0] = new SalariedEmployee(1, "osman", 23.1, 30.00);
        emp[1] = new SalariedEmployee(2, "konur", 244.1, 35.00);
        emp[2] = new HourlyEmployee(3, "boran", 23.1, 30.00, 77.34);
        emp[3] = new HourlyEmployee(1, "turgut", 23.1, 30.00, 56.77);
        emp[4] = new CommissionedEmployee(1, "bamsi", 23.1, 30.00, 4123.65);
        emp[5] = new CommissionedEmployee(1, "ertugrul", 23.1, 30.00, 7654.09);
        for (int i = 0; i < emp.length; i++) {
            System.out.println(emp[1].toString());


        }
    }
}
