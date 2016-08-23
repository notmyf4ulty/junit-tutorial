package com.catnbearsoftware.app.WritingATests;

class EmployeeDetails {

    private String name;
    private double monthlySalary;
    private int age;

    /**
     * @return the name
     */

    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */

    void setName(String name) {
        this.name = name;
    }

    /**
     * @return the monthlySalary
     */

    double getMonthlySalary() {
        return monthlySalary;
    }

    /**
     * @param monthlySalary the monthlySalary to set
     */

    void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    void setAge(int age) {
        this.age = age;
    }
}