package com.oops;

public class Employees {  // POJO (Plain Old Java Objects)

    private String empName;
    private int empSal;  // maintainability


    // flexibility of the code
    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        if(!empName.isEmpty()) {
            this.empName = empName;
        }else{
            System.out.println("Employee name is not valid");
        }
    }

    public int getEmpSal() {
        return empSal;
    }

    public void setEmpSal(int empSal) {
        this.empSal = empSal;
    }


    public void mangerLogic(){
        System.out.println("");
    }
}
