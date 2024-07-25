package net.media.training.live.srp;

public class EmployeeExporter {
    private Employee employee;

    public EmployeeExporter(Employee employee) {
        this.employee = employee;
    }

    public String toHtml() {
        String str = "<div>" +
                "<h1>Employee Info</h1>" +
                "<div id='emp" + employee.getEmpId() + "'>" +
                "<span>" + employee.getName() + "</span>" +
                "<div class='left'>" +
                "<span>Leave Left :</span>" +
                "<span>Annual Salary:</span>" +
                "<span>Manager:</span>" +
                "<span>Reimbursable Leave:</span>" +
                "</div>";
        str += "<div class='right'><span>" + employee.getRemainingLeaves() + "</span>";
        str += "<span>" + Math.round(employee.getAnnualSalary()) + "</span>";
        if (employee.getManager() != null) str += "<span>" + employee.getManager() + "</span>";
        else str += "<span>None</span>";
        str += "<span>" + employee.getTotalLeaveLeftPreviously() + "</span>";
        return str + "</div> </div>";
    }
}
