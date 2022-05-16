package com.bridgelabz.ProgramOnEmployeeWage;

public class EmployeeWage {

    double x;
    int y,z;
    int Wage_PerHour = 20;
    int FullDay_Hour = 8;
    int HalfDay_Hour = 4;
    int DayCount = 1;
    int WorkingHour, TotalWage;

    public  void isPresent() {
            while (DayCount <= 20 && WorkingHour <= 100) {
                x = (int) (Math.random() * 10) % 3;
                System.out.println(x);
                switch ((int) x) {
                    case 1:
                        System.out.println("Employee is Present");
                        y = Wage_PerHour * FullDay_Hour;
                        WorkingHour = WorkingHour + FullDay_Hour;
                        System.out.println("Total Working Hour for a Day is : " + WorkingHour);
                        System.out.println("Total Wage for a Day is : " + y);
                        break;
                    case 2:
                        System.out.println("Employee is Present for Half Day");
                        z = Wage_PerHour * HalfDay_Hour;
                        WorkingHour = WorkingHour + HalfDay_Hour;
                        System.out.println("Total Working hour for a day " + WorkingHour);
                        System.out.println("Total Wage for a Day is : " + z);
                        break;
                    default:
                        System.out.println("Employee is Absent");
                        System.out.println("Total Wage for a Day is 0");
                }
                TotalWage = TotalWage + z;
                System.out.println("Total Wage for a Day is : " + TotalWage);
                DayCount = DayCount++;
            }
        System.out.println("Day Count is : " + (DayCount-1));
        System.out.println("Total Wage for a Month is : " + TotalWage);
        System.out.println("Day Count : " + DayCount);
    }
    public static void main(String args[])
    {
        EmployeeWage emp = new EmployeeWage();
        emp.isPresent();
    }
}
