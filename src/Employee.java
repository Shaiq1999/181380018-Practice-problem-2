import java.util.Set;

public class Employee {




    private int empId;
    private String name;
    private double taxRate;
    public Employee()
    {
        setEmpId(1);
        setName("shaiq");
        setTaxRate(11.1);


    }
    public Employee(int empId, String name, double taxRate) {
        this.empId = empId;
        this.name = name;
        this.taxRate = taxRate;
    }
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }



    public double calculateSalary(){
        return 0.0;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", taxRate=" + taxRate +
                "salary is "+calculateSalary();
                }
    }





