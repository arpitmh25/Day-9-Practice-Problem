package com.bridgelabz.day9;
public class EmployeWageCompany {
    public static final int IsFulltime = 1, IsPartTime = 2;
    public static int totalWage = 0;
    private static String company;
    int empRatePerHour, numOfWorkingDays, maxHrsPerMonth;

    EmployeWageCompany(String company, int empRatePerHour, int numOfWorkingDays, int maxHrsPerMonth) {
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHrsPerMonth = maxHrsPerMonth;
    }

    public void empCheck() {
        int workingDays = 0, empHrs = 0, totalHrs = 0, totalDailyWage = 0;
        while (workingDays < numOfWorkingDays && totalHrs < maxHrsPerMonth) {
            workingDays++;
            System.out.println("For DAY" + workingDays);
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IsFulltime:
                    System.out.println("Employee is present and worked full-time");
                    empHrs = 8;
                    break;
                case IsPartTime:
                    System.out.println("Employee is present and worked part-time");
                    empHrs = 4;
                    break;
                default:
                    System.out.println("Employee is absent");
                    empHrs = 0;
            }
            totalDailyWage = empHrs * empRatePerHour;
            System.out.println("Daily employee wage is " + totalDailyWage);
            totalHrs = totalHrs + empHrs;
            totalWage = totalWage + totalDailyWage;
        }
        System.out.println("Total Wage of " + EmployeWageCompany.company + "'s employees in a month = " + EmployeWageCompany.totalWage);

    }


    public static void main(String[] args) {
        System.out.println("Workdone by Dmart Employee");
        EmployeWageCompany dmart = new EmployeWageCompany("D-MART", 20, 5, 10);
        dmart.empCheck();
        System.out.println("Workdone by Reliance Employee");
        EmployeWageCompany reliance = new EmployeWageCompany("RELIANCE", 10, 4, 20);
        reliance.empCheck();
        System.out.println("Workdone by Future Retail Employee");
        EmployeWageCompany futureRetail = new EmployeWageCompany("FutureRetail", 25, 6, 8);
        futureRetail.empCheck();

    }
}