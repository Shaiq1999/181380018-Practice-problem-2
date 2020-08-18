public class CommissionedEmployee extends Employee {
    private double sales;
    private double commissionRate;

    public CommissionedEmployee(int empId, String name, double taxRate, double sales, double commissionRate) {
        super(empId, name, taxRate);
        this.sales = sales;
        this.commissionRate = commissionRate;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }
    @Override
    public String toString() {
        return "CommissionedEmployee{" +
                "salary of "+getName()+"  is "+calculateSalary();
    }


    public double calculateHourlyate()
    {
        double grossRate=getSales()+getCommissionRate();
        double tax=grossRate+getTaxRate();
        return tax=grossRate;
    }
}
