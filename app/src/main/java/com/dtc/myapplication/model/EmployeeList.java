package com.dtc.myapplication.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Tableau Objet JSON
 */
public class EmployeeList {

    @SerializedName("employeeList")
    private ArrayList<Employee> employeeList;

    public ArrayList<Employee> getEmployeeArrayList() {
        return employeeList;
    }

    public void setEmployeeArrayList(ArrayList<Employee> employeeArrayList) {
        this.employeeList = employeeArrayList;
    }
}
