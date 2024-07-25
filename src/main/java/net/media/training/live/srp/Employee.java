package net.media.training.live.srp;


public class Employee {
    private final int empId;
    private static final int TOTAL_LEAVES_ALLOWED = 30;
    private double monthlySalary;
    private String name;
    private Address address;
    private int leavesTaken;
    private String manager;
    private int yearsInOrg;
    private int[] leavesLeftPreviously;


    public Employee(int empId, double monthlySalary, String name, Address address, int leavesTaken, int[] leavesLeftPreviously) {
        this.empId = empId;
        this.monthlySalary = monthlySalary;
        this.name = name;
        this.address = address;
        this.leavesTaken = leavesTaken;
        this.leavesLeftPreviously = leavesLeftPreviously;
        this.yearsInOrg = leavesLeftPreviously.length;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public int getRemainingLeaves(){
        return Employee.TOTAL_LEAVES_ALLOWED - leavesTaken;
    }

    public int getTotalLeaveLeftPreviously(){
        int years = 3;
        if (yearsInOrg < 3) {
            years = yearsInOrg;
        }
        int totalLeaveLeftPreviously = 0;
        for (int i = 0; i < years; i++) {
            totalLeaveLeftPreviously += leavesLeftPreviously[yearsInOrg-i-1];
        }
        return totalLeaveLeftPreviously;
    }

    public double getAnnualSalary(){
        return 12*monthlySalary;
    }

    public String getManager() {
        return manager;
    }
}
