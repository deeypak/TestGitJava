package com.oops;

public class Employee {


    int empSalary;
    String empName;

    @Override
    public String toString() {
        return "Employee{" +
                "empSalary=" + empSalary +
                ", empName='" + empName + '\'' +
                '}';
    }

    public static void main(String[] args){

       /* Employee empRef = new  Employee();
        empRef.empName = "";
        empRef.empSalary = 0;
        System.out.println(empRef);*/


        Employees emp = new Employees();
        emp.setEmpName("");
        emp.setEmpSal(1000);
        System.out.println(emp.getEmpName());
        System.out.println(emp.getEmpSal());

    }


}
