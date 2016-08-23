package com.catnbearsoftware.app.WritingATests;

class EmpBusinessLogic {
    /**
     * Calculate the yearly salary of employee
     * @param employeeDetails Employee class.
     * @return Yearly salary.
     */
    double calculateYearlySalary(EmployeeDetails employeeDetails) {
        double yearlySalary = 0;
        yearlySalary = employeeDetails.getMonthlySalary() * 12;
        return yearlySalary;
    }

    /**
     * Calculate the appraisal amount of employee
     */
    double calculateAppraisal(EmployeeDetails employeeDetails) {
        double appraisal = 0;

        if(employeeDetails.getMonthlySalary() < 10000){
            appraisal = 500;
        }else{
            appraisal = 1000;
        }

        return appraisal;
    }
}